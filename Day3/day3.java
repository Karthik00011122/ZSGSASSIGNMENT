import java.util.*;

/*Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of 
  roll_no as '2' and that of name as "John" by creating an object of the class Student. */

class Student
{
	String name = "Jhon";
	int roll_no = 2;
	public static void main(String[] args)
	{
		Student obj = new Student();
		System.out.println("Student Rollno : " + obj.roll_no + "\n Student Name : " + obj.name);
	}
}

