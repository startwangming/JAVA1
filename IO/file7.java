package atest.装饰器模式;

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
 * PrintStream:这个流相当于我们的system.out(这个函数也是调用PrintStream这个流)
 * 而且这个流可以直接的接受：
 * 1、文件名
 * 2、文件类
 * 3、字符串
 * 注释：它还可以填写是否手动的刷新；设置字符集的的参数
 * 
 * PrintWriter:和printstream类似，是他的兄弟，用法上也是差不多，
 * @author Star Wang
 *
 */
public class file7 {
	public static void file1() throws FileNotFoundException, IOException{
		//System.out:默认的打印流是输出到控制台，都是PrintStream的对象
		PrintStream pr = System.out;
		pr.print("自己要学会敲代码");
		
		// 也可以输出到文件，这样的话就会从我们的代码直接输出到文件，很方便
		pr = new PrintStream("aa.txt");
		pr.print("java的代码是一个很有意思的代码啊");
		pr.println();
		pr.print("丰富健壮的体系");
		pr.close();
		
		//如果要实现他的内容累加的话就要再FileOutputStream里面进行添加我们的内容
		pr = new PrintStream(new BufferedOutputStream(new FileOutputStream(new File("aa.txt"), true)),true);
		pr.print("丰富健壮的体系");//这个是可以直接打印带文件的额
		pr.append("cc");//这个是可以直接添加的
//		pr.close();
		
		
		//重定向输出端
		//重定向输出端setOut,可以传入一个PrintStream的对象，然后将他的输出对象进行改变，这样的话就可以直接system.out到文件了
		System.setOut(pr);
		System.out.println();
		System.out.println("控制太发生改变，可以用F5进行刷新一下，查看文件");
		System.out.println("*****************************");
		//重定向回来进行测试
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));//这里就不需要累加式的写入了
		System.out.println();
		System.out.println("我又回来开了");
	}
	public static void file2() throws IOException {
		PrintWriter pr = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File("bb.txt"))),true);
		pr.print("java的代码是一个很有意思的代码啊");
		pr.println();
		pr.println("丰富健壮的体系是他的一些列的特点");
		pr.append("append的方法");
		pr.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		file1();
		file2();
	}
}
