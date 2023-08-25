package com.nissan.app;

import java.util.Scanner;

public class A25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
Create a menu driven program using do-while and switch-case which implements a help system for Java’s selection and iteration statements.
 You have to display the syntax of selected control statement.
Help on:

1. if

2. switch

3. while

4. do-while

5. for

Choose one:

4+

The do-while:

do {

statement;

 } while (condition);
*/

		Scanner scan = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Choose an option:");
			System.out.println("1-If");
			System.out.println("2-Switch");
			System.out.println("3-While");
			System.out.println("4-do-while");
			System.out.println("5-for");
			System.out.println("6-Exit");
			System.out.println("Choose An Option : ");
			choice = Integer.parseInt( scan.nextLine());
			
			switch(choice) {
				case 1:
					System.out.println("if (condition) {");
					System.out.println("	  // block of code to be executed if the condition is true");
					System.out.println("	}");
					break;
				case 2:
					System.out.println("switch(expression) {");
					System.out.println("  case x:");
					System.out.println("    // code block");
					System.out.println("    break;");
					System.out.println("  case y:");
					System.out.println("    // code block");
					System.out.println("    break;");
					System.out.println("  default:");
					System.out.println("    // code block");
					System.out.println("}");
					break;
				case 3:
					System.out.println("while (condition) {");
					System.out.println("	  // code block to be executed");
					System.out.println("	}");
					break;
				case 4:
					System.out.println("do {");
					System.out.println("	  // code block to be executed");
					System.out.println("	}");
					System.out.println("	while (condition);");
					break;
				case 5:
					System.out.println("for (statement 1; statement 2; statement 3) {");
					System.out.println("	  // code block to be executed");
					System.out.println("	}");
					break;
			}
		}while(choice!=6);
		
	}

}
