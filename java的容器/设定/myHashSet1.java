package test9;


import java.util.HashSet;
import java.util.Set;



/***
 * HashSet�ĵײ���ͨ��HashMap������ʵ�ֵģ�valueֵ��һ��Object�Ķ���
 * ��Ҳ������������޷��ظ���������ص�
 * ���Ľ���Ǹ���Collection
 * map = new HashMap<>();
 * @author ������
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
		se.add("f");//�޷��ظ�
		se.remove("fa");
		System.out.println(se.size());
		System.out.println(se.isEmpty());
		System.out.println(se);
		
	}
	

}
