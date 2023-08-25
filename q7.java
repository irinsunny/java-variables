package com.nissan.app;

import java.util.Scanner;

public class q7 {
	public static void main(String[] args) {

		/*
		 * The temperature of a city in Fahrenheit is given. Write a program to convert
		 * it into Celsius.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("enter the temperature in Fahrenheit:");
		int f = Integer.parseInt(s.nextLine());
		float c = (float) ((f - 32) / 1.8);
		System.out.println(" temperature in celius" +c);
	}

}
