package com.nissan.app;

import java.util.Scanner;

public class A23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
Write a program that uses an if-else-if ladder to determine which season a particular
Month is in.
Months 1, 2 and 12 are come under winter season.
Months 3, 4 and 5 are come under spring season.
Months 6, 7 and 8 are come under summer season.
Months 9, 10 and 11 are come under autumn season.
Accept a number for month from user and print the result accordingly.
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for month : ");
		int month = Integer.parseInt( scan.nextLine());
		String result="null";
		if(month==1||month==2||month==12)
			result="Winter";
		else if(month==3||month==4||month==5)
			result="Spring";
		if(month==6||month==7||month==8)
			result="Summer";
		if(month==9||month==10||month==11)
			result="Autumn";
		System.out.println("Season is "+result);

	}

}
