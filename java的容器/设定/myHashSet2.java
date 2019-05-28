package test9;

import java.util.HashMap;
/***
 * 手动搭建一个HashSet的项目
 * @author starwang
 *
 * @param <E>
 */

public class myHashSet2<E> {
	private static final Object ob = new Object() ;
	HashMap<E, Object> map;
	
	
	public myHashSet2() {
		map = new HashMap<E, Object>();
	}
	public void append(E key) {
		map.put(key, ob);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		map.keySet(); 
		for (E ss : map.keySet()) {
			sb.append(" "+ss+ ",");
		}
		sb.deleteCharAt(1);
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}
	public static void main(String[] args) {
		myHashSet2<Integer> a = new myHashSet2<Integer>();
		a.append(12);
		a.append(2322);
		a.append(55);
		System.out.println(a);
	}
	

}
