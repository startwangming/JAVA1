package test9;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;



/***
  * ����+����Ľṹ
  * ���飺��ѯ�ٶȿ�  ռ�ÿռ�����
  * ����ɾ�����޸Ľ�Ϊ����  ռ�ÿռ䲻����  �����������ֻ�Ǵ���next��ֵ��������
 *Hash�㷨���ǽ�Hash����ȵķ�Χ16����֮�䣬ʹ���ǵ�ɢ�зֲ����Ӿ���
 *Hashֵ�Ǿ���hash�㷨�ĵ���ֵ�����Ծ����洢��λ��
 *
 *
 *HashTable:	�̲߳���ȫ������Ч�ʸ�  ����key  value Ϊnull
 *HashMap:		�̰߳�ȫ������Ч�ʲ��ߣ������synchronized�ؼ��֣�	 ������key value Ϊnull
 *
 *
 *HashMap���ɵ�ʱ�򣬾ͻ����HashCode�룬Ȼ�󽫹�ϣ�����ɢ�е��㷨�����Եĵõ�һ��Hashֵ������֮�󣬾ͻ�ȷ�����put�Ĵ洢λ�ã��������ͬ��Hashֵ�û����ͻᣬ�����Ƿ����˶�Ӧ�Ĵ���ֵ��next�ĺ��棬�������γ���һ��С�͵�����������������ǳ���һ��������ʱ��ͻ�����ߵĺ���������JDK8�Ժ����ǳ���8�ͺ������ת��Ϊ��ڶ����������д洢�����ļӿ��˴洢��Ч��
 *HashMap�ں�HashTable�ڽ�����ʱ�򣬶���ͨ����λͰ���顱�����н�����,��Լ������2�ı�����һ��Ϊ16�����飬���Ե�����ȥ��ȡ���hashcode��key��ʱ��ʵ�ֻ�ȡ����hashcode�����м��㣬Ȼ���ҵ����ǲ���equal�ķ����ҵ��Ǹ�Ԫ�أ�����true��
 *java�涨���������ͬ�Ļ�������HashCode�ͻ���ͬ
 *���ݵ����⣬����������0.75��ʱ�򣬾ͻ���д����½���copy
 *@author ������
 *
 */
public class myHashMap2 {
	
	public static void main(String[] args) {
		Map<Integer, String> a = new HashMap<Integer, String>();
		a.put(1001, "adf");
		System.out.println(a.hashCode());
		Map<Integer, String> ss = new Hashtable<Integer, String>();
		
		/***
		 * ���ĵĴ�����������Nodeһ��
		 */
		
	}

}
/***
 * ���ĵĴ�����������Nodeһ��
 */
//static class Node<K,V> implements Map.Entry<K,V> {
//    final int hash;
//    final K key;
//    V value;
//    Node<K,V> next;
//
//    Node(int hash, K key, V value, Node<K,V> next) {
//        this.hash = hash;
//        this.key = key;
//        this.value = value;
//        this.next = next;
//    }
//
//    public final K getKey()        { return key; }
//    public final V getValue()      { return value; }
//    public final String toString() { return key + "=" + value; }
//
//    public final int hashCode() {
//        return Objects.hashCode(key) ^ Objects.hashCode(value);
//    }
//
//    public final V setValue(V newValue) {
//        V oldValue = value;
//        value = newValue;
//        return oldValue;
//    }
//
//    public final boolean equals(Object o) {
//        if (o == this)
//            return true;
//        if (o instanceof Map.Entry) {
//            Map.Entry<?,?> e = (Map.Entry<?,?>)o;
//            if (Objects.equals(key, e.getKey()) &&
//                Objects.equals(value, e.getValue()))
//                return true;
//        }
//        return false;
//    }
//}
