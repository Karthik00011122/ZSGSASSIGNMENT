import arithmetic.Arithmatic;
import stringutils.Strings;
import travel.booking.Ticket;
import travel.user.User;

import java.util.*;

class GateWay 
{
    private String transactionId;
    private String payerName;
    private String payeeName;
    private double amount;
    private String paymentMethod;
    private String transactionStatus;

    public void setDetails(String transactionId, String payerName, String payeeName, double amount, String paymentMethod, String transactionStatus) {
        this.transactionId = transactionId;
        this.payerName = payerName;
        this.payeeName = payeeName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.transactionStatus = transactionStatus;
    }

    String getTransactionId() 
	{
        return transactionId;
    }

    String getPayerName() 
	{
        return payerName;
    }

    String getPayeeName() 
	{
        return payeeName;
    }

    double getAmount() 
	{
        return amount;
    }

    String getPaymentMethod() 
	{
        return paymentMethod;
    }

    String getTransactionStatus() 
	{
        return transactionStatus;
    }

    public void display() 
	{
        System.out.println("Transaction ID : " + getTransactionId());
        System.out.println("Payer Name : " + getPayerName());
        System.out.println("Payee Name : " + getPayeeName());
        System.out.println("Transaction Amount : " + getAmount());
        System.out.println("Payment Method : " + getPaymentMethod());
        System.out.println("Transaction Status : " + getTransactionStatus());
    }

    public static void main(String[] args) 
	{
        GateWay obj = new GateWay();
        obj.setDetails("mnyteydu33422f", "Vels", "Karthik", 15000.00, "GPay", "Successful");
        obj.display();
    }
}

class UserPackages
{
	public static void main(String[] args)
	{
		Arithmatic a = new Arithmatic();
		System.out.println("Arithmetic : \n");
		System.out.println("Addition : " + a.Addition(30, 15));
		System.out.println("Subtraction : " + a.Subtraction(30, 15));
		System.out.println("Multiplication : " + a.Multiplication(30, 15));
		System.out.println("Division : " + a.Division(30, 15));
		System.out.println("Modulo : " + a.Modulo(30, 15) + "\n");
		
		Strings s = new Strings();
		System.out.println("Strings : \n");
		System.out.println("Concatenating two strings : " + s.Concatenation("Hello", "World"));
		System.out.println("Reversing a string : " + s.Reverse("HelloWorld"));
		System.out.println("Finding the length of a string : " + s.FindLength("HelloWorld"));
	}
}

class Employee
{
	private int employee_ID;
	private String name;
    private	String designation;
    private	String department;
	private double monthly_Salary;
	
	Employee(int eId, String n, String d, String dept, double ms)
	{
		employee_ID = eId;
		name = n;
		designation = d;
		department = dept;
		monthly_Salary = ms;
	}
	
	public void getDetails()
	{
		System.out.println("Employee ID : " + employee_ID);
		System.out.println("Employee Name : " + name);
		System.out.println("Designation : " + designation);
		System.out.println("Department : " + department);
	}
	public double getMonthlySalary()
	{
		return monthly_Salary;
	}
	
	public double calculateAnnualSalary()
	{
		return getMonthlySalary() * 12;
	}
	
	public static void main(String[] args)
	{
		Employee obj = new Employee(21, "Karthik", "Software Developer", "IT", 100000.00);
		obj.getDetails();
		System.out.println("Annual Salary : " + obj.calculateAnnualSalary());
	}
}

class Travels
{
	public static void main(String[] args)
	{
        User user = new User("U101", "Karthik");
		user.bookTicket();
		System.out.println("----Ticket Booking ----");
		Ticket tkt = new Ticket("T5678", "Goa", 2999.50);
        tkt.displayTicket();
    }
}

class BankAccount 
{	
    private String accountNumber;
    private String accountHolderName;
    private double balance;
	
    BankAccount(String accountNumber, String accountHolderName, double initialBalance) 
	{
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) 
		{
            this.balance = initialBalance;
        } 
		else 
		{
            System.out.println("Initial balance can't be negative. Setting to 0.");
            this.balance = 0;
        }
    }
	
    public String getAccountNumber() 
	{
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) 
	{
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() 
	{
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) 
	{
        
		this.accountHolderName = accountHolderName;
    }

    public double getBalance() 
	{
        return balance;
    }

    public void deposit(double amount) 
	{
        if (amount > 0) 
		{
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } 
		else 
		{
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) 
	{
        if (amount <= 0) 
		{
            System.out.println("Withdrawal amount must be positive.");
        } 
		else if (amount > balance) 
		{
            System.out.println("Insufficient balance. Withdrawal failed.");
        } 
		else 
		{
            balance -= amount;
            System.out.println("Withdrew: ₹" + amount);
        }
    }

    public void displayAccountInfo() 
	{
        System.out.println("\nAccount Details:");
        System.out.println("Account Number     : " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Current Balance    : ₹" + balance);
    }

    public static void main(String[] args) 
	{	
        BankAccount acc = new BankAccount("BA123456", "Karthik", 5000);

        acc.displayAccountInfo();

        acc.deposit(1500);
        acc.withdraw(2000);
        acc.withdraw(6000);
		
        acc.displayAccountInfo();
    }
}