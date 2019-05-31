package atest.装饰器模式;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;



/***
 * InputStreamWrite和OutputStreamReader
 * @author Star Wang
 *
 */
public class file4 {
	public static void file1(){
		try(BufferedReader is = new BufferedReader(
				new InputStreamReader(
						new URL("http://www.baidu.com").openStream(),"UTF-8"));
			BufferedWriter os = new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream(
									new File("aa.html")),"UTF-8"));) {
			String msg= null;
			while((msg=is.readLine())!=null) {
				os.write(msg);
				os.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
	public static void file2() {
		
		String msg=null;
		try(BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter os = new BufferedWriter(new OutputStreamWriter(System.out))) {
			while((msg=is.readLine())!=null) {
				os.write(msg);
				os.newLine();
				os.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		file1();
		file2();
	}

}
