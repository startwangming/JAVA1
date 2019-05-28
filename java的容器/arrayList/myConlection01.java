package test9;
/***
 * 增加一些基本的方法
 * add
 * toString
 * @author starwang
 *
 */
public class myConlection01 {
	private Object[] element;
	  private static final int DEFAULT_SIZE=10;
	  private int size;

	  
	  
	  public void add(Object str) {
		  element[size++] = str;
	  }
	  
	  
	  public void setChart(int index, Object ob) {
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
	  
	  
	  public myConlection01() {
		  element = new Object[DEFAULT_SIZE];
	  }
	  
	  
	  public myConlection01 (int length_array) {
		  element = new Object[length_array];
	  }
	  
	  
	  public static void main(String[] args) {
//			myConlection01 myc1 = new myConlection01(20);
//			myc1.add("王agdg");
//			myc1.add("王hadhgf");
//			myc1.add("王hsfg");
//			myc1.add("liusdfsadfdsafdfsafass");
//			System.out.println(myc1);
					
			StringBuilder st = new StringBuilder();
			st.append("王agdg");
			st.append("王hadhgf");
			st.append("王hsfg");
			st.append("liu");
			System.out.println(st.length());
		
			
			
		}
}
