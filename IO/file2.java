package atest.װ����ģʽ;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/***
 * ��Ҫ���ܵ���BufferedInputStream��BufferedOutputStream
 * ��ԭ�ȵ����ֽڵĶ�д������Ķ�д�������Ե���������Ч�ʣ����ǻ��ǹ���Ƶ���ĵ�����ϵͳ����Դ�������Ͳ��Ǻܺã�
 * �����������ǽ���Щ������ռ���Ȼ�������ǵȴ�ͳһ��д��
 * �����Ҫ�رյ�ʱ������Ǵ��ڵ���Ľ��йرգ����ʹ�������ܹ���һ�Ĺرգ��ڶ��־���ֱ�ӽ��йرգ�BufferedInputStream���Զ��ļ�����ǣ�Ȼ������Զ��Ĺرգ��Լ�Ҳ�ǿ���ȥclose�Ĵ��뿴һ�£�ÿ�����ǵݹ��ȥ�رմ��룬�����ǹر���in����out���ļ���
 * 
 * @author Star Wang
 *
 */
public class file2 {
	/***
	 * 
	 */
	public static void bufferedInput1() {
		//����Դ
		File file = new File("out.txt");
		//ʹ�����µ�try-catch-resource�Ĵ���
		try(InputStream is = new FileInputStream(file);
				//BufferedInputStream��ʹ��װ������ģʽ��
				InputStream bis = new BufferedInputStream(is);) {
			//������������
			byte[] b = new byte[1024*4];
			int len= -1;
			while((len = bis.read(b))!=-1) {
				System.out.println(new String(b, 0, len));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	/***
	 * ����Buffered����������ڲ����ϵ������Ҽ���ʱ�䵽36% ����
	 * ��������ټ�������Buffered�Ļ���û��ɶЧ����
	 */
	public static void bufferedInput2() {
		//����Դ
		File file = new File("shang.avi");
		File file2 = new File("copu_shang.avi");
		//ѡ����
		InputStream is =null;
		OutputStream os = null;
		InputStream bis = null;
		OutputStream bos = null;
		try {
			is = new FileInputStream(file);
			os = new FileOutputStream(file2);
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(os);
			int len= -1;
			byte[] b = new byte[1024*4];
			while((len=bis.read(b))!=-1) {
				bos.write(b, 0, len);
				System.out.println(1);
			}
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//�ر���
//			os.close(); os��is���Թر�Ҳ���Բ��ùرգ��������ùرյ�ʱ�򣬱����ǹر�����Χ�ĺ�������Buffered����Ĭ�ϵĻ��Զ��Ĺر�������������ǹرյĻ����������ȹر�����������ٹر��������
//			bos.close();
//			is.close();
//			bis.close();
			try {
				if(bos!=null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(bis!=null) {
					bis.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
	
	/***
	 * �򻯴��룺44�д�����Ե�18�д���
	 * @param src
	 * @param dest
	 */
	public static void bufferedInput3(String src,String dest,String name) {
		File file1 = new File(src);
		File File2 = new File(dest+File.separatorChar+name);
		try(InputStream bis= new BufferedInputStream(new FileInputStream(file1));
				OutputStream bos = new BufferedOutputStream(new FileOutputStream(File2));) {
			int len= -1;
			byte[] b = new byte[1024*4];
			while((len=bis.read(b))!=-1) {
				bos.write(b, 0, len);
				System.out.println(1);
			}
			bos.flush();//���Ҳ�ǿ���ʡ�Եģ�close��ʱ����Զ��Ĳ���
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	public static void main(String[] args) {
//		bufferedInput1();
		bufferedInput2();
		
	}
	

}
