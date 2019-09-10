package inheritanceAssisgnment;

public class Question7 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.s);
		c.fun();

	}

}

class Parent1
{
	public String s="parent";
	public Parent1() {
		System.out.println("Inside def parent1");
	}
	
	
}

interface Parent2
{
	void fun();
}

class Child extends Parent1 implements Parent2
{

	@Override
	public void fun() {
		System.out.println("Fun school");
		
	}
	
}