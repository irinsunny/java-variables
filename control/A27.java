package com.nissan.app;

public class A27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
Create a Box class with three instance variables as width, height, depth. Create a method inside this class which returns the volume. 
Create two different objects in other class assign values for instance variable and calculate the volume and print it.
*/
		Box b1 = new Box();
		Box b2 = new Box();
		
		System.out.println("Volume of box 1 = "+b1.volume(12, 15, 10));
		System.out.println("Volume of box 2 = "+b2.volume(10, 5, 2));
	
	}

}
