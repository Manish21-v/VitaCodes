package inheritanceAssisgnment;

public class Question1  {

	public static void main(String[] args) {
		Third t= new Third();
		t.fun();

	}

}

class First
{
	int num=10;
	public First()
	{
		System.out.println("Inside First " + num);
	}
	public void fun()
	{
		System.out.println("inside fun");
	}
}

class Second extends First
{
	
	public Second() {
		
		System.out.println("Inside second");
	}

	public void fun()
	{
		System.out.println("Inside second clas");
		System.out.println(num);
	}
}
class Third extends Second
{
	
	public Third() {
		System.out.println("Inside Third");
	}

	public void fun()
	{
		System.out.println("Inside third class");
		num=num+20;
		System.out.println(num);
	}
	
}