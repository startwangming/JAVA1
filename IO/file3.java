package atest.װ����ģʽ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/***
 * BufferedReader��BufferedWriter;�ַ��������������ǽ������󻺴棬�ӿ����� �����ٶ�
 * �ڲ���һЩ�µķ���������Ҫ������̬��
 * �µķ������磺readLine()��newLine(),�ֱ������ж�ȡ��û�����ͷ���Ϊnull���ͻ���
 * @author Star Wang
 *
 */
public class file3 {
	public static void bufferedReader(String src,String dest) {
		//����Դ
		File file1 = new File(src);
		File file2 = new File(dest);
		//ѡ����
		try(BufferedReader br= new BufferedReader(new FileReader(file1));
				BufferedWriter bw = new BufferedWriter(new FileWriter(file2)) ) {
			//����Ϊһ���ַ���
			String line = null;
			//��ȡ�ļ�
			while((line = br.readLine())!=null){
				bw.append(line);//bw.append(line);
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}	
	}
	public static void main(String[] args) {
		bufferedReader("out.txt", "out-copy.txt");
	}
}
