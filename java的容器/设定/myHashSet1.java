package test9;


import java.util.HashSet;
import java.util.Set;



/***
 * HashSet的底层是通过HashMap来进行实现的，value值是一个Object的对象，
 * 这也就造成了他们无法重复和排序的特点
 * 他的借口是根据Collection
 * map = new HashMap<>();
 * @author 王明星
 *
 */
public class myHashSet1 {
	public static void main(String[] args) {
		Set<String> se = new HashSet<String>();
		se.add("fasdfa");
		se.add("f");
		se.add("fa");
		se.add("fas");
		se.add("fasd");
		se.add("fasdf");
		se.add("f");//无法重复
		se.remove("fa");
		System.out.println(se.size());
		System.out.println(se.isEmpty());
		System.out.println(se);
		
	}
	

}
