package com.nissan.app;

import java.util.Scanner;

public class q11 {

	public static void main(String[] args) {
	/*if a five-digit number is given, write a program to reverse the number.*/
		Scanner s =new Scanner( System.in);
		System.out.println("enter a five digit nos:");
		int a= Integer.parseInt(s.nextLine());
		int rev=0,i,r;
		for( i=0;i<5;i++)
		{
			r=a%10;
			rev=rev*10+r;
			a=a/10;
		}
		System.out.println(" the sum of digits is =" +rev);
	}


	}


