import java.util.*;

//1.

class Vehicle 
{
    double mileage;
    double price;
}

class Car extends Vehicle 
{
    double ownershipCost;
    int warranty;
    int seatingCapacity;
    String fuelType;
}

class Bike extends Vehicle 
{
    int numCylinders;
    int numGears;
    String coolingType;
    String wheelType;
    int fuelTankSize;
}

class Audi extends Car 
{
    String modelType;

    public void display() 
	{
        System.out.println("----- Audi Car Info -----");
        System.out.println("Model Type     : " + modelType);
        System.out.println("Ownership Cost : " + ownershipCost);
        System.out.println("Warranty       : " + warranty + " years");
        System.out.println("Seating Cap.   : " + seatingCapacity);
        System.out.println("Fuel Type      : " + fuelType);
        System.out.println("Mileage        : " + mileage + " km/l");
        System.out.println("Price          : " + price + "\n");
    }
}

class Ford extends Car 
{
    String modelType;

    public void display() 
	{
        System.out.println("----- Ford Car Info -----");
        System.out.println("Model Type     : " + modelType);
        System.out.println("Ownership Cost : " + ownershipCost);
        System.out.println("Warranty       : " + warranty + " years");
        System.out.println("Seating Cap.   : " + seatingCapacity);
        System.out.println("Fuel Type      : " + fuelType);
        System.out.println("Mileage        : " + mileage + " km/l");
        System.out.println("Price          : " + price + "\n");
    }
}

class Bajaj extends Bike 
{
    String makeType;

    public void display() 
	{
        System.out.println("----- Bajaj Bike Info -----");
        System.out.println("Make Type      : " + makeType);
        System.out.println("Cylinders      : " + numCylinders);
        System.out.println("Gears          : " + numGears);
        System.out.println("Cooling Type   : " + coolingType);
        System.out.println("Wheel Type     : " + wheelType);
        System.out.println("Fuel Tank Size : " + fuelTankSize + " inches");
        System.out.println("Mileage        : " + mileage + " km/l");
        System.out.println("Price          : " + price + "\n");
    }
}

class TVS extends Bike 
{
    String makeType;

    public void display() 
	{
        System.out.println("----- TVS Bike Info -----");
        System.out.println("Make Type : " + makeType);
        System.out.println("Cylinders : " + numCylinders);
        System.out.println("Gears : " + numGears);
        System.out.println("Cooling Type : " + coolingType);
        System.out.println("Wheel Type : " + wheelType);
        System.out.println("Fuel Tank Size : " + fuelTankSize + " inches");
        System.out.println("Mileage : " + mileage + " km/l");
        System.out.println("Price : " + price + "\n");
    }
}

class Vehicles
{
    public static void main(String[] args) 
	{
        
        Audi audi = new Audi();
        audi.modelType = "Audi A6";
        audi.ownershipCost = 500000;
        audi.warranty = 5;
        audi.seatingCapacity = 5;
        audi.fuelType = "Petrol";
        audi.mileage = 15.0;
        audi.price = 6000000;
        audi.display();

        Ford ford = new Ford();
        ford.modelType = "Ford Mustang";
        ford.ownershipCost = 300000;
        ford.warranty = 3;
        ford.seatingCapacity = 4;
        ford.fuelType = "Petrol";
        ford.mileage = 12.0;
        ford.price = 5500000;
        ford.display();

        Bajaj bajaj = new Bajaj();
        bajaj.makeType = "Bajaj Pulsar";
        bajaj.numCylinders = 1;
        bajaj.numGears = 5;
        bajaj.coolingType = "Air";
        bajaj.wheelType = "Alloys";
        bajaj.fuelTankSize = 13;
        bajaj.mileage = 50.0;
        bajaj.price = 120000;
        bajaj.display();

        TVS tvs = new TVS();
        tvs.makeType = "TVS Apache";
        tvs.numCylinders = 1;
        tvs.numGears = 5;
        tvs.coolingType = "Oil";
        tvs.wheelType = "Spokes";
        tvs.fuelTankSize = 12;
        tvs.mileage = 45.0;
        tvs.price = 110000;
        tvs.display();
    }
}

//2.

class TwoD 
{
    double x, y;
    TwoD() 
	{
        System.out.println("TwoD default constructor");
    }

    TwoD(double x, double y) 
	{
        System.out.println("TwoD constructor with two arguments");
        this.x = x;
        this.y = y;
    }
}

class ThreeD extends TwoD 
{
    double z;
    ThreeD() 
	{
        super();
    }
    ThreeD(double x, double y, double z) 
	{
        super(x, y);
        this.z = z;
    }

    void setDistance(double x, double y, double z) 
	{
		this.x = x;
        this.y = y;
		this.z = z;
	}

    double getDistance(ThreeD t) 
	{
        return Math.sqrt((x - t.x) * (x - t.x) + (y - t.y) * (y - t.y) + (z - t.z) * (z - t.z));
    }

    void showDistance() 
	{
        System.out.println("Point: (" + x + ", " + y + ", " + z + ")");
    }
}

class Distance 
{
    public static void main(String[] args) 
	{
        ThreeD p1 = new ThreeD(); 
        p1.setDistance(1, 2, 3);
        p1.showDistance();
		
        ThreeD p2 = new ThreeD(4, 5, 6); 
        p2.showDistance();

        System.out.println("Distance: " + p1.getDistance(p2));
    }
}

//3.

class Point
{
	private int x;
	private int y;
	
	Point()
	{
		x = 0;
		y = 0;
	}
	public void setPoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	
	public void showPoint()
	{
	    System.out.println("(" + x + ", " + y + ")");
	}
}

class Circle extends Point
{
	private double r;
	Circle()
	{
		r = 1;	
	}
    public void setR(double r) 
	{
        if (r > 0)
		{
            this.r = r;
		}
        else
		{
            r = 1;
		}
    }
	
	public double getR()
	{
		return r;
	}
	public double getArea()
	{
		return Math.PI * r * r;
	}
	
	public void showCircle()
	{
		System.out.print("Circle center : ");
		showPoint();
		System.out.println("Circle Radius : " + getR());
		System.out.printf("Circle Area : %.2f" , getArea());
	}
}

class Circles
{
	public static void main(String[] args)
	{
	    Circle c = new Circle();
		c.setPoint(2, 2);
		c.setR(1);
		c.showCircle();
	}
}

//4.

interface A 
{
    void displayA();
}

interface B 
{
    void displayB();
}

class C implements A, B 
{
    public void displayA() 
	{
        System.out.println("Interface A");
    }

    public void displayB() 
	{
        System.out.println("Interface B");
    }
}

class Test 
{
    public static void main(String[] args) 
	{
        C obj = new C();
        obj.displayA();
        obj.displayB();
    }
}

//5.

class Shape 
{
    void display() 
	{
        System.out.println("This is a shape");
    }
}

class Polygon extends Shape 
{
    void display() 
	{
        System.out.println("Polygon is a shape");
    }
}

class Rectangle extends Polygon 
{
    void display() 
	{
        System.out.println("Rectangle is a polygon");
    }
}

class Triangle extends Polygon 
{
    void display() 
	{
        System.out.println("Triangle is a polygon");
    }
}

class Square extends Rectangle 
{
    void display() 
	{
        System.out.println("Square is a rectangle");
    }
}

class Inherits 
{
    public static void main(String[] args) 
	{
        Shape shape = new Shape();
        Polygon polygon = new Polygon();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        shape.display();
        polygon.display();
        rectangle.display();
        triangle.display();
        square.display(); 
	}
}

//6.

class MyString
{
	private char[] ch;
	MyString(String s)
	{
		this.ch = s.toCharArray();
	}
	
	//1. int length() – Returns the number of characters.
	
	public int length()
	{
		return ch.length;
	}
	
	//2. char charAt(int index) – Returns the character at the specified index.
	
	public char charAt(int i)
	{
		return ch[i-1];
	}
	
	//3. boolean equals(MyString other) – Checks if two MyString objects are equal.
	
	public boolean equals(String s1)
	{
		char[] ch1 = s1.toCharArray();
		for(int i = 0; i < ch1.length; i++)
		{
			if(ch[i] != ch1[i])
			{
				return false; 
			}
		}
		return true;
	}
	
	//4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
	
	public String toUpperCase()
	{
		String str = "";
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] >= 'a' && ch[i] <= 'z')
			{
			    str += (char) (ch[i] - 32);
			}
			else
			{
				str += ch[i];
			}
		}
		return str;
	}
	
	//5. MyString toLowerCase() – Returns a new string with all characters in lowercase.

    public String toLowerCase() 
	{
        String str = "";
        for (int i = 0; i < ch.length; i++) 
		{
            if (ch[i] >= 'A' && ch[i] <= 'Z') 
			{
                str += (char)(ch[i] + 32);
            } 
			else 
			{
                str += ch[i];
            }
        }
        return str;
    }
	
	//6. MyString substring(int start, int end) – Returns a substring from start to end-1.
	
	public String substring(int start, int end)
	{
		String str = "";
		for(int i = start; i < end; i++)
		{
			str += ch[i];
		}
		return str;
	}
	
	//7. MyString concat(MyString other) – Concatenates another string to the current one.
	
	public String concat(String s2)
	{
		String str = s2;
		for(int i = 0; i < ch.length; i++)
		{
			str += ch[i];
		}
		return str;
	}
	
	//8. boolean contains(MyString sub) – Checks if a substring exists.
	
	public boolean contains(String sub)
	{
		char[] ch2 = sub.toCharArray();
		if(ch2.length > ch.length)
		{
			return false;
		}
		for(int i = 0; i <= ch.length-ch2.length; i++)
		{
			int j = 0;
			while(j < ch2.length && ch[i+j] == ch2[j])
			{
				j++;
			}
			if(j == ch2.length)
			{
				return true;
			}
		}
		return false;
	}
	
	//9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
	
	public int indexOf(char c)
	{
		int index = -1;
        for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] == c)
			{
				index = i;
			}
		}			
		return index;
	}
	
	//10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
	
	public String replace(char oldc, char newc)
	{
		String str = "";
	 	char oldc2 = (char) (oldc + 32);
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] == oldc)
			{
				str += newc;
			}
			else if(ch[i] == oldc2)
			{
				str += (char) (newc + 32);
			}
			else
			{
				str += ch[i];
			}
		}
		return str;
	}
}

class Check
{
	public static void main(String[] args)
	{
		MyString obj = new MyString("Karthik");
		System.out.println("Number of characters in Karthik : " + obj.length());
		
		System.out.println("4th index Character is : " + obj.charAt(4));
		
		boolean val = obj.equals("Karthik");
		System.out.print("Two Strings are : ");
		System.out.println(val ? "Equal" : "Not Equal");
		
		System.out.println("All Character in UpperCase : " + obj.toUpperCase());
		
		System.out.println("All Character in LowerCase : " + obj.toLowerCase());
		
		System.out.println("Substring from 1 to 6 in Karthik : " + obj.substring(1, 6));
		
		System.out.println("Concatenates Iam and Karthik : " + obj.concat("Iam"));
		
		boolean val2 = obj.contains("arthi");
		System.out.print("Substring arthi is : ");
		System.out.println(val2 ? "exists in  Karthik" : "not exiats Karthik");
		
		System.out.println("Index of the first occurrence of the character 't': " + obj.indexOf('t'));
		
		System.out.println("Replaces all occurrence of a character 'K' to 'C' : " + obj.replace('K', 'C'));
	}
}

// 7.
 
class BasicCalculator
{
	public int add(int a, int b)
	{
		return a + b;
	}
	
	public int subtract(int a, int b)
	{
		return a - b;
	}
	
	public int multiply(int a, int b)
	{
		return a * b;
	}
	
	public int divide(int a, int b)
	{
		return a / b;
	}
}

class AdvancedCalculator extends BasicCalculator
{
	public double power(int base, int exponent)
	{
		return Math.pow(base, exponent);
	}
	
	public int modulus(int a, int b)
	{
		return a % b;
	}
	
	public double squareRoot(double number)
	{
		return Math.sqrt(number);
	}
}

class ScientificCalculator extends AdvancedCalculator
{
	public double sin(double angle)
	{
		return Math.sin(Math.toRadians(angle));
	}
	
	public double cos(double angle)
	{
		return Math.cos(Math.toRadians(angle));
	}
	
	public double log(double value)
	{
		return Math.log(value);
	}
	
	public double exp(double value)
	{
		return Math.exp(value);
	}
}

class Calculator
{
	public static void main(String[] args)
	{
		ScientificCalculator c = new ScientificCalculator();
		
		System.out.println("---Basic Calculator---");
		System.out.println("Addition : " + c.add(10, 5));
		System.out.println("Substraction : " + c.subtract(10, 5));
		System.out.println("Multiplication : " + c.multiply(10, 5));
		System.out.println("Division : " + c.divide(10, 5));
		
		System.out.println("---Advanced Calculator---");
		System.out.println("Power : " + c.power(2, 3));
		System.out.println("Modulus : " + c.modulus(10, 3));
		System.out.println("Square Root : " + c.squareRoot(25));
	
	    System.out.println("---Scientific Calculator---");
		System.out.println("Sine : " + c.sin(30));
		System.out.println("Cosine : " + c.cos(60));
		System.out.println("Log : " + c.log(10));
		System.out.println("Exponential : " + c.exp(2));
	
	}
}