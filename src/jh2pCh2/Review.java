package jh2pCh2;

import java.util.Scanner;

public class Review 
{

	
	public static void main( String[] args)
	{
	
		int value;
	
	
		Scanner myscanner = new Scanner( System.in);
	
		System.out.print("Please enter a number");
		value = myscanner.nextInt();
		
		System.out.println("This is a Java program\n");
		System.out.println("This is a Java\nProgram\n");
		System.out.printf("%s\n%s\n","This is a Java","program");
		
		if (value != 7)
		{
			System.out.print("The variable number is not equal to 7");
		}
		
		// This program will calculate the product of three integers.
		
		Scanner input = new Scanner( System.in );
		int x;
		int y;
		int z;
		int result;
		
		System.out.print("Enter an integer");
		x = input.nextInt();
		System.out.print("Enter another integer");
		y = input.nextInt();
		System.out.print("Enter yet another integer");
		z = input.nextInt();
		
		result = x*y*z;
		
		System.out.printf("%d is your answer",result);
		
		input.close();
		myscanner.close();
	}
}


