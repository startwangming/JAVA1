package test9;



/***
 * 增加自动扩容,的处理
 * @author 王明星
 *
 * @param <E>
 */
public class myConlection03<E> {
	Object[] element;
	  private static final int DEFAULT_SIZE=10;
	  public int size;

	  
	  
	  public myConlection03() {
		  element = new Object[DEFAULT_SIZE];
	  }
	  
	  
	  public myConlection03 (int length_array) {
		  element = new Object[length_array];
	  }
	  
	  public void add(E str) {	
		  if (size == element.length) {
			Object[] newelemrnt = new Object[size+(size>>1)];
			System.arraycopy(element, 0, newelemrnt, 0, size);
			element = newelemrnt;
		}
		  element[size++]=str;
	  }
	  
	  
	  public void printLength() {
		  System.out.println(element.length);
	  }
	  
	  
	  public void printSize() {
		  System.out.println(size);
	  }
	  
	  
	  @Override
	public String toString() {System.out.print("[");
//		  for(Object aaa:element) {System.out.print(" "+aaa+" ");};
//		  System.out.println("]");
//		  return "";
		  
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(element[i]+",");
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
		
	}
	  
	
	  public static void main(String[] args) {
		
	}

}
