package COM.MANISH;

public class perimeter {
	
	int num=20;
		
		public perimeter(int num) 
		{
			this.num=num;
	System.out.println("inside parameterized perimeter construter");
		// TODO Auto-generated constructor stub
	}

		public int getperi(int a,int b)
		{
			int value=2*(a+b);
			return value;
		}
	
}
