package atest.装饰器模式;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/***
 * BufferedReader和BufferedWriter;字符缓存流：作用是将流增大缓存，加快他的 运行速度
 * 内部有一些新的方法尽量不要发生多态，
 * 新的方法，如：readLine()和newLine(),分别是整行读取（没读到就返回为null）和换行
 * @author Star Wang
 *
 */
public class file3 {
	public static void bufferedReader(String src,String dest) {
		//创建源
		File file1 = new File(src);
		File file2 = new File(dest);
		//选择流
		try(BufferedReader br= new BufferedReader(new FileReader(file1));
				BufferedWriter bw = new BufferedWriter(new FileWriter(file2)) ) {
			//容器为一个字符串
			String line = null;
			//读取文件
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
