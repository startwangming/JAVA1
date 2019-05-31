package atest.װ����ģʽ;
/***
 * �ǿ��Ը��õ�ʹ�����ǵĽڵ��������ļ��ֽ�������д򽻵��ģ���������
 * װ�����ģʽ���������Ĵ�boss��GOF��
 *
 * ģ�⿧��
 * 1���������:��Ҫװ�εĳ������(�ӿڻ������)
 * 2���������:��Ҫװ�εĶ���
 * 3������װ����:�����˶Գ�������������Լ�װ���Ź��еķ���
 * 4������װ����:��װ�εĶ���
 * 
 *
 *
 * @author Star Wang
 *
 */
public class tast1 {
	
	/**
	 * ģ�⿧��
	 * 1���������:��Ҫװ�εĳ������(�ӿڻ������)
	 * 2���������:��Ҫװ�εĶ���
	 * 3������װ����:�����˶Գ�������������Լ�װ���Ź��еķ���
	 * 4������װ����:��װ�εĶ���
	 * @author TW
	 *
	 */
	
		public static void main(String[] args) {
			Drink coffee =new Coffee();
			Drink suger =new Suger(coffee); //װ��
			System.out.println(suger.info()+"-->"+suger.cost());
			Drink milk =new Milk(coffee);//װ��
			System.out.println(milk.info()+"-->"+milk.cost());		
			milk =new Milk(suger);//װ��
			System.out.println(milk.info()+"-->"+milk.cost());
		
	}
	

}
//�������
	interface Drink{
		double cost(); //����
		String info(); //˵��
	}
	//�������
	class Coffee implements Drink{
		private String name ="ԭζ����";
		@Override
		public double cost() {
			return 10;
		}

		@Override
		public String info() {
			return name;
		}
		
	}
	//����װ����
	abstract class Decorate implements Drink{
		//�Գ������������
		private Drink drink;
		public Decorate(Drink drink) {
			this.drink =drink;
		}
		@Override
		public double cost() {
			return this.drink.cost();
		}

		@Override
		public String info() {
			return this.drink.info();
		}	
	}

	//����װ����
	class Milk extends Decorate{

		public Milk(Drink drink) {
			super(drink);
		}
		@Override
		public double cost() {
			return super.cost()*4;
		}

		@Override
		public String info() {
			return super.info()+"������ţ��";
		}	
	}

	class Suger extends Decorate{

		public Suger(Drink drink) {
			super(drink);
		}
		@Override
		public double cost() {
			return super.cost()*2;
		}

		@Override
		public String info() {
			return super.info()+"����������";
		}	
	}
