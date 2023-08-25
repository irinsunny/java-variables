package com.nissan.app;

import java.util.Scanner;

public class q9 {
	public static void main(String[] args) {
	// Raju’s basic salary is given. His dearness allowance is 40% of the basic salary and house rent allowance is 20%. 
	//Calculate his total salary.	
		Scanner s =new Scanner( System.in);
		System.out.println("enter the basic salary:");
		float b= Float.parseFloat(s.nextLine());
		
		System.out.println(" total salary=" +(b+(b*.4)+(b*.2) ));
	}
}
