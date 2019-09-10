package inheritanceAssisgnment;

public class Queston5 {

	public static void main(String[] args) {
		Shape arr[]= new Shape[3];
			arr[0]=new polygon();
			arr[1]= new Circle();
			arr[2]= new Triangle();
			
			for(int cnt =0;cnt<arr.length;cnt++)
			{
				arr[cnt].Shape();
			}
		
	}

}

abstract class Shape
{
	abstract void Shape();
}

class polygon extends Shape
{

	@Override
	void Shape() {
		System.out.println("Shape is Polygon");
		
	}
	
}
class Circle extends Shape
{

	@Override
	void Shape() {
		System.out.println("shape is circle");
		
	}
	
}

class Triangle extends Shape
{

	@Override
	void Shape() {
		System.out.println("shape is Triangle");
	}
	
}