package test9;
/***
 * 自定义一个HashMap的实现方式
 * @author 王明星
 *
 */
public class Node2 {
	private int hash;
	private Object key;
	private Object Value;
	private Node2 next;
	public int getHash() {
		return hash;
	}
	public void setHash(int hash) {
		this.hash = hash;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object key) {
		this.key = key;
	}
	public Object getValue() {
		return Value;
	}
	public void setValue(Object value) {
		Value = value;
	}
	public Node2 getNext() {
		return next;
	}
	public void setNext(Node2 next) {
		this.next = next;
	}
	
	
}
