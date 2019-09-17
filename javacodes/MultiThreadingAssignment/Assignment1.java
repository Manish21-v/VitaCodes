
public class Assignment1 extends Thread{
	public void display()
	{
		for(int i='A';i<='J';i++)
		{
			System.out.print((char)i);
		}
	}
	
	 public void run()
	{
		//System.out.println("this is your thread");
		display();
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		/*basics b= new basics();
			b.display();*/
		Assignment1 b= new Assignment1();
		
		b.start();
		Assignment1 b1= new Assignment1();
		
		b1.start();
		
		
	}

}
