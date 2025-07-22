import java.util.*;

//1. Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?

class Variables
{
    static int stat ;                               //Static variable
    int inst ;                                      //Instance variable
    public static void main(String[] args)
	{
	     Variables.stat = 15;
		 Variables.stat = 20;
		 int local = 25;    		                //Local variable or Block variable
		 if(stat == 20)
		 {
			 String block = "Inside Block" ; 
			 System.out.println("Block : " + block);//Block variable
		 }
	     Variables obj1 = new Variables();
		 Variables obj2 = new Variables();
		 obj1.inst = 30;
		 obj2.inst = 35; 
		 final int fin = 40;       		            //Final variable
		 System.out.println("stat : " + stat);
		 System.out.println("Local : " + local);
		 System.out.println("obj1 - inst : " + obj1.inst);
		 System.out.println("obj2 - inst : " + obj2.inst);
		 System.out.println("fin : " + fin);
	}
}

//2. Write a program in which, declare all data types like integer, double, float, long integer, character and byte data and print them.

class DataTypes 
{
	public static void main(String[] args)
	{
	    int n1 = 10;
	    double n2 = 17.9999999999;
	    float n3 = 3.14f;
	    long n4 = 9876543210l;
	    char ch = 'A';
	    byte n5 = 127;
		System.out.println("Integer : " + n1);
		System.out.println("Double : " + n2);
		System.out.println("Float : " + n3);
		System.out.println("Long : " + n4);
		System.out.println("Character : " + ch);
		System.out.println("Byte : " + n5);
	}
}

//3. Write a program to find the maximum of two numbers using ternary operator.

class Ternary
{
	public static void main(String[] args)
	{
		int n1 = 10;
		int n2 = 20;
		int max = (n1 > n2)? n1 : n2;
		System.out.println(max);
	}
}

//4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?

class EqualCheck
{
	public static void main(String[] args)
	{
		int n1 = 8;
		int n2 = 4;
		int xor = n1 ^ n2;
		boolean[] eq = new boolean[xor+1];
		eq[xor] = true;
		if(eq[0])
		{
			System.out.print("Two number is Equal");
		}
		else
		{
			System.out.print("Two number is not equal");
		}
	}
}
			

//5. Write a program that illustrate the execution order of static block and initializer block?

class StaticAndInitializer
{
	int n = 10;
	{
		n = 20;
	}
	static
	{
		System.out.println("Static print first then Initializer print");
	}
	public static void main(String[] args)
	{
		StaticAndInitializer obj = new StaticAndInitializer();
		System.out.print("n = " + obj.n);
	}
}

//6. Write a program that illustrate the Explicit type casting?

class ExplicitCast
{
	public static void main(String[] args)
	{
		long n = 9876543210l;
		int m = (int) n;
        System.out.println(m);
	}
}

//7. Write a program to check if a number is a power of 2?

class PowerOf
{
	public static void main(String[] args)
	{
		int n = 22;
		int temp = n;
		while(temp > 2)
		{
			if(temp % 2 == 0)
			{
				temp = temp / 2;
			}
			else
			{
				System.out.println(n + " is the not power of 2");
				break;
			}
		}
		if(temp == 2)
		{
			System.out.println(n + " is the power of 2");
		}
    }
}

//8. Write a program to find the first set bit of a number?

class SetBit
{
	public static void main(String[] args)
	{
		int pos = 1;
		int n = 8;
		String bin = "";
		while(n != 0)
		{
			int rem = n % 2;
			bin = rem + bin;
			n = n / 2;
		}
		for(int i = bin.length()-1; i >= 0; i--)
		{
			if(bin.charAt(i) == '0')
			{
				pos++;
			}
			else
			{
				break;
			}
		}
		System.out.println(pos);
	}
}

/*9. Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor 
     Employee(int empId, String name, String department, double salary) and assign these variables to instance variables 
	 accordingly and display them?*/
	 
class Employee
{
    int empId;
	String name;
	String department;
	double salary;
	
	Employee(int empId, String name, String department, double salary)
	{
		this.empId = empId;
		this.name = name;
        this.department = department;
		this.salary = salary;
	}
	public void display()
	{
		System.out.print("Employee ID : " + empId + "\nEmployee Name : " +name+ "\nEmployee Department : " +department+
                    	 "\nEmployee Salary : " + salary);
	}
	public static void main(String[] args)
	{
		Employee obj1 = new Employee(1, "Karthik", "BSC", 100000);
		obj1.display();
	}
}

//10. Write a program to check whether the object is an instance of a particular class?

class ObjCheck
{
	int n;
	String s;
	public static void main(String[] args)
	{
		ObjCheck obj = new ObjCheck();
		if(obj instanceof ObjCheck)
		{
			System.out.print("The object is an instanceof a class");
		}
        else
		{
            System.out.print("The object is not an instanceof a class");
		}
	}
}	