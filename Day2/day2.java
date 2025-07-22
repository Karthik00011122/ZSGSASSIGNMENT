import java.util.*;

//1. Write a program that uses if statement to find the minimum of three numbers.

class MinCheck
{
	public static void main(String[] args)
	{
        int n1 = 44;
        int n2 = 50;
        int n3 = 69;
		if(n1 < n2 && n1 < n3)
		{
			System.out.println(n1);
		}
		else if(n2 < n1 && n2 < n3)
		{
			System.out.println(n2);
		}
		else
		{
			System.out.println(n3);
    	}
	}
}

/*2. Write a program to do the following patterns using for loop?
a) 1   1 b) R R R R
    1 1     R     R
     1      R R R R
    1 1     R   R
   1   1    R     R */

class Pattern1
{
	public static void main(String[] args)
	{
		int n = 5;
		isA_Pattern(n, 1);
		isB_Pattern(n, 'R');
	}
	
	public static void isA_Pattern(int n, int value)
	{
		System.out.println("This is A - Pattern");
		for(int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++) 
            {
                if (j == i || j == n - 1 - i) 
                {
                    System.out.print(value + " ");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
		}
	}
	
	public static void isB_Pattern(int n, char ch)
	{
		System.out.println("This is A - Pattern");
		int rows = n;
		int cols = n;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if((j==0) || (i==0 && j < cols-1) || (i==2 && j<cols - 1) || (j==cols - 2 && i==1) || (i - j==1 && i>=3)) 
				{
                    System.out.print(ch + " ");
                } 
				else 
				{
                    System.out.print("  ");
                }
		    }
			System.out.println();
		}
	}
}			

/*3. Write a program to do the following patterns using while loop?
a)    1     b) w
    2   3      w w
  4   5   6    w w w
    7   8      w w
      9        w      */

class Pattern2
{
	public static void main(String[] args)
	{
		int n = 5;
		isA_Pattern(n, 1);
		isB_Pattern(n, 'w');
	}
	
	public static void isA_Pattern(int n, int value)
	{
		System.out.println("This is A - Pattern");
        int i = 0;
        while (i < n) 
		{	
			int s = 0;
            while (s < Math.abs(n / 2 - i)) 
			{
                System.out.print(" ");
                s++;
            }   
            if (i > n / 2) 
			{
                int k = 0;
                while (k < n - i) 
				{	
                    System.out.print((value++) + " ");
                    k++;
                }
            } 
			else 
			{
                int j = 0;
                while (j <= i) 
				{
                    System.out.print((value++) + " ");
                    j++;
                }
            }
            System.out.println();
            i++;
        }
	}
	
	public static void isB_Pattern(int n, char ch) 
	{
		System.out.println("This is B - Pattern");
        int i = 0;
        while (i < n) 
		{
            if (i > n / 2) 
		    {
                int k = 0;
                while (k < n - i) 
				{
                    System.out.print(ch + " ");
                    k++;
                }
            }   
		    else  
		    {
                int j = 0;
                while (j <= i) 
				{
                    System.out.print(ch + " ");
                    j++;
                }
            }
            System.out.println();
            i++;
        }
    }
}			

/*4. Write a program to do the following patterns using do...while loop?
a) Pascal Triangle
b) ZOHO
   CORP
   ORAT
   IONS */
   
class Pattern3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of rows : Enter the string : ");
		
		int n = scan.nextInt();
        String str = scan.nextLine();
		
		isA_Pattern(n);
		isB_Pattern(str);
	}
	
    public static void isA_Pattern(int n) 
	{
        System.out.println("This is A - Pattern");
        int i = 0;
        do 
		{
            int j = 0;
            do 
			{
                if (j >= n - i)
				{
					break;
				}
                System.out.print(" ");
                j++;
            } while(true);

            int number = 1;
            j = 0;
            do 
			{
                if (j > i)
				{
					break;
				}
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
                j++;
            } while(true);
			
            System.out.println();
            i++;
			
        } while (i < n);
    }

    public static void isB_Pattern(String s) 
	{
        System.out.println("This is B - Pattern");
        s = s.replaceAll(" ", "");
        int ind = 0;
        int size = (int) Math.ceil(Math.sqrt(s.length()));
        char[][] mat = new char[size][size];

        int i = 0;
        do 
		{
            if (ind >= s.length())
			{
				break;
			}
            int j = 0;
            do 
			{
                if (j >= size || ind >= s.length())
				{
					break;
				}
                mat[i][j] = s.charAt(ind++);
                System.out.print(mat[i][j] + " ");
                j++;
            } while(true);

            System.out.println();
            i++;
        } while (i < size);
		
        System.out.println();
    }
}			

//5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.

class EvenSum
{
	public static void main(String[] args)
	{
		int n = 8;
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			if(i % 2 == 0)
			{
			    sum += i;
			}
			else
			{
				continue;
			}
		}
		System.out.println("Even numbers sum : " + sum);
	}
}

//6. Define a method to convert the decimal number to a binary number?

class DecimalToBinary
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Decimal Number : ");
	    int n = Scan.nextInt();
		DecToBin(n);
	}
	
	public static void DecToBin(int n)
	{
		String bin = "";
		int temp = n;
	    while(temp != 0)
	    {
		    int rem = temp % 2;
		    bin = rem + bin;
		    temp = temp / 2;
	    }
		System.out.print("Decimal : "+ n +" to Binary : " + bin);
	}
}
	
/*7. Use both if and switch case statement  as two ways to find the grade of a student.
     Percent>=85 && Percent<=100 Grade ‘A’
     Percent>=70 Grade ‘B’
     Percent>=50 Grade ‘C’
     otherwise print ”Fail” */
	
class FindGrade 
{
    public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Percent : ");
        int percent = scan.nextInt();

        String gradeIfElse = ifElseCheck(percent);
        System.out.println("if..else Statement Percent : " + percent + " => Grade '" + gradeIfElse + "'");

        String gradeSwitch = switchCheck(percent);
        System.out.println("switch Statement Percent : " + percent + " => Grade '" + gradeSwitch + "'");
    }

    public static String ifElseCheck(int n) {
        if (n >= 85 && n <= 100) 
		{
            return "A";
        } 
		else if (n >= 70) 
		{
            return "B";
        } 
		else if (n >= 50) 
		{
            return "C";
        } 
		else 
		{
            return "Fail";
        }
    }

    public static String switchCheck(int n) 
	{
        int avg = n / 10;
        switch (avg) 
		{
            case 10:
			    return "A";
            case 9:
                return "A";
            case 8:
                if (n >= 85) 
				{
                    return "A";
                } 
				else 
				{
                    return "B";
                }
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "C";
            default:
                return "Fail";
        }
    }
}

//Part-2 Arrays

//1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.

class OddSum
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int[] nums = new int[10];
		System.out.println("Enter Array Elements : ");
        for(int i = 0; i < nums.length; i++)
        {
			nums[i] = scan.nextInt();
		}
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] % 2 != 0)
			{
				sum += nums[i];
			}
	    }
		System.out.println("Odd number sum : " + sum);
	}
}

//2. Write a program to take in 10 values and print only those numbers which are prime.

class PrimeNumbers
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[10];
		
		System.out.println("Enter Array Elements : ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = scan.nextInt();
		}
		
		for(int i = 0; i < nums.length; i++)
		{
			if(isPrime(nums[i]))
			{
				System.out.print(nums[i] + " ");
			}
		}
	}
	
	public static boolean isPrime(int n)
	{
		int count = 0;
		for(int i = 1; i <= n; i++)
		{
			if(n % i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
	     	return true;
		}
		return false; 
	}
}

//3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.

class FibonacciArray
{
	public static void main(String[] args)
	{
		int[] fib = new int[30];
		fib[0] = 0;
		fib[1] = 1;
		int count = 2;
		for(int i = 2; ;i++)
		{
			if(count == 30)
			{
				break;
			}
			else
			{
				count++;
			}
			fib[i] = fib[i-1] + fib[i-2];
		}
		System.out.println("30 terms of Fibonacci Series : " + Arrays.toString(fib));
	}
}

/*4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function 
     arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. 
	 Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print 
	 the required result by invoking the function print( ). */
	 
class SingleAndDoubleDigitsSum
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input size of the array : ");
		
		int len = scan.nextInt();
		int[] nums = new int[len];
		
		System.out.println("Enter Array Elements : ");
		for(int i = 0; i < len; i++)
		{
			nums[i] = scan.nextInt();
		}
		print(nums, len);
	}
	
	public static void print(int[] x, int n)
	{
		int singleDigitSum = 0;
		int doubleDigitsSum = 0;
		for(int i = 0; i < n; i++)
		{
			if(x[i] >= 0 && x[i] <=9)
			{
				singleDigitSum += x[i];
			}
			if(x[i] >= 10 && x[i] <= 99)
			{
				doubleDigitsSum += x[i];
			}
		}
		System.out.println("Single Digit sum : " + singleDigitSum);
		System.out.println("Double Digits sum : " + doubleDigitsSum);
	}
}

/* 5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays 
      whether the two arrays are identical or not. Make suitable use of Boolean data type. 
      X[] =('m', 'n', 'o', 'p'} and 
      Y[] =('m', 'n', 'o', 'p' }  */
	  
class IdenticalCheck
{
	public static void main(String[] args)
	{
		char[] X = {'m', 'n', 'o', 'p'};
		char[] Y = {'m', 'n', 'i', 'p'};
		boolean identical = true;
		if(X.length != Y.length)
		{
			identical = false;
		}
		else
		{
			for(int i = 0; i < X.length; i++)
			{
				if(X[i] != Y[i])
				{
					identical = false;
				}
			}
		}
		
		if(identical)
		{
			System.out.println("The two arrays are identical");
		}
		else
		{
			System.out.println("The two arrays are not identical");
		}
	}
}

/* 6. Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary 
      search technique on the sorted array of integers given below . Output the message “record exists" if the value 
	  input is located in the array and if not output the message record does not exits”.
      {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002} */
	  

class BinarySearch
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Any year : ");
		
		int passedOut = scan.nextInt();
		int[] passedOutYears = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
		
		Arrays.sort(passedOutYears);
		
		if(isExists(passedOutYears, passedOut))
		{
			System.out.println("Record Exists");
		}
		else
		{
			System.out.println("Record does not Exists");
		}
	}
	
	public static boolean isExists(int[] passedOutYears, int passedOut)
	{
		int low = 0, high = passedOutYears.length - 1;
        while(low <= high) 
        {
            int mid = (low + high) / 2;
            if(passedOutYears[mid] == passedOut)
            {   
                return true;
            }
            else if(passedOutYears[mid] < passedOut && passedOut <= passedOutYears[high])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }          
        }
		return false;
	}
}
	  
/*7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the 
     Selection sort technique. */	  
	 
class SelectionSort
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] weights = new int[10];
		System.out.println("Enter Arrray Elements : ");
		for(int i = 0; i < weights.length; i++)
		{
			weights[i] = scan.nextInt();
		}
		
		for(int i = 0; i < weights.length - 1; i++)
		{
			int max = i;
			for(int j = i + 1; j < weights.length; j++) 
			{
				if(weights[j] > weights[max])
				{
					max = j;
				}
			}
			int temp = weights[i];
			weights[i] = weights[max];
			weights[max] = temp;
		}
		
		for(int i : weights)
		{
			System.out.print(i + " ");
		}
	}
}
//8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.	 

class AgeLimit
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] ages = new int[10];
		System.out.println("Enter Array Elements : ");
		for(int i = 0; i < ages.length; i++)
		{
             ages[i] = scan.nextInt();
		}
		
		int teen = 0, mid = 0, old = 0; 
		for(int i = 0; i < ages.length; i++)
		{
			if(ages[i] < 18)
			{
				teen++;
			}
			else if(ages[i] >= 18 && ages[i] <= 60)
			{
				mid++;
			}		
			else
			{
				old++;
			}
		}
		System.out.println("\nTotal " + teen + " peoples ages < 18");
		System.out.println("\nTotal " + mid + " peoples ages 18 - 60");
		System.out.println("\nTotal " + old + " peoples ages > 60");
	}
}

/*9. Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total 
     marks and average for all students in a table form. */
	 
class StudentDetails
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] student = new int[4*10];
		System.out.println("Enter Array Elements : ");
		for(int i = 0; i < student.length; i++)
		{
			student[i] = scan.nextInt();
		}
		
		int count = 0, total = 0, rollno = 0;
		double avg = 0;
		
		System.out.println("Roll No | Total | Average");
		for(int i = 0; i < student.length; i++)
		{
			if(count == 3)
			{
				count = 0;
				System.out.println(rollno + "        " + total + "        " + total/3); 
				total = 0;
			}
			if(i % 4 == 0)
			{
				rollno = student[i];
			}
			else
			{
				count++;
				total += student[i];
			}
		}
	}
}

/*10. Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use 
      user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
      ● To input elements into matrix of size m x n
      ● To display elements of matrix of size m x n
      ● Sum of all elements of matrix of size m x n
      ● To display row-wise sum of matrix of size m x n
      ● To display column-wise sum of matrix of size m x n
      ● To create transpose of matrix of size n x m   */
	 
class TwoDimensionalArray
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row size : ");
		int m = scan.nextInt();
		System.out.println("Enter the col size : ");
		int n = scan.nextInt();
		
		int[][] nums = new int[m][n];
		
		putElements(scan ,m, n, nums);
		displayElements(m, n, nums);
		sumAllElements(m, n, nums);
		rowWiseSum(m, n, nums);
		colWiseSum(m, n, nums);
		transposeArray(m, n, nums);
	}
	
	public static void putElements(Scanner scan, int m, int n, int[][] nums)
	{
		System.out.println("Enter Array Elements : ");
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				nums[i][j] = scan.nextInt();
			}
		}
	}
	
	public static void displayElements(int m, int n, int[][] nums)
	{
		System.out.println("The " + m + "x" + n + "  matrix :");
	    for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void sumAllElements(int m, int n, int[][] nums)
	{
        int sum = 0;
        for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				sum += nums[i][j];
			}
		}
		System.out.println("Sum of the elements in the matrix : " + sum);
	}
	
	public static void rowWiseSum(int m, int n, int[][] nums)
	{
        for(int i = 0; i < m; i++)
		{
			int rowSum = 0;
			for(int j = 0; j < n; j++)
			{
				rowSum += nums[i][j];
			}
			System.out.println("Row-wise Sum of the elements in the matrix for row " + i + " : " + rowSum);
		}		
	}
	
	public static void colWiseSum(int m, int n, int[][] nums)
	{
        for(int i = 0; i < m; i++)
		{
			int colSum = 0;
			for(int j = 0; j < n; j++)
			{
				colSum += nums[j][i];
			}
			System.out.println("Column-wise Sum of the elements in the matrix for column " + i + " : " + colSum);
		}		
	}
	
	public static void transposeArray(int m, int n, int[][] nums)
	{
		int[][] transpose = new int[n][m];
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				transpose[j][i] = nums[i][j];
			}
     	}	
        System.out.println("Transpose Array : ");		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
                System.out.print(transpose[i][j] + " ");				
			}
			System.out.println();
		}
	}
}

//Part-3 Strings

/*1. Given two binary strings a and b, return their sum as a binary string.
     Input: a = "11", b = "1"
     Output: "100" 
	 Input: a = "1010", b = "1011" 
     Output: "10101"  */
	 
class BinarySum 
{
     public static void main(String[] args)
	 {
          Scanner scan = new Scanner(System.in);
		  System.out.println("Enter the Binary Strings a and b : ");
		  String a = scan.next();
		  String b = scan.next();
		  
		  int x = a.length() - 1;
		  int y = b.length() - 1;
		  int carry = 0;
		  String sum = "";
		  
		  while(x >= 0 || y >= 0 || carry > 0)
		  {
			  int s1 = 0;
			  int s2 = 0;
			  if(x >= 0)
			  {
			      s1 = a.charAt(x) - '0';
			  }
			  if(y >= 0)
			  {
				  s2 = b.charAt(y) - '0';
			  }
			  int total = s1 + s2 + carry;
			  int digit = total % 2;
			  carry = total / 2;
			  sum = digit + sum;
			  
			  x--;
			  y--;
		  }
		  System.out.println("The sum of binary value is : " + sum);
	 }
}

/* 2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
      Example 1:
      Input: columnNumber = 1
      Output: "A"
‌
      Example 2:
      Input: columnNumber = 28
      Output: "AB"
‌
      Example 3:
      Input: columnNumber = 701
      Output: "ZY" */

class ExcelSheetColumn
{
    public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		
		int temp = n;
		String Str = "";
        while (temp > 0) 
        {
            temp--;
            int rem = temp % 26;
            Str = (char) ('A'+rem)+Str;
            temp /= 26;
        }
        System.out.println("Excel Sheet Column Title of " + n + ": " + Str);
	}
}

/*3. Given a string s, reverse only all the vowels in the string and return it.
     The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
     Example 1:
     Input: s = "hello"
     Output: "holle"
‌
     Example 2:
     Input: s = "leetcode"
     Output: "leotcede" */

class ReverseVowels
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = scan.next();
		String str1 = "";
		for(int i = s.length() - 1; i >= 0; i--)
		{
			if(isVowel(s.charAt(i)))
			{
			   str1 += s.charAt(i);
		    }
		}
		String str2 = "";
		int j = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(isVowel(s.charAt(i)))
			{
			   str2 += str1.charAt(j++);
		    }
			else
		    {
			   str2 += s.charAt(i);
		    }
		}
		System.out.println("Reversing vowels in Array : " + str2);
	}
	public static boolean isVowel(char ch)
	{
		return "aeiouAEIOU".indexOf(ch)!= -1;
	}
}

/*4. You are given two strings s and t.
     String t is generated by random shuffling string s and then add one more letter at a random position.
     Return the letter that was added to t.
‌
     Example 1:
     Input: s = "abcd", t = "abcde"
     Output: "e"
     Explanation: 'e' is the letter that was added.
‌
     Example 2:
     Input: s = "", t = "y"
     Output: "y" */
	 
class AddedLetter
{
     public static void main(String[] args)
	 {
          Scanner scan = new Scanner(System.in);
		  System.out.println("Enter the two String : ");
          String s = scan.next();
          String t = scan.next();		  
		  char added = '\u0000';
		  for(int i = 0; i < t.length(); i++)
		  {
			  char ch = t.charAt(i);
			  if(s.indexOf(ch) != -1)
	          {
				  continue;
			  }
			  else
			  {
				  added = ch;
				  break;
			  }
		  }
		  System.out.println("'" + added + "' is the letter that was added");
	 }
}

/*5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
     A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) 
	 of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a 
	 subsequence of "abcde" while "aec" is not).
‌
     Example 1:
     Input: s = "abc", t = "ahbgdc"
     Output: true
‌
     Example 2:
     Input: s = "axc", t = "ahbgdc"
     Output: false     */

class  SubSequenceCheck
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two String : ");
        String s = scan.next();
        String t = scan.next();	
		
		boolean isSubSequence = true;
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if(t.indexOf(ch) == -1)
			{
				isSubSequence = false;
				break;
			}
		}
		System.out.println(isSubSequence);
	}
}

/*6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
     You must solve the problem without using any built-in library for handling large integers (such as BigInteger). 
	 You must also not convert the inputs to integers directly.
‌
     Example 1:
     Input: num1 = "11", num2 = "123"
     Output: "134"
‌
     Example 2:
     Input: num1 = "456", num2 = "77"
     Output: "533"
‌
     Example 3:
     Input: num1 = "0", num2 = "0"
     Output: "0"  */
	 
class SumTwoNumbers
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two number : ");
		String num1 = scan.next();
		String num2 = scan.next();
		
        int x = num1.length() - 1;
		int y = num2.length() - 1;
		int carry = 0;
		String sum = "";
		
		while(x >= 0 || y >= 0 || carry > 0)
		{
			int s1 = 0;
			int s2 = 0;
			
			if(x >= 0)
			{
				s1 = num1.charAt(x) - '0';
				x--;
			}
			if(y >= 0)
			{
				s2 = num2.charAt(y) - '0';
				y--;
			}
			int total = s1 + s2 + carry;
		    int digit = total % 10;
			sum = digit + sum; 
		    carry = total / 10;
		}
		
		System.out.println("Sum of the " + num1 + " + " + num2 + " = " + sum);
	}
}

/*7. Given a string s, return the number of segments in the string.
     A segment is defined to be a contiguous sequence of non-space characters.
‌
     Example 1:
     Input: s = "Hello, my name is John"
     Output: 5
     Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
     Example 2: 
     Input: s = "Hello"
     Output: 1 */
	 
class NumberOfSegments
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = scan.nextLine();
		
        String[] str = s.trim().split("\\s+");
    
        System.out.println("Number of segments in the string: " + str.length);
	}
}

/*8. We define the usage of capitals in a word to be right when one of the following cases holds:
     1. All letters in this word are capitals, like "USA".
     2. All letters in this word are not capitals, like "leetcode".
     3. Only the first letter in this word is capital, like "Google".
     Given a string word, return true if the usage of capitals in it is right.
	 
     Example 1:
     Input: word = "USA"
     Output: true
‌
     Example 2:
     Input: word = "FlaG"
     Output: false    */
	 
class CheckLetters
{
    public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String word = scan.next();
		
		int lower = 0;
        int upper = 0;
		boolean isRight = false;
        for(int i = 0; i < word.length(); i++)
        {
            if (Character.isLowerCase(word.charAt(i)))
            {
                lower++;
            }
            else if (Character.isUpperCase(word.charAt(i)))
            {
                upper++;
            }
        }
        if(upper == word.length() || lower == word.length() || Character.isUpperCase(word.charAt(0)) && lower == word.length()-1)
        {
            isRight = true;
        }
        System.out.println(isRight);
	}
}