package com.nissan.app;

import java.util.Scanner;

public class q10 {
	public static void main(String[] args) {
	/*If a five-digit number is input through the keyboard, write a program to calculate the sum of its digits.*/
		Scanner s =new Scanner( System.in);
		System.out.println("enter a five digit nos:");
		int a= Integer.parseInt(s.nextLine());
		int sum=0,i,r;
		for( i=0;i<5;i++)
		{
			r=a%10;
			sum=r+sum;
			a=a/10;
		}
		System.out.println(" the sum of digits is =" +sum);
	}

}
