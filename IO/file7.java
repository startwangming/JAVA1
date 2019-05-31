package atest.װ����ģʽ;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;


/***
 * PrintStream:������൱�����ǵ�system.out(�������Ҳ�ǵ���PrintStream�����)
 * �������������ֱ�ӵĽ��ܣ�
 * 1���ļ���
 * 2���ļ���
 * 3���ַ���
 * ע�ͣ�����������д�Ƿ��ֶ���ˢ�£������ַ����ĵĲ���
 * 
 * PrintWriter:��printstream���ƣ��������ֵܣ��÷���Ҳ�ǲ�࣬
 * @author Star Wang
 *
 */
public class file7 {
	public static void file1() throws FileNotFoundException, IOException{
		//System.out:Ĭ�ϵĴ�ӡ�������������̨������PrintStream�Ķ���
		PrintStream pr = System.out;
		pr.print("�Լ�Ҫѧ���ô���");
		
		// Ҳ����������ļ��������Ļ��ͻ�����ǵĴ���ֱ��������ļ����ܷ���
		pr = new PrintStream("aa.txt");
		pr.print("java�Ĵ�����һ��������˼�Ĵ��밡");
		pr.println();
		pr.print("�ḻ��׳����ϵ");
		pr.close();
		
		//���Ҫʵ�����������ۼӵĻ���Ҫ��FileOutputStream�������������ǵ�����
		pr = new PrintStream(new BufferedOutputStream(new FileOutputStream(new File("aa.txt"), true)),true);
		pr.print("�ḻ��׳����ϵ");//����ǿ���ֱ�Ӵ�ӡ���ļ��Ķ�
		pr.append("cc");//����ǿ���ֱ����ӵ�
//		pr.close();
		
		
		//�ض��������
		//�ض��������setOut,���Դ���һ��PrintStream�Ķ���Ȼ���������������иı䣬�����Ļ��Ϳ���ֱ��system.out���ļ���
		System.setOut(pr);
		System.out.println();
		System.out.println("����̫�����ı䣬������F5����ˢ��һ�£��鿴�ļ�");
		System.out.println("*****************************");
		//�ض���������в���
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));//����Ͳ���Ҫ�ۼ�ʽ��д����
		System.out.println();
		System.out.println("���ֻ�������");
	}
	public static void file2() throws IOException {
		PrintWriter pr = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File("bb.txt"))),true);
		pr.print("java�Ĵ�����һ��������˼�Ĵ��밡");
		pr.println();
		pr.println("�ḻ��׳����ϵ������һЩ�е��ص�");
		pr.append("append�ķ���");
		pr.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		file1();
		file2();
	}
}
