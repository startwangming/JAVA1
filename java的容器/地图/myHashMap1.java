package test9;

import java.util.HashMap;
import java.util.Map;

public class myHashMap1 {
	public static void main(String[] args) {
		Employ e1 = new Employ(11,"lao1",44);
		Employ e2 = new Employ(12,"laowang2",45);
		Employ e3 = new Employ(13,"laowang3",46);
		Employ e4 = new Employ(14,"laowang4",47);
		Employ e5 = new Employ(11,"laowang5",48);
		Map<Integer, Employ> a = new HashMap<Integer, Employ>();
		
		a.put(11, e1);
		a.put(12, e2);
		a.put(13, e3);
		a.put(14, e4);
		a.put(11, e5);
		System.out.println(a);
	}
	
}
class Employ{
	private int years;
	private String name;
	private Integer salf;
	
	public Employ() {
		super();
	}
	public Employ(int years, String name, Integer salf) {
		super();
		this.years = years;
		this.name = name;
		this.salf = salf;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalf() {
		return salf;
	}
	public void setSalf(Integer salf) {
		this.salf = salf;
	}
	@Override
	public String toString() {
		return "[years=" + years + ", name=" + name + ", salf=" + salf + "]";
	}
	
}
