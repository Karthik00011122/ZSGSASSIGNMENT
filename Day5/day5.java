import java.util.Scanner;

//1. Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
‌
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
‌
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed.*/

class MedicalRecord 
{
    protected String recordId;
    protected String patientName;
    protected String dateOfVisit;
    protected String diagnosis;

    public void inputRecordDetails(Scanner sc) 
	{
        System.out.print("Enter Record ID : ");
        recordId = sc.nextLine();

        System.out.print("Enter Patient Name : ");
        patientName = sc.nextLine();

        System.out.print("Enter Date of Visit : ");
        dateOfVisit = sc.nextLine();

        System.out.print("Enter Diagnosis : ");
        diagnosis = sc.nextLine();
    }

    public void displayRecord() 
	{
        System.out.println("Record ID : " + recordId);
        System.out.println("Patient Name : " + patientName);
        System.out.println("Date of Visit : " + dateOfVisit);
        System.out.println("Diagnosis : " + diagnosis);
    }
}

class InPatientRecord extends MedicalRecord 
{
    private int roomNumber;
    private int numberOfDaysAdmitted;
    private double roomCharges;

    public void inputInPatientDetails(Scanner sc) 
	{
        inputRecordDetails(sc);

        System.out.print("Enter Room Number : ");
        roomNumber = sc.nextInt();

        System.out.print("Enter Number of Days Admitted : ");
        numberOfDaysAdmitted = sc.nextInt();

        System.out.print("Enter Room Charges per Day : ");
        roomCharges = sc.nextDouble();
        sc.nextLine();
    }

    public double calculateTotalCharges() 
	{
        return numberOfDaysAdmitted * roomCharges;
    }

    public void displayRecord() 
	{
        super.displayRecord();
        System.out.println("Room Number : " + roomNumber);
        System.out.println("Days Admitted : " + numberOfDaysAdmitted);
        System.out.println("Room Charges per Day : " + roomCharges);
        System.out.println("Total Charges : " + calculateTotalCharges());
    }
}

class OutPatientRecord extends MedicalRecord 
{
    private String doctorName;
    private double consultationFee;

    public void inputOutPatientDetails(Scanner sc) 
	{
        inputRecordDetails(sc);

        System.out.print("Enter Doctor's Name : ");
        doctorName = sc.nextLine();

        System.out.print("Enter Consultation Fee : ");
        consultationFee = sc.nextDouble();
        sc.nextLine();
    }

    public void displayRecord() 
	{
        super.displayRecord();
        System.out.println("Doctor's Name : " + doctorName);
        System.out.println("Consultation Fee : " + consultationFee);
    }
}

class RecordsMaintain
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("1. In-Patient Record");
        System.out.println("2. Out-Patient Record");
        System.out.print("Enter your choice (1 or 2) : ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) 
		{
            InPatientRecord ip = new InPatientRecord();
            ip.inputInPatientDetails(sc);
            System.out.println("\n--- In-Patient Medical Record ---");
            ip.displayRecord();
        } 
		else if (choice == 2) 
		{
            OutPatientRecord op = new OutPatientRecord();
            op.inputOutPatientDetails(sc);
            System.out.println("\n--- Out-Patient Medical Record ---");
            op.displayRecord();
        } 
		else 
		{
            System.out.println("Invalid choice");
        }
    }
}

//2. Can we override private method, constructor, static method, final method? Illustrate with an example.

class Parent
{
	private void privateMethod()
	{
		System.out.println("Parent Private Class");
	}
	
	Parent()
	{
		System.out.println("Parent Constructor");
	}
	
	static void staticMethod()
	{
		System.out.println("Parent Static Method");
	}
	
	final void finalMethod()
	{
		System.out.println("Parent Final Method");
	}
}

class Child extends Parent
{
	private void privateMethod()
	{
		System.out.println("Child Private Class");
	}
	
	Child()
	{
		System.out.println("Child Constructor");
	}
	
	static void staticMethod()
	{
		System.out.println("Child static Method");
	}
	 
	/*void finalMethod()
	{
        System.out.println("Child Final Method");
	}*/
}

class Main
{
	public static void main(String[] args)
	{
		Parent obj = new Child();
		
		//obj.privateMethod();
		obj.staticMethod();
		obj.finalMethod();
	}
}

/*
3. Create a Java application to manage employees in a company. Define a base class Employee with a method calculateSalary(). 
   Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their 
   working type*/
   
class Employee 
{
    String name;
    int id;

    Employee(String name, int id) 
	{
        this.name = name;
        this.id = id;
    }

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

    public double calculateSalary() 
	{
        return monthlySalary;
    }
	
    void displayInfo() 
	{
        System.out.println("Full-Time Employee Salry : " + calculateSalary());
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
        return hourlyRate*hoursWorked;
    }
	
	void displayInfo() 
	{
        System.out.println("Hourly Rate : " + hourlyRate);
		System.out.println("Hours Worked : " + hoursWorked);
		System.out.println("Part-Time Employee total Salary : " + calculateSalary());
    }
}
	 
class Company 
{
    public static void main(String[] args) 
	{
        Employee emp1 = new FullTimeEmployee("Alice", 101, 50000);
        Employee emp2 = new PartTimeEmployee("Bob", 102, 500, 40);
        
		System.out.println("---Full-Time Employee Details---");
        emp1.displayInfo();
		
		System.out.println("---Part-Time Employee Details---");
        emp2.displayInfo();
    }
}


/*4. Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common method 
     but implement booking differently.*/
	
abstract class Ticket
{
	protected String source;
	protected String destination;
	
	Ticket(String source, String destination)
	{
		this.source = source;
		this.destination = destination;
	}
	
	abstract public void bookTicket();
}
	
class BusTicket extends Ticket 
{
    BusTicket(String source, String destination) 
	{
        super(source, destination);
    }

    public void bookTicket() 
	{
        System.out.println("\nBus ticket booked from " + source + " to " + destination + ".");
    }
}

class TrainTicket extends Ticket 
{
    TrainTicket(String source, String destination) 
	{
        super(source, destination);
    }

    public void bookTicket() 
	{
        System.out.println("Train ticket booked from " + source + " to " + destination + ".");
    }
}

class FlightTicket extends Ticket 
{
    FlightTicket(String source, String destination) 
	{
        super(source, destination);
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
        Ticket bus = new BusTicket("Chennai", "Coimbatore");
        bus.bookTicket();

        Ticket train = new TrainTicket("Hyderabad", "Bangalore");
        train.bookTicket();

        Ticket flight = new FlightTicket("Delhi", "Mumbai");
        flight.bookTicket();
    }
} 