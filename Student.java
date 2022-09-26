// Name : S JASVAN SUNDAR               

// Batch : 2576

//Student Details

import java.util.Scanner;
pulbic class Student
{
	public static void main(String[] args)
	{
		int rollno;  //assuming roll no. as integer 
		String name;  //assuming Student name as string
		double attendance;  //assuming attendance percentage as a double
		System.out.println("Enter student details:");  //printing statement 
		Scanner sc=new Scanner(System.in);  //create a Scanner object
		System.out.println("Enter The RollNO.:");  //printing statement
		rollno=sc.nextInt();  //Read user input
		System.out.println("Enter the Name of Student:");  //printing statement
		name=sc.next();  //Read user input
		System.out.println("Enter the Percentage of Attendance:");  //printing statement
		attendance=sc.nextDouble();  //Read user input
		System.out.println("The Roll NO. is :"  +rollno);  //printing statement
		System.out.println("Name of the Student is :"  +name);  //printing statement
		System.out.println("Attendance Percentage is :" +attendance);  //printing statement
	}
}
