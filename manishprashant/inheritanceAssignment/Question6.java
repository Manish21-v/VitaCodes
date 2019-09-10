package inheritanceAssisgnment;

public class Question6 {

	public static void main(String[] args) {
		c obj= new c();
		System.out.println(c.num);
		obj.disp3();
		obj.disp2();
		obj.disp1();

	}

}

interface a
{
	void disp1();
}
interface b extends a
{
	void disp2();
}
class c implements b
{
	static int num=8;
	public void disp3()
	{
		System.out.println("inside disp3");
	}

	@Override
	public void disp1() {
		System.out.println("inside disp1");
		
	}

	@Override
	public void disp2() {
		System.out.println("inside disp2 ");
		
	}
}