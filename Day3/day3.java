import java.util.*;

/*1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of 
     roll_no as '2' and that of name as "John" by creating an object of the class Student. */

class Student
{
	String name = "Jhon";
	int roll_no = 2;
	public static void main(String[] args)
	{
		Student obj = new Student();
		System.out.println("Student Rollno : " + obj.roll_no + "\nStudent Name : " + obj.name);
	}
}

/* 2. Create a class named Student that has the following attributes:
      name (String)
      roll_no (int)
      phone_no (int)
      address (String)
      Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the 
	  details for two students having names "Sam" and "John" respectively. */
	  
class Students
{
	String name;
	int roll_no;
	int phone_no;
	String address;

	Students(String name, int roll_no, int phone_no, String address)
	{
		this.name = name;
		this.roll_no = roll_no;
		this.phone_no = phone_no;
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("name         : " + name);
		System.out.println("Roll No      : " + roll_no);
		System.out.println("Phone Number : " + phone_no);
		System.out.println("Address      : " + address + "\n");
	}
	
	public static void main(String[] args)
	{
		Students obj1 = new Students("Ssm", 1, 780683765, "12,Rail Nagar");
		Students obj2 = new Students("Jhon", 1, 754884625, "2/1206,Tiruvalluvar Nagar");
		System.out.println("Stdent 1 Details : \n");
		obj1.display();
		System.out.println("Stdent 2 Details : \n");
		obj1.display();
	}
}

/*3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s
     name, employee ID, designation, and salary.
     a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default 
	    values for all the fields.
     b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
     c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with 
	    the same values.
     In the main method, create:
     a. One object using the no-argument constructor,
     b. One object using the parametrized constructor,
     c. And a third object using the copy constructor.
     Finally, display the details of all three employees. */
	 
class Employee 
{
    String name;
    int empId;
    String designation;
    double salary;

    // a. No-argument constructor
    Employee() 
	{
        name = "Not Set";
        empId = 0;
        designation = "Unknown";
        salary = 0.0;
    }

    // b. Parameterized constructor
    Employee(String name, int empId, String designation, double salary) 
	{
        this.name = name;
        this.empId = empId;
        this.designation = designation;
        this.salary = salary;
    }

    // c. Copy constructor
    Employee(Employee e) 
	{
        this.name = e.name;
        this.empId = e.empId;
        this.designation = e.designation;
        this.salary = e.salary;
    }

    void display() 
	{
        System.out.println("Name: " + name);
        System.out.println("ID: " + empId);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary + "\n");
    }

    public static void main(String[] args) 
	{
        Employee e1 = new Employee();
        Employee e2 = new Employee("Alice", 101, "Manager", 75000);
        Employee e3 = new Employee(e2);
		
		System.out.println("No-arg constructor: Employee object created .Copy constructor\n");
        e1.display();
		System.out.println("Parameterized constructor : \n");
        e2.display();
		System.out.println("Copy constructor : \n");
        e3.display();
    }
}

/*4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, 
     such that it can internally keep track of how many vehicles have been created so far, without requiring manual 
	 counting from outside the class. */
	 
class Vehicle 
{
    int vehicleId;
    String brandName;
    double price;

    static int vehicleCount = 0;

    Vehicle(int vehicleId, String brandName, double price) 
	{
        this.vehicleId = vehicleId;
        this.brandName = brandName;
        this.price = price;
        vehicleCount++;
    }

    void display() 
	{
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Price: " + price + "\n");
    }

    static void displayCount() 
	{
        System.out.println("Total Vehicles Created: " + vehicleCount);
    }

    public static void main(String[] args) 
	{
		System.out.println("Vehicles Details : \n");
        Vehicle v1 = new Vehicle(1, "Toyota", 1000000);
        Vehicle v2 = new Vehicle(2, "Honda", 900000);
        Vehicle v3 = new Vehicle(3, "Tesla", 3000000);

        v1.display();
        v2.display();
        v3.display();

        Vehicle.displayCount();
    }
}
	 
/*5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static 
     variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information. 

Also Check how many .class files are generated	 */

class Store 
{
    static String storeName;
    static String storeLocation;
    ArrayList<Product> products = new ArrayList<>();

    public static void setStoreDetails(String name, String location) 
	{
        storeName = name;
        storeLocation = location;
    }

    public static void displayStoreDetails() 
	{
        System.out.println("Store Name    : " + storeName);
        System.out.println("Store Location: " + storeLocation);
        System.out.println("===========================");
    }

    public void addProduct(Product product) 
	{
        products.add(product);
    }

    public void displayAllProducts() 
	{
        for (Product p : products) 
		{
            p.displayProduct();
        }
    }

    public static void main(String[] args) 
	{

        Store.setStoreDetails("MyMart", "Chennai");

        Store myStore = new Store();

        Product p1 = new Product(1, "Milk", 40.0, 50);
        Product p2 = new Product(2, "Bread", 25.0, 30);
        Product p3 = new Product(3, "Eggs", 5.0, 100);

        myStore.addProduct(p1);
        myStore.addProduct(p2);
        myStore.addProduct(p3);

        Store.displayStoreDetails();
        myStore.displayAllProducts();
    }
}

class Product 
{
    int productId;
    String name;
    double price;
    int quantity;

    public Product(int productId, String name, double price, int quantity) 
	{
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProduct() 
	{
        System.out.println("Product ID: " + productId);
        System.out.println("Name      : " + name);
        System.out.println("Price     : " + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("---------------------------");
    }
}


/*6. Write a program that would print the information (name, year of joining, salary, address) of three employees by 
     creating a class named 'Employee'. The output should be as follows:
     Name Year of joining Address
     Robert 1994 64C- WallsStreat
     Sam 2000 68D- WallsStreat
     John 1999 26B- WallsStreat
     Can use format method to format the above said output. */
	 
class Employees
{
    String name;
    int yearOfJoining;
    String address;

    Employees(String name, int yearOfJoining, String address) 
	{
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    void display() 
	{
        System.out.printf("%-10s %-15d %-35s%n", name, yearOfJoining, address);
    }

    public static void main(String[] args) 
	{
        Employees e1 = new Employees("Robert", 1994, "64C- WallsStreat");
        Employees e2 = new Employees("Sam", 2000, "68D- WallsStreat");
        Employees e3 = new Employees("John", 1999, "26B- WallsStreat");

        System.out.printf("%-10s %-15s %-35s%n", "Name", "Year of Joining", "Address");
		System.out.println("-------------------------------------------");
        e1.display();
        e2.display();
        e3.display();
    }
}