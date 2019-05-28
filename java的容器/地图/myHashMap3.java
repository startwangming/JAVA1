package test9;



/***
 * �Զ���һ��HashMap�ĵײ�ʵ��
 * @author ������
 *
 */
public class myHashMap3 {
	
	Node2[] table;//λͰ����
	int size;
	Boolean replaceKey = false;
	
	public myHashMap3(int a){
		table = new Node2[a];
	}
	public myHashMap3() {
		table = new Node2[16];
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for(int i=0;i<table.length;i++) {
			Node2 temp= table[i];
			sb.append('{');
			while(temp!=null) {
				sb.append(temp.getKey()+":"+temp.getValue()+",");
				temp = temp.getNext();
			}
			sb.setCharAt(sb.length()-1, '}');
			sb.append(",");
		}
		sb.setCharAt(sb.length()-1, ']');
		
		
		return  sb.toString();
	}
	public Object get(Object key) {
		int hash = myHash(key, table.length);
		Node2 temp = table[hash];
		if(temp==null) {
			return null;
		}else {
			while(temp!=null) {
				if (temp.getKey().equals(key)) {
					return temp.getValue();
				}
				temp = temp.getNext();
				
			}
			return null;
		}
		

	}
	public void put(Object key, Object value) {
		
		//����һ���µĽڵ�
		Node2 newNode = new Node2();
		newNode.setHash(myHash(key, table.length));
		newNode.setKey(key);
		newNode.setValue(value);
		newNode.setNext(null);
		
		//�ж��Ƿ�Ϊnull,�����ֵ
		if(table[newNode.getHash()]==null) {
			//ֱ�ӷ��þͿ���
			table[newNode.getHash()]=newNode;
		}else {
			//����һ����ʱ�Ľڵ�
			Node2 temp = table[newNode.getHash()];
			Node2 temp1 = temp.getNext();
			while (temp1!=null) {
				if (temp1.getKey().equals(newNode.getKey())) {
					temp1.setValue(newNode.getValue());
					replaceKey = true;
					break;
				}else {
					temp = temp1;
					temp1 = temp.getNext();
				}
				if(replaceKey==false) {
					temp.setNext(newNode);	
				}
			}	
		}
		replaceKey = false;
	}
	public int myHash(Object key1,int length) {
		//һ�������ֵķ������Խ���ѡ�ţ�
		//һ���ǽ���λ���㣬��һ����ȡ�࣬ǰһ������Ч�ʸߣ���һ������Ч�ʵ�
		return (int)key1&(length-1);
	}
	public static void main(String[] args) {
		myHashMap3 m1 = new myHashMap3();
		m1.put(111, "fasf");
		m1.put(112, "fasf");
		m1.put(113, "fasf");
		m1.put(114, "fasf");
		m1.put(115, "fasf");
		m1.put(116, "fasf");
		m1.put(117, "fasf");
		m1.put(118, "fasf");
		m1.put(119, "fasf");
		m1.put(110, "fasf");
		m1.put(121, "fasf");
		m1.put(122, "fasf");
		m1.put(123, "fasf");
		m1.put(124, "fasf");
		m1.put(125, "fasf");
		m1.put(126, "fasf");
		m1.put(127, "fasf");
		m1.put(128, "fasf");
		m1.put(129, "fasf");
		m1.put(130, "fasf");
		m1.put(131, "fasf");
		m1.put(132, "fasf");
		m1.put(133, "fasf");
		m1.put(134, "fasf");
		m1.put(135, "fasf");
		
		System.out.println(m1);
		System.out.println(m1.get(130));
		
	}
}
