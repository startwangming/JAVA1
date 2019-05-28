package test9;
/***
 * 增加了泛型
 * @author starwang
 *
 * @param <E>
 */
public class myConlection02 <E> {
	private Object[] element;
	  private static final int DEFAULT_SIZE=10;
	  private int size;

	  
	  
	  public void add(E str) {
		  element[size++] = str;
	  }
	  
	  
	  public void printLength() {
		  System.out.println(element.length);
	  }
	  
	  
	  public void setChart(int index, E ob) {
		element[index] = ob;
	}
	  
	  @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(element[i]+",");
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
		
	}
	  
	  
	  public myConlection02() {
		  element = new Object[DEFAULT_SIZE];
	  }
	  
	  
	  public myConlection02 (int length_array) {
		  element = new Object[length_array];
	  }

}
