package rough;

class base
{
	public void disp()
	{
		System.out.println("base disp");
	}
}
class sub extends base
{
	public void disp()
	{
		System.out.println("sub disp");
	}
}
public class test
{
	public static void main(String args[])
	{
		sub s=new sub();
		s.disp();
		base ref=new sub();
		ref.disp();

/*what compiler does

 	sub.disp();
     
        base.disp();
*/

	}
}










