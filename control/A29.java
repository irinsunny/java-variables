package com.nissan.app;

import java.util.Scanner;

public class A29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
Accept a real constant value from user and typecast this value into integer and print the result.
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a real constant : ");
		String constant = scan.next();
		System.out.println("The integer value is "+Integer.parseInt(constant));
	}

}
