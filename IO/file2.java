package atest.装饰器模式;

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
 * 主要介绍的是BufferedInputStream和BufferedOutputStream
 * 再原先单个字节的读写到整块的读写可以明显的提升他的效率，但是还是过于频繁的调用了系统的资源，这样就不是很好，
 * 而这两个类是将这些块进行收集，然后让他们等待统一的写入
 * 如果想要关闭的时候必须是从内到外的进行关闭，这就使得他们能够逐一的关闭，第二种就是直接进行关闭，BufferedInputStream会自动的检测他们，然后进行自动的关闭（自己也是可以去close的代码看一下，每个都是递归的去关闭代码，最终是关闭了in或者out的文件）
 * 
 * @author Star Wang
 *
 */
public class file2 {
	/***
	 * 
	 */
	public static void bufferedInput1() {
		//创建源
		File file = new File("out.txt");
		//使用最新的try-catch-resource的代码
		try(InputStream is = new FileInputStream(file);
				//BufferedInputStream是使用装饰修饰模式的
				InputStream bis = new BufferedInputStream(is);) {
			//创建缓存容器
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
	 * 加入Buffered的作用相对于不加上的流，我减少时间到36% 左右
	 * 但是如果再继续加上Buffered的话是没有啥效果的
	 */
	public static void bufferedInput2() {
		//创建源
		File file = new File("shang.avi");
		File file2 = new File("copu_shang.avi");
		//选择流
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
			//关闭流
//			os.close(); os和is可以关闭也可以不用关闭，当他不用关闭的时候，必须是关闭最外围的函数，如Buffered，他默认的会自动的关闭里面的流。若是关闭的话，必须是先关闭里面的流，再关闭外面的流
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
	 * 简化代码：44行代码简略到18行代码
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
			bos.flush();//这个也是可以省略的，close的时候会自动的拆了
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
