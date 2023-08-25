package com.nissan.app;

import java.util.Scanner;

public class A21 {

	public static void main(String[] args) {
		/*Consider an electricity billing calculation. There are two types of customers. Domestic and Industry. If it is domestic, the slabs are like this,
The reading in the range,0-100 then amt=units* Rs.1

100-200amt=units*1.5

200-500amt=units*2

>500amt = units*5

If it is industrial, the amt =units*10.

*/
		double amt;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the type of customer");
		String customer= s.nextLine();
		System.out.println(" enter the reading");
		int r = Integer.parseInt(s.nextLine());
		if(customer=="industry")
			System.out.println(" the bill is "+ r*10);
		else
		{
			if( r>0 && r<=100)
				amt= r*1;
			else if( r>100 &&r<=200)
				amt= r*1.5;
			else if( r>200 &&r<=500)
				amt= r*2;
			else
				amt= r*5;
		
			System.out.println("the electricity bill is "+ amt);		
}
	}
}


