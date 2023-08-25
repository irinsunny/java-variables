package com.nissan.app;

public class A28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
Create a parameterized constructor in the above Box class to initialize the instance variables. Then calculate the volume and print it.
*/
		Box b1 = new Box(12, 15, 10);
		Box b2 = new Box(10, 5, 2);
		
		System.out.println("Volume of box 1 = "+b1.volume());
		System.out.println("Volume of box 2 = "+b2.volume());
	}

}
