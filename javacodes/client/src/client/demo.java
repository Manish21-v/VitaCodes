package client;

import COM.MANISH.Area;
import COM.MANISH.perimeter;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Area a= new Area();
		Area a1= new Area(30);
		System.out.println(a1.calArea(6, 6));
		perimeter p =new perimeter(30);
		System.out.println(p.getperi(5, 6));
		
	}

}
