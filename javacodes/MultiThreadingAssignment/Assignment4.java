
public class Assignment4
{
	
	public static void main(String[] args)
	{
		Demo d1= new Demo();
		Demo d2= new Demo();
		Thread t1= new Thread(d1);
		Thread t2= new Thread(d2);
		t1.start();
		t2.start();
		
		
		
	}

	
}

class Demo implements Runnable 
{

	static Class c;
	static void Display() 
	{
		
		try {
			c=Class.forName("Demo");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		synchronized (c)
		{
			for(int i=1;i<11;i++)
			{
				System.out.print(i);
			}
			
		}
		}
		
	@Override
	public void run() {
		Display();
		
	}
	
}
