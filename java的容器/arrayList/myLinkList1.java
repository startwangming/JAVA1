package test9;

import myConlection.Node;

/***
 * 创建一个一个链表
 * 添加一些基本的方法
 * @author starwang
 *
 */
public class myLinkList1 {
	private Node first;
	private Node last;
	
	public void add(Object obj) {
		Node node = new Node(obj);
		if(first==null) {
			node.setNe(null);
			node.setPr(null);
			first = node;
			last = node;
			
		}else {
			//设置本节点往前一个节点进行跳转，设置下一个跳转的对象为null
			node.setPr(last);
			node.setNe(null);
			
			//设置上一个跳转的下一额对象为本对象
			last.setNe(node);
			last = node;
			
		}
		
		
	}

	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node tmpe = first;
		while(tmpe!=null) {
			sb.append(tmpe.getElement()+",");
			tmpe =tmpe.getNe(); 	
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
		}
	public static void main(String[] args) {
		myLinkList1 li = new myLinkList1();
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("d");
		System.out.println(li);
	}
}
