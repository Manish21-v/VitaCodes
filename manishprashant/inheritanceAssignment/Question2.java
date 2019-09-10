package inheritanceAssisgnment;



	public class Question2 {

		public static void main(String[] args) {
			FourWheeler f= new FourWheeler();
			f.start();
		}

	}

	class Vehicle
	{
		public void start()
		{
			System.out.println("Engine start");
		}
	}

	class FourWheeler extends Vehicle
	{
		
		public void start()
		{
			System.out.println("This is your Four wheeler");
		}
	}

