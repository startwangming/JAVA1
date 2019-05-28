package test9;

import myConlection.Node;


/***
 * 添加remove的功能
 * @author starwang
 *
 */
public class myLinkList2 {
	
	private Node first;
	private Node last;
	
	private int size;

	
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
		size++;
	}
	
	
	/***
	 * 获取这个元素
	 * @param index
	 * @return
	 */
	public Object getElement(int index) {
		if (index>(size-1)||index<-1) {
			throw new RuntimeException("Out Of Range:"+(size-1)+"index:"+index);
		}

		/**
		 *未优化的代码 
		 */
//		Node tmpe = first;
//		for (int i = 0; i < index; i++) {
//			tmpe = tmpe.getNe();
//		}
		
		/**
		 * 优化的代码，选着在哪里进行开始查询
		 */
		Node tmpe;
		int b = (size>>1);
		if(index<=b) {
			tmpe = first;
			for(int i=0;i<index;i++) {
				tmpe = tmpe.getNe();
			}
		}else {
			tmpe = last;
			for(int i=(size-1);i>index;i--) {
				tmpe = tmpe.getPr();
			}
		}
		return tmpe.getElement();
	}
	
	
	/***
	 * 获取指定位置的node
	 * @param index
	 * @return
	 */
	public Node getNode(int index ) {
		Node temp ;
		if (index>(size-1)||index<-1) {
			throw new RuntimeException("Out Of Range:"+(size-1)+"index:"+index);
		}
		int b = (size>>1);
		if(index<=b) {
			temp = first;
			for(int i=0;i<index;i++) {
				temp = temp.getNe();
			}
		}else {
			temp = last;
			for(int i=(size-1);i>index;i--) {
				temp = temp.getPr();
			}
		}
		return temp;
	}
	
	
	/***
	 * 直接删除指定位置的索引
	 * @param index
	 */
	public void remove(int index) {
		Node temp;
		Node Up;
		Node down;
		temp = getNode(index);
		if(index==0) {
			if(size==1) {
				first=null;
				last=null;
				size--;
			}else {
				first = temp.getNe();
				first.setPr(null);
				size--;
			}
			
		}else if(index==(size-1)){
			last = temp.getPr();
			last.setNe(null);
			size--;
		}else {
			Up = temp.getPr();
			down = temp.getNe();
			Up.setNe(temp.getPr());
			down.setPr(down.getPr());
			size--;
		}
		
		
	}

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
//		sb.append();
		Node tmpe = first;
		while(tmpe!=null) {
			sb.append(tmpe.getElement()+",");
			tmpe =tmpe.getNe(); 	
		}
		if(size==0) {
			sb.append(']');
		}
		else {
			sb.setCharAt(sb.length()-1, ']');
		}
		return sb.toString();
		}
	
	
	public static void main(String[] args) {
		myLinkList2 li = new myLinkList2();
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("d");
		System.out.println(li);
		System.out.println(li.getElement(3));
		System.out.println(li.getNode(3));
		li.remove(3);
		li.remove(1);
		li.remove(0);
		li.remove(0);
		
		System.out.println(li);
	}
}
