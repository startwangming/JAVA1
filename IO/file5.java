package atest.装饰器模式;
/***
 * DataOutputStream
 * DataInputStream:按照文件原有的格式去去写入文件，并且按照原有的数据格式将他们读出来，但是必须是原先的格式进行读写，否则会出现错误
 */
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class file5 {
	public static void file1() throws IOException{
		//写入一个流
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos) ;
		dos.writeChar('c');
		dos.writeDouble(3.12);
		dos.writeBoolean(false);
		dos.writeUTF("这个类猛如狗");
		byte[] b = baos.toByteArray();
		//输入到系统输出
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(b)));
		char c = dis.readChar();
		Double d = dis.readDouble();
		Boolean b1 = dis.readBoolean();
		String s = dis.readUTF();
		System.out.println(c );
		System.out.println(d );
		System.out.println(b1+s );
	}
	public static void main(String[] args) throws IOException {
		file1();
	}

}
