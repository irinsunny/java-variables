package com.nissan.app;

import java.util.Scanner;

public class q5 {
	/* Read two numbers, divide the first number by the second and print the quotient and remainder.*/
	

	public static void main(String[] args) {
		Scanner s =new Scanner( System.in);
		System.out.println("enter the two nos:");
		int a= Integer.parseInt(s.nextLine());
		int b= Integer.parseInt(s.nextLine());
		int q= (a/b);
		int r=a%b;
		System.out.println(" the quotient"+q+" the remainder is "+r);

	}

}
