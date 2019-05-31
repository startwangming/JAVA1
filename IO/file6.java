package atest.װ����ģʽ;
/***
 * ���л����г־��Ե��ص㣬ʲôʱ��ʹ�ö��ǿ��Եģ�
 * ʹ���������������л���ʱ��ͱ����Ƕ�����ʵ��java.io.Serializable�ӿڵ�ʵ�֣���Ȼ����û��Ҫ��ʵ�ֵķ�������������������Ǳ��ı�ʶ
 * a instanceof b �鿴a�Ƿ���b��ʵ����
 * transient ͸���������л��󣬽��з����л���ʱ�����޷���ȡ�������ݵģ�������л�����
 *  
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class file6 {
	public static void file1() throws IOException, ClassNotFoundException{
		//д��һ����:���л�
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("obj.txt"));
		ObjectOutputStream dos = new ObjectOutputStream(bos) ;
		dos.writeChar('c');
		dos.writeDouble(3.12);
		dos.writeBoolean(false);
		dos.writeUTF("��������繷");
		Date da = new Date();
		dos.writeObject(da);
		emplay2 ee = new emplay2("wang",1000);
		dos.writeObject(ee);//����ʵ������ӿڲſ���java.io.Serializable
		dos.flush();
		dos.close();
		
		//���뵽ϵͳ����������л�
		ObjectInputStream dis = new ObjectInputStream(new BufferedInputStream(new FileInputStream("obj.txt")));
		char c = dis.readChar();
		Double d = dis.readDouble();
		Boolean b1 = dis.readBoolean();
		String s = dis.readUTF();
		System.out.println(c );
		System.out.println(d );
		System.out.println(b1+s );
		Date dd = (Date) dis.readObject();
		System.out.println(dd);
		emplay2 em = (emplay2) dis.readObject();
		System.out.println(em.getName()+"////"+em.getSalaty());
		dis.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		file1();
	}
}
class emplay2 implements java.io.Serializable{
	private transient String name;
	private int salaty;
	public emplay2(String name, int salaty) {
		super();
		this.name = name;
		this.salaty = salaty;
	}
	public emplay2() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalaty() {
		return salaty;
	}
	public void setSalaty(int salaty) {
		this.salaty = salaty;
	}
}
