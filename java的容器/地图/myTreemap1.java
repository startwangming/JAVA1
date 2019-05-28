package test9;

import java.util.Map;
import java.util.TreeMap;

/***
 *HashMap的使用和底层原理
 *Compareable的使用（接口）
 *一般情况下ThreeMap的使用是在需要排序的时候才会使用，并且ThreeMap是效率比较低的
 *
 *
 * @author 王明星
 *
 */
public class myTreemap1 {
	public static void main(String[] args) {
		Map<Integer, String> aa = new TreeMap<Integer, String>();
		aa.put(11, "asfsaf");
		aa.put(14, "asfsaf");
		aa.put(15, "asfsaf");
		aa.put(13, "asfsaf");
		aa.put(12, "asfsaf");
		System.out.println(aa);//添加的时候是自动排序的
		Emp aaa1 = new Emp(1, "王", 21); 
		Emp aaa2 = new Emp(2, "李", 24); 
		Emp aaa3 = new Emp(3, "张", 23); 
		Emp aaa4 = new Emp(4, "宋", 24); 
		Map<Emp, String> aa2 = new TreeMap<Emp, String>();
		
	}
}

class Emp implements Comparable<Emp>{

	Integer number;
	String name;
	Integer age;
	
	
	
	public Emp(Integer a, String st, Integer ss) {
		super();
		this.number = a;
		this.name = st;
		this.age = ss;
	}



	@Override
	public int compareTo(Emp o) {
		if(this.age>o.age) {
			return 1;
		}else if(this.age<o.age) {
			return -1;
		}else {
			if(this.number>o.number) {
				return 1;
				
			}else if(this.number<o.number) {
				return -1;
			}else {
				return 0;
			}
		}
		
	}
	
}

