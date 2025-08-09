import java.util.*;
import java.io.*;

//1. Write a Java program to read the contents of a text file and display it on the console.

class ReadFile
{
	public static void main(String[] args)
	{
		try
		{
			File file = new File("Sample.txt");
			if(file.createNewFile())
			{
				System.out.println("file Created Successfully : " + file.getName());
			}
			else
			{
				System.out.println("File Altready Exists ");
			}
			
			FileWriter fw = new FileWriter(file);
			fw.write("Hello!, My Name is Karthik");
			System.out.println("Writing Content Successfully ");
			fw.flush();
			
			Scanner read = new Scanner(file);
			while(read.hasNextLine())
			{
				System.out.println(read.nextLine());
			}
			
			fw.close();
			read.close(); 
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

/*2. Write a Menu driven Java program 
     a) to read content from the user and write it into another file and 
     b) from the file to another file 
	 c) to modify the content of a file 
	 d) to search for a particular word in a file and display how many times it appears 
	 e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.
*/

class MenuDriven 
{
    public static void main(String[] args) throws IOException 
	{
        Scanner scan = new Scanner(System.in);

        File file = new File("Sample.txt");

        System.out.println("Enter Any Choice:\n1. To read content from the user and write it into another file\n2. Copy content from Sample.txt to another file\n3. Modify the content of Sample.txt\n4. Search for a particular word in Sample.txt and count occurrences\n5. Read electronic products from Sample.txt and copy them to a CSV file");

        int choice = scan.nextInt();
        scan.nextLine();

        switch (choice) 
		{
            case 1:
                readWrite(file, scan);
                break;

            case 2:
                copyWrite(file);
                break;

            case 3:
                modifyContent(file, scan);
                break;

            case 4:
                searchWord(file, scan);
                break;
				
			case 5:
                copyToCSV(file);
                break;

            default:
                System.out.println("Enter Choice between 1 to 5.");
        }
        scan.close();
    }

    public static void readWrite(File file, Scanner scan) throws IOException 
	{
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        System.out.println("Enter content line by line (type 'exit' to stop):");

        String line;
        while(true) 
		{
            line = scan.nextLine();
            if (line.equalsIgnoreCase("exit")) 
			{
                break;
            }
            pw.println(line);
        }

        pw.close();
        fw.close();
        System.out.println("Successfully written user input to Sample1.txt");
    }

    public static void copyWrite(File file) throws IOException 
	{
        BufferedReader br = new BufferedReader(new FileReader(file));
		File file2 = new File("Sample2.txt");
        FileWriter fw = new FileWriter(file2);
        PrintWriter pw = new PrintWriter(fw);

        String line;
        while ((line = br.readLine()) != null) 
		{
            pw.println(line);
        }

        br.close();
        pw.close();
        fw.close();
        System.out.println("Successfully copied Sample.txt to Sample2.txt");
    }

    public static void modifyContent(File file, Scanner scan) throws IOException 
	{
        System.out.print("Enter the word to be replaced: ");
        String oldWord = scan.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = scan.nextLine();

       BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) 
		{
            sb.append(line.replace(oldWord, newWord)).append(System.lineSeparator());
        }
        br.close();

        PrintWriter pw = new PrintWriter(new FileWriter(file));
        pw.write(sb.toString());

        pw.close();
        System.out.println("Content modified successfully");
    }

    public static void searchWord(File file, Scanner scan) throws IOException 
	{
        System.out.print("Enter word to search: ");
        String searchWord = scan.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(file));
        
		int count = 0;
        String line;
        while ((line = br.readLine()) != null) 
		{
            String[] words = line.split("\\W+");
            for (String word : words) 
			{
                if (word.equalsIgnoreCase(searchWord)) 
				{
                    count++;
                }
            }
        }
		
        br.close();
        System.out.println("The word '" + searchWord + "' appeared " + count + " times.");
    }

    public static void copyToCSV(File file) throws IOException 
	{
        BufferedReader br = new BufferedReader(new FileReader(file));
        FileWriter fw = new FileWriter("products.csv");

        String line;
        while ((line = br.readLine()) != null) 
		{
            fw.write(line + ",\n");
        }

        br.close();
        fw.close();
        System.out.println("Successfully copied to products.csv");
    }
}	

	
//3. Write a Java program that reads a file and prints the number of lines, words, and characters.

class CountFile
{
	public static void main(String[] args)
	{
		try{
		    File file = new File("Sample.txt");
		    FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			int lineCount = 0;
			int wordCount = 0;
			int charCount = 0;
			
			while((line = br.readLine()) != null)
			{
				String[] words = line.trim().split("\\s+");
				lineCount++;
				wordCount += words.length;
				charCount += line.length();
			}
			
			System.out.println("Number of Lines : " + lineCount);
			System.out.println("Number of Words : " + wordCount);
			System.out.println("Number of Character : " + charCount);
			
			fr.close();
			br.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

//4.Write a Java program to append a text read from the user to an existing file without overwriting the original content.

class AppendFile
{
	public static void main(String[] args)
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			
			File file = new File("Sample.txt");
			
			FileWriter fw = new FileWriter(file, true);
			System.out.println("Enter the Content : ");
			fw.write("\n" + scan.nextLine());
			fw.flush();
			
			FileReader fr = new FileReader(file);
			
			int ch;
			while((ch = fr.read()) != -1)
			{
				System.out.print((char) ch);
			}
			
			fw.close();
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

/*5. Design a Java application to manage a product inventory system using file handling and object serialization.
Create a class Product with the following attributes:
--->int productId
--->String name
--->double price
--->int quantity
a. Ensure the class implements the Serializable interface.
b. Methods:
--->Add a Product: Accept product details from the user and write the object to a file (products.dat).
--->View All Products: Read all product objects from the file and display them.
--->Search Product by ID: Search for a product by productId in the file and display its details if found.
--->Update Product: Locate a product in the file using the ID, update its price or quantity, and save the changes back to 
    the file.
--->Delete Product: Remove a product object from the file by ID (involves rewriting the file).
--->Use proper exception handling and ensure that object serialization and deserialization are handled safely and 
    efficiently.
*/

/*
class Products implements Serializable
{
    public static voidd main(String[] args)
	{
        int productId;
        String name;
        double price;
		int quantity;
		
        Product(int productId, String name, double price, int quantity)
		{
			this.productId = productId;
			this.name = name;
			this.price = price;
			this.quantity =quantity;
		}
		
		public int getProductId()
		{
			return productId;
		}
		public String getName()
		{
			return name;
		}
		public double getPrice()
		{
			return price;
		}
		public int getQuantity()
		{
			return quantity;
		}
		
		public void setPrice(double price)
		{
			this.productId = productId;
		}
		public void setQuantity(int quantity)
		{
			this.quantity = quantity;
		}
		
		public String toString()
		{
			return "Product ID : " + productId + " Name : " + name + " Price : " + price + " Quantity : " + quantity;
		}
	}
}

class ProductInventorySystem
{
	private static final String fileName = "Product.dat";
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(system.in);
		
		
		addProducts(scan);
		viewProducts(scan);
		searchProducts(scan);
		updateProducts(scan);
		deleteProducts(scan);
	}
	
	public static List<Products> readProducts()
	{
		List<Products> productList = new ArrayList<>();
		File file = new File(fileName);
		if(!file.exists())
		{
			return productList;
		}
		else
		{
			try(ObjectInputStream ois = new ObjectIntputStream(new FileInputStream(fileName)))
			{
				productList = (List<Products> ois.readObject())
			}
			catch(EOFException e)
			{
			}
			catch(IOException | ClassNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
			return productList;
		}
	}
	
	public static void writeProducts(List<Products> productList);
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			oos.wrieObject(productList);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void addProducts(Scanner scan)
	{
		System.out.println("----- Add the Products -----");
		
		List<Products> product = readproducts();
		
		System.out.println("Enter Product ID : ");
		int id = scan.nextInt();
		
		for(Products p : product}
		{
			if(p.getProductId == id)
			{
				System.out.println("ID Altready Exists ");
				return;
			}
		}
		
		System.out.println("Enter Product Name : " );
		String name = scan.nextLine();

        system.out.println("Enter Product Price : ");
		double price = scan.nextDouble();
		
		System.out.println("Enter Quantity : ");
		int quantity = scan.nextInt();
		
		product.add(new Products(id, name, price, quantity)); 
		writeProducts(product);
		System.out.println("Product added Successfully");
    }		
	
	public static void viewProducts()
	{	
		List<Products> product = readproducts();
		
		if(protect.isEmpty())
		{
			System.out.println("No Product Found ");
		}
		else
		{
			
			for(Products p : product)
			{
				System.out.println(p);
			}
		}
	}
	
	public static void searchProducts(Scanner scan)
	{	
		List<Products> product = readProducts();
	
		System.out.println("Enter Product ID to Search : ");
		int id = scan.nextInt();
		boolean font = false;
		
		for(Products p : product)
		{
			if(p.getProductId() == id)
			{
				System.out.println(p);
				fount = true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Product Not Found ");
		}
	}
	
	public static void updateProducts(Scanner scan)
	{
        List<Products> product = readProducts();
		
		System.out.println("Enter the ID to Update : ");
		int id = scan.nextInt();
		boolean fount = false;
		
		for(Produts p : product)
		{
			if(p.getProductId() == id)
			{
				System.out.println("Enter new Price : ");
				double price = scan.nextDouble();
				
				System.out.println("Enter new Quantity : ");
				int quantity = scan.nextInt();
				
				p.setPrice(price);
				p.setQuantity(quantity);
				fount = true;
				break;
			}
		}
		
		if(found)
		{
		    writeProducts(product);
			System.out.println("Product Updated Susccessfully");
		}
		else
		{
			System.out.println("Product Not Found ");
		}
    }
	
	public static void deleteProducts(Scanner scan)
	{   
        List<Products> product = readProducts();
        
		System.out.println("Enter the ID to Delete : ");
		int id = scan.nextInt(); 
		
	    boolean removed = products.removeif(p --> p.getProductId() == id);
      		
		if(removed)
		{
            writeProducts(product);
            System.out.println("Product Deleted Successfully");
		}
        else
		{
            System.out.println("Product Not Found");
		}               				
	}
}
*/

class Product implements Serializable
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

    void display()
    {
        System.out.println("... Product Details ... \n");
        System.out.println("Product ID = "+productId);
        System.out.println("Product Name = "+name);
        System.out.println("Product Price = "+price);
        System.out.println("Product Quantity = "+quantity+"\n\n");
    }
}

class ProductInventorySystem
{
    public static void main(String[] args) 
	{
        Product p1 = new Product(121,"KeyBoard",1200,10);
        Product p2 = new Product(122,"Mouse",1400,10);
        Product p3 = new Product(123,"Laptop",140000,10);
        Product p4 = new Product(124,"Mobile",14000,10);

        ArrayList<Product> lists=new ArrayList<>();
        lists.add(p1);  
		lists.add(p2);
		lists.add(p3);  
		lists.add(p4);
 
        addProd(false,lists);
		System.out.println("-----Product Added Successfully-----\n\n");

        System.out.println("-----Reading File-----\n");
		
        try
        {
            ArrayList<Product> product = readProd("Product.ser");
            for(Product obj:product)
            {
                obj.display();
            }
        }
        catch (IOException  | ClassNotFoundException e)
        {
            System.out.println("Exception Occur \n\n");
            e.printStackTrace();
        }

        System.out.println("-----Searching Product to PID is 122-----\n");

        try 
		{
            Product ser = searchProd("Product.ser", 122);
            ser.display();
        } 
		catch (IOException |ClassNotFoundException e) 
		{
            e.printStackTrace();
        }

        System.out.println("-----Update Product Price and Quantity to PID is 123-----\n");

        try
		{
            if(updateProd("Product.ser",123,1200000,20))
            {
                try
                {
                    ArrayList<Product> product = readProd("Product.ser");
                    for(Product obj:product)
                    {
                        obj.display();
                    }
                }
                catch (IOException  | ClassNotFoundException e)
                {
                    System.out.println("Exception Occur ");
                }
            }
            else
		    {
                System.out.println("Updation Failed");
            }
        }
        catch (Exception e) 
		{
            e.printStackTrace();
        }

        System.out.println("-----Delete Product to PID 123-----\n");

        if(deleteProd("Product.ser",123))
        {
            try
            {
                ArrayList<Product> product = readProd("Product.ser");
                for(Product obj:product)
                {
                    obj.display();
                }
            }
            catch (IOException  | ClassNotFoundException e)
            {
                System.out.println("Exception Occur ");
            }
        }
    }

    public static boolean addProd(boolean append,ArrayList<Product> list)
    {
        try(FileOutputStream file=new FileOutputStream("Product.ser",append);
            ObjectOutputStream out =new ObjectOutputStream(file))
        {
            for(Product p:list) 
			{
                out.writeObject(p);
            }
        }
        catch(IOException e)
        {
            return  false;
        }
        return true;
    }

    public static ArrayList<Product> readProd(String fileName) throws IOException,ClassNotFoundException
    {
        try(FileInputStream file=new FileInputStream(fileName);
        ObjectInputStream input=new ObjectInputStream(file))
        {
            ArrayList<Product> list=new ArrayList<>();
			
            try 
		    {
                while (true) 
			    {
                    Product p = (Product) input.readObject();
                    list.add(p);
                }
            }
            catch (EOFException e)
            {
                return list;
            }
        }
    }

    public static Product searchProd(String fileName,int id) throws IOException,ClassNotFoundException
    {
        Product p=null;

        try(FileInputStream file=new FileInputStream(fileName);
            ObjectInputStream input=new ObjectInputStream(file))
        {
            try 
			{
                while (true) 
				{
                    p = (Product) input.readObject();
                    if(p.productId==id)
                    {
                        return p;
                    }
                }
            }
            catch (EOFException e)
            {
                throw new EOFException("Not  Available ");
            }
        }
    }

    public static  boolean  updateProd(String fileName,int id,int  newQuantity,int newPrice)
    {
        try 
	    {
            ArrayList<Product> list = readProd(fileName);
            ArrayList<Product>updated=new ArrayList<>();
            for(Product p:list)
            {
                if(p.productId==id)
                {
                    p.price=newPrice;
                    p.quantity=newQuantity;
                }
                updated.add(p);
            }
            addProd(false,list);
            return true;
        }  
	    catch (Exception e) 
	    {
            return false;
        }
    }

    public static  boolean  deleteProd(String fileName,int id)
    {
        try 
		{
            boolean b=false;
            ArrayList<Product> list = readProd(fileName);
            ArrayList<Product>updated=new ArrayList<>();
            for(Product p:list)
            {
                if(p.productId==id)
                {
                    continue;
                }
                updated.add(p);
            }
            addProd(false,updated);
            return true;
        }
		catch (Exception e) 
		{
            return false;
        }
    }
}