package atest.装饰器模式;
/***
 * 序列化具有持久性的特点，什么时候使用都是可以的，
 * 使用这个对象进行序列化的时候就必须是对象能实现java.io.Serializable接口的实现，虽然里面没有要求实现的方法，但是他是虚拟机是被的标识
 * a instanceof b 查看a是否是b的实例化
 * transient 透明化，序列化后，进行反序列化的时候是无法读取他的数据的，针对序列化而言
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
		//写入一个流:序列化
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("obj.txt"));
		ObjectOutputStream dos = new ObjectOutputStream(bos) ;
		dos.writeChar('c');
		dos.writeDouble(3.12);
		dos.writeBoolean(false);
		dos.writeUTF("这个类猛如狗");
		Date da = new Date();
		dos.writeObject(da);
		emplay2 ee = new emplay2("wang",1000);
		dos.writeObject(ee);//必须实现这个接口才可以java.io.Serializable
		dos.flush();
		dos.close();
		
		//输入到系统输出：反序列化
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
