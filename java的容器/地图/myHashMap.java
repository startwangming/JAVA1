package test9;

import java.util.HashMap;
import java.util.Map;

public class myHashMap {
	public static void main(String[] args) {
		Map<Integer, String> a = new HashMap<Integer, String>();
		a.put(23, "af");
		a.put(22, "afdsa");
		a.put(24, "afdsa");
		a.put(25, "afdsa");
		Map<Integer, String> a1 = new HashMap<Integer, String>();
		a.put(23, "afdsa");
		a.put(22, "afdsa");
		a.put(26, "afdsa");
		a.put(25, "afdsa");
		
		System.out.println(a);
		System.out.println(a.get(22));					//��ȡ��ֵ��
		System.out.println(a.isEmpty());				//�Ƿ�Ϊ��
		System.out.println(a.containsKey(24));			//�Ƿ�������key
		System.out.println(a.containsValue("afdsa"));	//�Ƿ�������ֵ
		System.out.println(a.size());					//��ֵ�Ե�����
		a.putAll(a1);									//��a1����������t������a�У���ͬ�Ľ��и��£��Ƿ��ظ��Ǹ���eauals���������жϵ�
		System.out.println(a);
		
		
		
	}
	
}
