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
		System.out.println(a.get(22));					//获取键值对
		System.out.println(a.isEmpty());				//是否为空
		System.out.println(a.containsKey(24));			//是否包含这个key
		System.out.println(a.containsValue("afdsa"));	//是否包含这个值
		System.out.println(a.size());					//键值对的数量
		a.putAll(a1);									//将a1包含的所有t都放在a中，相同的进行更新，是否重复是根据eauals方法进行判断的
		System.out.println(a);
		
		
		
	}
	
}
