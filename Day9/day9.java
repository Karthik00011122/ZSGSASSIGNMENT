import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/*1. int[] arr = {2, 5, 1, 4, 0, 7};
     int quotient = arr[7] / arr[4];
     Develop a Java program which handles any unexpected situations that may arise during execution.*/

class TryCatch
{
	public static void main(String[] args)
	{
		int[] arr = {2, 5, 1, 4, 0, 7};
		try
		{
			int quotient = arr[7]/arr[4];
			System.out.println("Quotient : " + quotient);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException : " +e.getMessage());
		}
	}
}

/*Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, and perform division, 
  and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException and Exception.*/
  
class ExceptionHandle
{
    public static void main(String[] args)
	{
        Scanner scan = new Scanner(System.in);
		try
		{
			//InputMismatchException
			System.out.println("Enter any number : ");
			int num = scan.nextInt();
	
	    	//NumberFormatException
			System.out.println("Enter Any two numbers : ");
		    String num1 = scan.next();
		    String num2 = scan.next();
			
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			
			//ArithmaitcException
			int division = n1/n2;	
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException : " + e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException : " + e.getMessage());
		}
		catch(ArithmeticException e)
        {
			System.out.println("ArithmeticException : " + e.getMessage());
		}		
	}
}

//3. Write a program to illustrate how to throw a ClassNotFoundException.

class ClassNotFound
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("Hello");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}

//4.Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using try-catch.

class StringToNumber
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Emter any number : ");
		String num = scan.nextLine();
		
		integerParseInt(num);
	}
	
	public static void integerParseInt(String num)
	{
	    try
	    {
			System.out.println(Integer.parseInt(num));
		}
		catch(NumberFormatException e)
	    {
		    e.printStackTrace();
	    }
	}
}

/*5.Create a program where try block contains a return statement. Ensure that finally block executes before the method returns. 
    Show this with output.*/
	
class FinallyFirst
{
    public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		try
		{
			System.out.println("Enter any two numbers : ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			System.out.println("Division : " + divide(num1, num2));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static int divide(int n1, int n2)
	{
		try
		{
		    return n1 / n2;
		}
		finally
		{
			System.out.println("Finally Executed First");
		}
	}
}

/*6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.*/

class AtmPin
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter the ATM PIN : ");
			String s = scan.nextLine();
			
			if(s.length() != 4)
			{
				throw new Exception("LengthNotEqualException");
			}
			for(int i = 0 ; i < 4; i++)
			{
			    if(!Character.isDigit(s.charAt(i)))
				{
					throw new Exception("NoNumericCharactersException");
				}
			}
			if(s.charAt(0) == '0')
			{
				throw new Exception("FirstLetterZeroException");
			}
			System.out.println("Valid");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

/*7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3, 
     which throws the exception). Handle the exception in method1.*/
	 
class MethodException
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an two numbers");
		int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        
        method1(n1, n2);		
	}
	
	public static void method1(int n1, int n2)
	{
		try{
		     method2(n1, n2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void method2(int n1, int n2)
	{
		 method3(n1, n2);
	}
	
	public static void method3(int n1, int n2)
	{
		int n =  n1 / n2;	
		System.out.println(n);
	}
}

/*8. Design a login system that throws AuthenticationException if the username or password is incorrect. Handle it and 
     display a login failure message*/
	 
class LoginSystem
{
	public static void main(String[] args)
	{
		String username = "Karthik";
		String password = "Kar@012";
		
		Scanner scan = new Scanner(System.in);
		try
		{
			System.out.println("Enter Your Username : ");
		    String un = scan.next();
		    System.out.println("Enter Your Password : ");
			String pwd = scan.next();
		
		    if(!(username.equals(un) && password.equals(pwd)))
		    {
			    throw new Exception("AuthenticationException");
		    }
			System.out.println("Login Successful");
		}
		catch(Exception e)
		{
			System.out.println("Login failure : " + e.getMessage());
		}
	}
}

//9.Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.

class GetFile
{
	public static void main(String[] args)
	{
	    try
	    {
	        FileReader freader=new FileReader("C:/Users/This Pc/Documents/Assignment/raja.txt");		
	        int readingData=freader.read();
	        System.out.println("File Rading Successfully");
	    }
	    catch(FileNotFoundException  e)
	    {
	        System.out.println("Something happens: "+ e.getMessage());
	    }
	    catch(IOException e)
	    {
		    System.out.println("IO Exception:  "+e.getMessage());
	    }
	    finally
	    {
	        System.out.println("finally has executed");
	    }
	}
}

/*10. Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote. 
      Use a custom exception to handle the scenario when an ineligible person tries to register for voting. Display 
	  appropriate messages for eligible and ineligible voters.*/
	  
class VotingSystem
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		try
		{
			System.out.println("Enter the age : ");
		    int age = scan.nextInt();
		
		    if(age < 18)
		    {
			    throw new Exception("AgeNotEligibleException");
		    }
		    else
	 	    {    
		        System.out.println("Eligible Voter");
		    }
		}
		catch(Exception e)
		{
			System.out.println("In Eligible Voter : " + e.getMessage());
		}
	}
}