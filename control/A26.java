package com.nissan.app;

public class A26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
Create the following output using for loop
..........

.........

........

.......

......

.....

....

...

..

.


*/
		int i,j;
		for(i=0;i<10;i++) 
		{
			for(j=10;j>i;j--) {
				System.out.print(".");
			}
			System.out.println();
		}	
	}

}
