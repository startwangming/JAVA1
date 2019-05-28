package test9;

public class Node {
	private Node Pr;
	private Node Ne;
	
	
	Object element;


	public Node(Node pr, Node ne, Object element) {
		super();
		Pr = pr;
		Ne = ne;
		this.element = element;
	}


	public Node getPr() {
		return Pr;
	}


	public void setPr(Node pr) {
		Pr = pr;
	}


	public Node getNe() {
		return Ne;
	}


	public void setNe(Node ne) {
		Ne = ne;
	}


	public Object getElement() {
		return element;
	}


	public void setElement(Object element) {
		this.element = element;
	}


	public Node(Object element) {
		super();
		this.element = element;
	}
	
	
	
	
	
	
	

}
