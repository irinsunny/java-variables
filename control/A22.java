package com.nissan.app;

import java.util.Scanner;

public class A22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* You are a Software developer in XYZ Company and you are asked to create a program to verify a user’s PIN code when a user visits an ATM.
		 *To implement this concept, you must use decisional statements to make appropriate decisions when a use’s PIN code matches with the pin
		 * code assigned to that user. For that, you have created a class named Verify, in which a user has to enter some numeric value as the PIN
		 *code during runtime. Apart from that, you have initialized a variable y with some numeric value and compare the value stored in the variable
		 *y with the value accepted from a user.*/
		

		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String pin="NULL";
		System.out.println("Enter the pin : ");
		pin = s.nextLine();
		
		if(checkPin(pin))
				System.out.println("Entered PIN is correct!!");
		else
				System.out.println("Entered PIN is incorrect!!");
	}
	public static boolean checkPin(String pin) {
		String actualPin = "1234";
		return pin.equals(actualPin);
	}

}
