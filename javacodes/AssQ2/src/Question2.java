
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoArr arr[]= new DemoArr [4];
		
		for(int i=0;i<4;i++)
		{
			arr[i]=new DemoArr();
			arr[i].disp();
		}
	}

}

class DemoArr
{
	void disp()
	{
		System.out.println("inside Disp");
	}
}