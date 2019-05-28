package test9;

import java.util.Set;
import java.util.TreeSet;

/***
 * 测试ThreeSet的方法和排序
 * Comparable的使用
 * @author 王明星
 *
 */
public class myThreeSet {
	public static void main(String[] args) {
		Set<Emp2> it = new TreeSet<Emp2>();
		it.add(new Emp2(111, "wang", 3000));
		it.add(new Emp2(112, "ang", 66000));
		it.add(new Emp2(113, "ng", 7000));
		it.add(new Emp2(114, "g", 32000));
		System.out.println(it);
		
		
	}
}
class Emp2 implements Comparable<Emp2>{
	Integer id;
	String name;
	Integer salay;
	
	

	public Emp2(Integer id, String name, Integer salay) {
		super();
		this.id = id;
		this.name = name;
		this.salay = salay;
	}
	@Override
	public int compareTo(Emp2 o) {
		if(this.salay>o.salay) {
			return 1;
		}else if(this.salay<o.salay) {
			return -1;
		}else {
			if(this.id>o.id) {
				return 1;
			}else if(this.id<o.id) {
				return -1;
			}else {
				return 0;
			}
		}
	}
	@Override
		public String toString() {
			return "id:"+id+"name:"+name+"salay"+salay;
		}
	
	
}
