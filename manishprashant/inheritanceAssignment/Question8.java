package inheritanceAssisgnment;

public class Question8 {

	public static void main(String[] args) {
		sub1 s= new sub1();
		sub1 o= new sub1(20);
		sub1 j= new sub1 (10,50);

	}

}

class Base
{
	int num=100;
	public Base(int num) {
		this.num=num;
		System.out.println("inside base class");
	}
	
}

class sub1 extends Base
{
	public sub1()
	{
		super(200);
		System.out.println("inside sub def");
		
	}
	public sub1(int num) 
	{
		super(num);
		System.out.println("inside sub parameterised1");
		
	}
	
	public sub1(int n,int k)
	{
		super(300);
		System.out.println("inside the parameterised 2");
		
	}
}