package test9;

import myConlection.Node;


/***
 * ���remove�Ĺ���
 * @author starwang
 *
 */
public class myLinkList3 <E>{
	
	private Node first;
	private Node last;
	
	private int size;

	
	public void add(E obj) {
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
		size++;
	}
	
	
	public void add(int index,E obj) {
		if (index>(size-1)||index<-1) {
			throw new RuntimeException("Out Of Range:"+(size-1)+"index:"+index);
		}
		if(index==0) {
			Node node = new Node(obj);
			if(size==0) {
				node.setNe(null);
				node.setPr(null);
				first = node;
				last = node;
				size++;
			}else{
				first.setPr(node);
				node.setNe(first);
				first = node;
				size++;
			}
		}else if(index ==(size-1)) {
			add(obj);
		}else {
			Node node = new Node(obj);
			Node temp = getNode(index);
			Node temp1 = temp.getPr();
			temp.setPr(node);
			temp1.setNe(node);
			node.setPr(temp1.getNe());
			node.setNe(temp.getPr());
			size++;
			
		}
	}
	
	
	/***
	 * ��ȡ���Ԫ��
	 * @param index
	 * @return
	 */
	public E getElement(int index) {
		if (index>(size-1)||index<-1) {
			throw new RuntimeException("Out Of Range:"+(size-1)+"index:"+index);
		}

		/**
		 *δ�Ż��Ĵ��� 
		 */
//		Node tmpe = first;
//		for (int i = 0; i < index; i++) {
//			tmpe = tmpe.getNe();
//		}
		
		/**
		 * �Ż��Ĵ��룬ѡ����������п�ʼ��ѯ
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
		return (E) tmpe.getElement();
	}
	
	
	/***
	 * ��ȡָ��λ�õ�node
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
	 * ֱ��ɾ��ָ��λ�õ�����
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
	
	
	/***
	 * �滻ָ��λ�õ�����
	 * @param index
	 * @param obj
	 */
	public void replace(int index,Object obj) {
		Node element = getNode(index);
		element.setElement(obj);
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
		myLinkList3<String> li = new myLinkList3<>();
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
