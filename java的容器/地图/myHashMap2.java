package test9;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;



/***
  * 数组+链表的结构
  * 数组：查询速度快  占用空间连续
  * 链表：删除和修改较为快速  占用空间不连续  但是这个链表只是带有next的值，的链表
 *Hash算法，是将Hash码均匀的氛围16个数之间，使他们的散列分布更加均匀
 *Hash值是经过hash算法的到的值，可以决定存储的位置
 *
 *
 *HashTable:	线程不安全，但是效率高  允许key  value 为null
 *HashMap:		线程安全，但是效率不高（添加了synchronized关键字）	 不允许key value 为null
 *
 *
 *HashMap生成的时候，就会产生HashCode码，然后将哈希码进行散列的算法，可以的得到一个Hash值，这样之后，就会确定这个put的存储位置，如果有相同的Hash值得话，就会，将他们放在了对应的存在值得next的后面，这样就形成了一个小型的链表，但是如果当他们超过一定数量的时候就会产生边的很慢，所以JDK8以后将他们超过8和后的链表转化为红黑二叉树，进行存储，大大的加快了存储的效率
 *HashMap在和HashTable在建立的时候，都是通过“位桶数组”来进行建立的,大约建立了2的倍数，一般为16个数组，所以当我们去获取这个hashcode的key的时候，实现获取他的hashcode来进行计算，然后找到他们并且equal的方法找到那个元素，返回true，
 *java规定如果两个相同的话，他的HashCode就会相同
 *扩容的问题，当他超过了0.75的时候，就会进行从新新建和copy
 *@author satrwang
 *
 */
public class myHashMap2 {
	
	public static void main(String[] args) {
		Map<Integer, String> a = new HashMap<Integer, String>();
		a.put(1001, "adf");
		System.out.println(a.hashCode());
		Map<Integer, String> ss = new Hashtable<Integer, String>();
		
		/***
		 * 核心的代码就如下面的Node一样
		 */
		
	}

}
/***
 * 核心的代码就如下面的Node一样
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
