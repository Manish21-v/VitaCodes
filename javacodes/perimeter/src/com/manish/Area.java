package com.manish;

/*class perimeter {
	
	public static void main(String[] args) {
		int result;
		
		calperi o= new calperi();
		result=o.getperi(5,6);
		System.out.println("Perimeter is "+ result);
		
		
		Area a = new Area();
		
		System.out.println("Area is " + a.calArea(5, 6));

	}

}
*/

public class Area
{
	int calArea(int a, int b)
	{
		int value= (a*b);
		return value;
	}
	
}

class calperi
{
	
	int getperi(int a,int b)
	{
		int value=2*(a+b);
		return value;
	}
	
	
	
}