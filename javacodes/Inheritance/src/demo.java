
public class demo {

	static void perform(FourWheeler ref )
	{
		ref.start();
		/*if(ref instanceof Car)
		{
			Car c=(Car)ref ;
			c.DriveForward();
		}*/
		
		ref.setNum(100);
		ref.getNum();
		
	}
	public static void main(String[] args) 
	{
		perform( new Car());
		
		System.out.println(FourWheeler.st);
		Car c= new Car("Honda");
		
		
	}

}
class FourWheeler
{
	private int num=0;//instance member
	public static String st="Diesel";//class variable
	public FourWheeler(int num) {
		
		this.num = num;
	}
	public FourWheeler() {
		
		System.out.println("Inside the default constructer of base class");
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public void start()
	{
		System.out.println("Engine Start of base class");
	}
	
}

class Car extends FourWheeler
{
	public String cname;
	public Car() {
		
		
		System.out.println("inside the default constructor in car");
	}

	public Car(String cname) 
	{
		
		this.cname=cname;
		
	}

	public void DriveForward()
	{
		System.out.println("Drive Forward the car");
	}
	
	
	
}
