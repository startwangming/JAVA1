package test9;

/***
 * 添加一个index是否越界的判断，和一些基本的方法
 * @author starwang
 *
 * @param <E>
 */
public class myConlecction05<E> {
	Object[] element;
	  private static final int DEFAULT_SIZE=10;
	  public int size;

	  /**
	   * 默认为10的大小
	   */
	  public myConlecction05() {
		  element = new Object[DEFAULT_SIZE];
	  }
	  
	  
	  /**
	   *输入容器的大小
	   * @param length_array
	   */
	  public myConlecction05 (int length_array) {
		  if(length_array<0) {
			  throw new RuntimeException("length_array不能为负数；length_array:"+length_array);
		  }else if (length_array == 0) {
			  element = new Object[DEFAULT_SIZE];
		  }else if (length_array>0) {
			  element = new Object[length_array];
		  }
	  }
	  
	  
	  /**
	   * 添加一个内容，在底部
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
	   * 提取某个未知的参数
	   * @param index
	   * @return
	   */
	  public Object getElement(int index) {
		  if (index>size||index<0) {
			  throw new RuntimeException("超出范围："+size+"index"+index);
		}
		  return element[index]; 
	  }
	  
	  
	  
	  /**
	   * 去除某个位置的参数
	   * @param index
	   */
	  public void remove(int index){
		  System.arraycopy(element, index+1, element, index, size-index);	  
	  }
	  
	  
	  /**
	   * 判断是否为空容器
	   * @return
	   */
	  public Boolean isEmpty(){
		  return size == 0;
	  }
	  
	  
	  /**
	   * 根据位置去增加内容
	   * @param str
	   * @param index
	   */
	  public void add(E str,int index) {	
		  if(index>=element.length) {
			  throw new RuntimeException("引索超出范围：index"+index);
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
	   * 返回容器长度
	   * @return
	   */
	  public int length() {
		  return element.length;
	  }
	  
	  
	  /**
	   * 返回size
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
