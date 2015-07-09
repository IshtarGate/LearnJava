package jh2pCh3;
// Fig. 3.10: GradeBook.java // GradeBook class with a constructor to initialize the course name.

public class GradeBook
{
	private String courseName; // course name for this GradeBook
	
	// constructor
	
	
	// method to set the course name
	public void setCourseName ( String name)
	{
		courseName = name; // store the course name
	} // end method setCourseName
		
	// method to retrieve the course name
	public String getCourseName()
	{
		return courseName;
	} // end method getCourseName
	
	// display a welcome message to the GradeBook user
	public void displayMessage()
	{
		// calls the getCourseName to get the name of
		// the course this GradeBook represents
		System.out.printf( "Welcome to the grade book for\n%s !\n",
				getCourseName() );
	} // end method displayMessage
} // end class GradeBook