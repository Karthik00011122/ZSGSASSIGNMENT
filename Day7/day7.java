import java.util.*;

//1.

class Customer
{
	private String name;
	private String address;
	private String phoneno;
	
    Customer(String name, String address, String phoneno)
	{
		this.name = name;
		this.address = address;
		this.phoneno = phoneno;
	}
	
	public void displayCustomerDetails()
	{
		System.out.println("Customer Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Phone Number : " + phoneno);
	}
}

class Account
{
	private String accountNumber;
    private double balance;
    
	Account(String accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void displayAccountDetails()
	{
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Balance : " + balance);
	}
}

class RBI
{
	Customer c;
	Account a;
	
	RBI(Customer c, Account a)
	{
		this.c = c;
		this.a = a;
	}
	
	public double getInterestRate()
	{
		return 8.8;
	}
	public int getWithdrawLimit()
	{
		return 500;
	}
	
	public void displayDetails()
	{
		System.out.println("----RBI BANK DETAILS----");
		c.displayCustomerDetails();
		a.displayAccountDetails();
		System.out.println("RBI Tnterest Rate : " + getInterestRate());
		System.out.println("SBI Withdrawal Limit : " + getWithdrawLimit());
	}
}

class SBI extends RBI
{
	SBI(Customer c, Account a)
	{
		super(c, a);
	}
	
	public double getInterestRate()
	{
		return 9.8;
	}
	public int getWithdrawLimit()
	{
		return 600;
	}
	
	public void displayDetails()
	{
		System.out.println("----SBI BANK DETAILS----");
		c.displayCustomerDetails();
		a.displayAccountDetails();
		System.out.println("Tnterest Rate : " + getInterestRate());
		System.out.println("Withdrawal Limit : " + getWithdrawLimit());
	}
}

class ICICI extends RBI
{
	ICICI(Customer c, Account a)
	{
		super(c, a);
	}
	
	public double getInterestRate()
	{
		return 7.8;
	}
	public int getWithdrawLimit()
	{
		return 400;
	}
	
	public void displayDetails()
	{
		System.out.println("----ICICI BANK DETAILS----");
		c.displayCustomerDetails();
		a.displayAccountDetails();
		System.out.println("Tnterest Rate : " + getInterestRate());
		System.out.println("Withdrawal Limit : " + getWithdrawLimit());
	}
}

class PNB extends RBI
{
	PNB(Customer c, Account a)
	{
		super(c, a);
	}
	
	public double getInterestRate()
	{
		return 6.8;
	}
	public int getWithdrawLimit()
	{
		return 300;
	}
	
	public void displayDetails()
	{
		System.out.println("----PNB BANK DETAILS----");
		c.displayCustomerDetails();
		a.displayAccountDetails();
		System.out.println("Tnterest Rate : " + getInterestRate());
		System.out.println("Withdrawal Limit : " + getWithdrawLimit());
	}
}

class BankAccount
{
	public static void main(String[] args)
	{
		Customer cus1 = new Customer("Karthik", "12-Rail Nagar", "7806837655");
		Account acc1 = new Account("1201000012345", 500000.00);
		
	    SBI obj1 = new SBI(cus1, acc1);
        obj1.displayDetails();		
		
		System.out.println();
		
		Customer cus2 = new Customer("Karthik", "12-Rail Nagar", "7806837655");
		Account acc2 = new Account("1301000054321", 800000.00);
		
	    ICICI obj2 = new ICICI(cus2, acc2);
        obj2.displayDetails();
		
		System.out.println();
		
		Customer cus3 = new Customer("Karthik", "12-Rail Nagar", "7806837655");
		Account acc3 = new Account("1401000034521", 700000.00);
		
	    PNB obj3 = new PNB(cus3, acc3);
        obj3.displayDetails();
	}
}

//2.

interface PaymentMethod
{
	void pay(double amount);
}

class CreditCardPayment implements PaymentMethod
{
	private String creditCardNumber;
	
	CreditCardPayment(String creditCardNumber)
	{
		this.creditCardNumber = creditCardNumber;
	}
	
	public void pay(double amount)
	{
		System.out.println("Paid " + amount + " using Creditcard : " + creditCardNumber);
	}
}

class DebitCardPayment implements PaymentMethod
{
	private String debitCardNumber;
	
	DebitCardPayment(String debitCardNumber)
	{
		this.debitCardNumber = debitCardNumber;
	}
	
	public void pay(double amount)
	{
		System.out.println("Paid " + amount + " using Debitcard : " + debitCardNumber);
	}
}

class UPIPayment implements PaymentMethod
{
	private String upiId;
	
	UPIPayment(String upiId)
	{
		this.upiId = upiId;
	}
	
	public void pay(double amount)
	{
		System.out.println("Paid " + amount + " using UPI ID : " + upiId);
	}
}

class PaymentGateWay
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Amount : ");
		double amount = scan.nextDouble();
		
		System.out.println("Choose Payment Method : ");
		System.out.println("1.Credit Card");
		System.out.println("2.Debit Card");
		System.out.println("3.UPI ID");
		int choice = scan.nextInt();
		
		PaymentMethod p = null;
		
		switch(choice)
		{
			case 1:
			System.out.println("Enter Creditcard Number : ");
			String ccn = scan.next();
			p = new CreditCardPayment(ccn);
			break;
			
			case 2:
			System.out.println("Enter Debitcard Number : ");
			String dcn = scan.next();
			p = new DebitCardPayment(dcn);
			break;
			
			case 3:
			System.out.println("Enter UPI ID : ");
			String uid = scan.next();
			p = new UPIPayment(uid);
			break;
			
			default:
			System.out.println("Invald Choice");
			System.exit(0);
		}
		p.pay(amount);
	}
}

//3.Abstract Employee Management

abstract class Employee 
{
    String name;
    int id;

    Employee(String name, int id) 
	{
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void displayInfo() 
	{
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

class FullTimeEmployee extends Employee 
{
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) 
	{
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() 
	{
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee 
{
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) 
	{
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() 
	{
        return hourlyRate * hoursWorked;
    }
}

class Company 
{
    public static void main(String[] args) 
	{
        Employee emp1 = new FullTimeEmployee("Alice", 101, 50000);
        Employee emp2 = new PartTimeEmployee("Bob", 102, 500, 40);

        emp1.displayInfo();
        System.out.println("Salary: " + emp1.calculateSalary());

        System.out.println();

        emp2.displayInfo();
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}

//4. Interface Employee Management

interface Employees
{
    double calculateSalary();
    void displayInfo();
}

class FullTimeEmployees implements Employees 
{
    private String name;
    private int id;
    private double monthlySalary;

    FullTimeEmployees(String name, int id, double monthlySalary) 
	{
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() 
	{
        return monthlySalary;
    }

    public void displayInfo() 
	{
        System.out.println("Full-Time Employee - ID: " + id + ", Name: " + name);
    }
}

class PartTimeEmployees implements Employees 
{
    private String name;
    private int id;
    private double hourlyRate;
    private int hoursWorked;

    PartTimeEmployees(String name, int id, double hourlyRate, int hoursWorked) 
	{
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() 
	{
        return hourlyRate * hoursWorked;
    }

    public void displayInfo() 
	{
        System.out.println("Part-Time Employee - ID: " + id + ", Name: " + name);
    }
}

class Companys 
{
    public static void main(String[] args) 
	{
        Employees emp1 = new FullTimeEmployees("Alice", 101, 55000);
        Employees emp2 = new PartTimeEmployees("Bob", 102, 500, 40);

        emp1.displayInfo();
        System.out.println("Salary: " + emp1.calculateSalary());

        System.out.println();

        emp2.displayInfo();
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}

//5.
	 
interface Ticket 
{
    void bookTicket();
}

class BusTicket implements Ticket 
{
    private String source;
    private String destination;

    BusTicket(String source, String destination) 
	{
        this.source = source;
        this.destination = destination;
    }

    public void bookTicket() 
	{
        System.out.println("\nBus ticket booked from " + source + " to " + destination + ".");
    }
}

class TrainTicket implements Ticket 
{
    private String source;
    private String destination;

    TrainTicket(String source, String destination) 
	{
        this.source = source;
        this.destination = destination;
    }

    public void bookTicket() 
	{
        System.out.println("Train ticket booked from " + source + " to " + destination + ".");
    }
}

class FlightTicket implements Ticket 
{
    private String source;
    private String destination;

    FlightTicket(String source, String destination) 
	{
        this.source = source;
        this.destination = destination;
    }

    public void bookTicket() 
	{
        System.out.println("Flight ticket booked from " + source + " to " + destination + ".");
    }
}

class TicketBookingSystem 
{
    public static void main(String[] args) 
	{
        Ticket ticket;

        ticket = new BusTicket("Chennai", "Coimbatore");
        ticket.bookTicket();

        ticket = new TrainTicket("Hyderabad", "Bangalore");
        ticket.bookTicket();

        ticket = new FlightTicket("Delhi", "Mumbai");
        ticket.bookTicket();
    }
}