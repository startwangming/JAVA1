package test9;

/***
 * ���һ��index�Ƿ�Խ����жϣ���һЩ�����ķ���
 * @author starwang
 *
 * @param <E>
 */
public class myConlecction05<E> {
	Object[] element;
	  private static final int DEFAULT_SIZE=10;
	  public int size;

	  /**
	   * Ĭ��Ϊ10�Ĵ�С
	   */
	  public myConlecction05() {
		  element = new Object[DEFAULT_SIZE];
	  }
	  
	  
	  /**
	   *���������Ĵ�С
	   * @param length_array
	   */
	  public myConlecction05 (int length_array) {
		  if(length_array<0) {
			  throw new RuntimeException("length_array����Ϊ������length_array:"+length_array);
		  }else if (length_array == 0) {
			  element = new Object[DEFAULT_SIZE];
		  }else if (length_array>0) {
			  element = new Object[length_array];
		  }
	  }
	  
	  
	  /**
	   * ���һ�����ݣ��ڵײ�
	   * @param str
	   */
	  public void add(E str) {	
		
		  if (size == element.length) {
			Object[] newelemrnt = new Object[size+(size>>1)];
			System.arraycopy(element, 0, newelemrnt, 0, size);
			element = newelemrnt;
		}
		  element[size++]=str;
	  }
	  
	  
	  
	  /**
	   * ��ȡĳ��δ֪�Ĳ���
	   * @param index
	   * @return
	   */
	  public Object getElement(int index) {
		  if (index>size||index<0) {
			  throw new RuntimeException("������Χ��"+size+"index"+index);
		}
		  return element[index]; 
	  }
	  
	  
	  
	  /**
	   * ȥ��ĳ��λ�õĲ���
	   * @param index
	   */
	  public void remove(int index){
		  System.arraycopy(element, index+1, element, index, size-index);	  
	  }
	  
	  
	  /**
	   * �ж��Ƿ�Ϊ������
	   * @return
	   */
	  public Boolean isEmpty(){
		  return size == 0;
	  }
	  
	  
	  /**
	   * ����λ��ȥ��������
	   * @param str
	   * @param index
	   */
	  public void add(E str,int index) {	
		  if(index>=element.length) {
			  throw new RuntimeException("����������Χ��index"+index);
		  }
		  if (size == element.length||index+1 >= element.length) {
			Object[] newelemrnt = new Object[element.length+(element.length>>1)];
			System.arraycopy(element, 0, newelemrnt, 0, size);
			element = newelemrnt;
		}
		  
		  try {
			  element[size++] = element[size-1];
			  System.arraycopy(element, index, element, index+1, size-index); 
				 
		} catch (Exception e) {
			Object[] newelemrnt = new Object[element.length+(element.length>>1)];
			System.arraycopy(element, 0, newelemrnt, 0, size);
			element = newelemrnt;
			element[size] = element[size-1];
			System.arraycopy(element, index, element, index+1, size-index);
		}finally {
			 
		}
		  
		 	element[index]=str;
	  }
	  
	  /**
	   * ������������
	   * @return
	   */
	  public int length() {
		  return element.length;
	  }
	  
	  
	  /**
	   * ����size
	   * @return
	   */
	  public int size() {
		  return size;
	  }
	  
	  
	  @Override
	public String toString() {
//		  System.out.print("[");
//		  for(Object aaa:element) {System.out.print(" "+aaa+" ");};
//		  System.out.println("]");
//		  return "";
////		  
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(element[i]+",");
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
//		
	}
	  
	
	  public static void main(String[] args) {
		  myConlecction05<Integer> itg= new myConlecction05<>();
		  for (int i = 0; i < 30; i++) {
			itg.add(i); 
		}
		  itg.remove(3);
		  System.out.println(itg.isEmpty());
		  System.out.println(itg);
		
	}

}
