package test9;

import myConlection.Node;

/***
 * ����һ��һ������
 * ���һЩ�����ķ���
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
			//���ñ��ڵ���ǰһ���ڵ������ת��������һ����ת�Ķ���Ϊnull
			node.setPr(last);
			node.setNe(null);
			
			//������һ����ת����һ�����Ϊ������
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
