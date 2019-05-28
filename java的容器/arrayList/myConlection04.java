package test9;
/***
 * 增加索引的检查功能
 * @author 王明星
 *
 * @param <E>
 */
public class myConlection04 <E>{
	  Object[] element;
	  private static final int DEFAULT_SIZE=10;
	  public int size;

	  
	  
	  public myConlection04() {
		  element = new Object[DEFAULT_SIZE];
	  }
	  
	  
	  public myConlection04 (int length_array) {
		  if(length_array<0) {
			  throw new RuntimeException("length_array不能为负数；length_array:"+length_array);
		  }else if (length_array == 0) {
			  element = new Object[DEFAULT_SIZE];
		  }else if (length_array>0) {
			  element = new Object[length_array];
		  }
	  }
	  
	  
	  public void add(E str) {	
		
		  if (size == element.length) {
			Object[] newelemrnt = new Object[size+(size>>1)];
			System.arraycopy(element, 0, newelemrnt, 0, size);
			element = newelemrnt;
		}
		  element[size++]=str;
	  }
	  
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
			element[size++] = element[size-1];
			System.arraycopy(element, index, element, index+1, element.length-index);
		}finally {
			 
		}
		  
		 	element[index]=str;
	  }
	  
	  
	  public void printLength() {
		  System.out.println(element.length);
	  }
	  
	  
	  public void printSize() {
		  System.out.println(size);
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
		  myConlection04<Integer> itg= new myConlection04<Integer>();
		  for (int i = 0; i < 30; i++) {
			itg.add(i); 
		}
		  itg.add(22, 10);
		  System.out.println(itg);
		
	}
}
