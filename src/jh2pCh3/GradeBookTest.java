package jh2pCh3;
// Fig. 3.5: GradeBookTest.java 
//Creating a GradeBook object and pass a String to // ists displayMessage method.
import java.util.Scanner; // program uses scanner

public class GradeBookTest
{
	// main method begins program execution
	public static void main( String[] args)
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		
		// create a GradeBook object and assign it to myGradeBook
		GradeBook myGradeBook = new GradeBook();
		
		// prompt for and input course name
		System.out.println( "Please enter the course names:" );
		String nameOfCourse = input.nextLine(); // read a line of text
		System.out.println(); // outputs a blank line
		
		// call myGradeBook's displayMessage method
		// and pass name nameOfCourse as an argument
		myGradeBook.displayMessage( nameOfCourse );				
	} // end main
} // end class GradeBookTest