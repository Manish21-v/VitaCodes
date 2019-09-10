package inheritanceAssisgnment;

public class question4 {

	static public void perform(Top1 t)
	{
		t.Disp1();
	}
	public static void main(String[] args) {
		perform(new Bottom1());
		perform(new Bottom2());
		perform(new Bottom3());

	}

}

class Top1
{
	void Disp1()
	{
		
	}
}

class Bottom1 extends Top1
{
	void Disp1()
	{
		System.out.println("inside Bottom1");
	}
}
class Bottom2 extends Top1
{
	void Disp1()
	{
		System.out.println("inside Bottom2");
	}
}
class Bottom3 extends Top1
{
	void Disp1()
	{
		System.out.println("inside Bottom3");
	}
}