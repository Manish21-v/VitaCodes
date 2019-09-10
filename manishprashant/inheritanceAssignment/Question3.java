package inheritanceAssisgnment;

public class Question3 {

	public static void main(String[] args) {
		Demo2 s= new Demo2();
		Demo3 t= new Demo3();

	}

}

class Demo1
{
	int num=10;
	public Demo1()
	{
		System.out.println("Inside Demo1 " + num);
	}
	public void fun()
	{
		System.out.println("inside Demo1");
	}
}

class Demo2 extends Demo1
{
	
	public Demo2() {
		
		System.out.println("Inside Demo2");
	}

	public void fun()
	{
		System.out.println("Inside Demo2");
		System.out.println(num);
	}
}
class Demo3 extends Demo1
{
	
	public Demo3() {
		System.out.println("Inside Demo3");
	}

	public void fun()
	{
		System.out.println("Inside third class");
		num=num+20;
		System.out.println(num);
	}
	
}
