package atest.װ����ģʽ;
/***
 * DataOutputStream
 * DataInputStream:�����ļ�ԭ�еĸ�ʽȥȥд���ļ������Ұ���ԭ�е����ݸ�ʽ�����Ƕ����������Ǳ�����ԭ�ȵĸ�ʽ���ж�д���������ִ���
 */
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class file5 {
	public static void file1() throws IOException{
		//д��һ����
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos) ;
		dos.writeChar('c');
		dos.writeDouble(3.12);
		dos.writeBoolean(false);
		dos.writeUTF("��������繷");
		byte[] b = baos.toByteArray();
		//���뵽ϵͳ���
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
