package test9;

import java.util.Map;
import java.util.TreeMap;

/***
 *HashMap��ʹ�ú͵ײ�ԭ��
 *Compareable��ʹ�ã��ӿڣ�
 *һ�������ThreeMap��ʹ��������Ҫ�����ʱ��Ż�ʹ�ã�����ThreeMap��Ч�ʱȽϵ͵�
 *
 *
 * @author ������
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
		System.out.println(aa);//��ӵ�ʱ�����Զ������
		Emp aaa1 = new Emp(1, "��", 21); 
		Emp aaa2 = new Emp(2, "��", 24); 
		Emp aaa3 = new Emp(3, "��", 23); 
		Emp aaa4 = new Emp(4, "��", 24); 
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

