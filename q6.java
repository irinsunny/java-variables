package com.nissan.app;

import java.util.Scanner;

public class q6 {
/*The distance between two cities (KM) is input through the keyboard. Write a program to convert and print this distance in meters, feet, inches and centimeters.
You can set the status of your assignment here.*/
	
	public static void main(String[] args) {
		Scanner s =new Scanner( System.in);
		System.out.println("enter the distance in km:");
		int a= Integer.parseInt(s.nextLine());
		System.out.println(" distance in meters: "+ a*1000);
		System.out.println(" distance in feet: "+ a*3281);
		System.out.println(" distance in inches: "+a*39370);
		System.out.println(" distance in centimeters: " +a+100000);
	}

}
