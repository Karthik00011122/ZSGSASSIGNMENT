import java.util.*;

/*1. Write a Java program

  a. to create a new array list, add some colours (string) and print out the collection.
  b. to iterate through all elements in an array list.
  c. to insert an element into the array list at the first position.
  d. to retrieve an element (at a specified index) from a given array list.
  e. to update specific array element by given element.
  f. to remove the third element from an array list.
  g. to search an element in an array list.
  h. to sort a given array list.
  i. to copy one array list into another.
  j. to shuffle elements in an array list.

*/

class ArrayListOperations
{
	public static void main(String[] args)
	{	
		ArrayList<String> al = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println(printColors(al, scan));
		iterateElements(al);
		insertElements(al);
		retrieveElements(al);
		updateElements(al);
		removeElements(al);
		searchElements(al);
		sortElements(al);
		copyArrayList(al);
		shuffleElements(al);
	}
	
	public static List<String> printColors(ArrayList<String> al, Scanner scan)
	{
		System.out.println("Enter 5 Colors : ");
	    for(int i = 0; i < 5; i++)
		{
            al.add(scan.next());
		}			
		System.out.println("\nList Elements : ");
		return al;
	}
	
	public static void iterateElements(ArrayList<String> al)
	{
		System.out.println("\nTo iterate through all elements in an array list : ");
		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	public static void insertElements(ArrayList<String> al)
	{
		al.add(0, "Karthik");
		al.addFirst("hello");
		System.out.println("\nTo insert an element into the array list at the first position : " + al);
	}
	
	public static void retrieveElements(ArrayList<String> al)
	{
		System.out.println("\nTo retrieve an element (at a specified index) from a given array list : " + al.get(0));
	}
	
	public static void updateElements(ArrayList<String> al)
	{
		al.set(0, "Orange");
		System.out.println("\nTo update specific array element by given element : " + al);
	}
	
	public static void removeElements(ArrayList<String> al)
	{
		al.remove(3);
		System.out.println("\nTo remove the third element from an array list : " + al);
	}
	
	public static void searchElements(ArrayList<String> al)
	{
		System.out.println("\nTo search an elements : " + al.contains("green"));
	}
	
    public static void sortElements(ArrayList<String> al)
	{
		Collections.sort(al);
		System.out.println("\nTo sort a given array list : " + al);
	}
	
	public static void copyArrayList(ArrayList<String> al)
	{
		ArrayList<String> al2 = new ArrayList<>(al);
		System.out.println("\nTo copy one array list into another : " + al2);
	}
	
	public static void shuffleElements(ArrayList<String> al)
	{
		Collections.shuffle(al);
		System.out.println("\nTo shuffle elements in an array list : " + al);
	}
}

/*2. Write a Java program to,

  a. append the specified element to the end of a linked list.
  b. iterate through all elements in a linked list.
  c. iterate through all elements in a linked list starting at the specified position.
  d. iterate a linked list in reverse order.
  e. insert the specified element at the specified position in the linked list.
  f. insert elements into the linked list at the first and last position.
  g. insert the specified element at the front of a linked list.
  h. insert the specified element at the end of a linked list.
  i. insert some elements at the specified position into a linked list.
  j. get the first and last occurrence of the specified elements in a linked list.
  
*/

class LinkedListOperations
{
	public static void main(String[] args)
	{
		LinkedList<String> ll = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		
		ll.add("Hello");
		ll.add("Karthik");
		ll.add("Welcome");
		
		appendElements(ll);
        iterateElements(ll);	
        iterateSpecificElements(ll);	
		iterateReverseOrder(ll);
		insertElements(ll);
		insertFirstAndLastElements(ll);
		insertfrontElement(ll);
		insertEndElement(ll);
		insertSomeElements(ll);
		getFirstAndLastElements(ll);
	}
	
	public static void appendElements(LinkedList<String> ll)
	{	
		ll.addLast("Java");
		System.out.println("\nAppend the specified element to the end of a linked list : " + ll);
	}
	
	public static void iterateElements(LinkedList<String> ll)
	{
		System.out.println("\nIterate through all elements in a linked list : ");
		Iterator it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	public static void iterateSpecificElements(LinkedList<String> ll)
	{
		System.out.println("\nIterate through all elements in a linked list starting at the specified position : ");
		int index = 2;
		ListIterator it = ll.listIterator(index);
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	public static void iterateReverseOrder(LinkedList<String> ll)
	{
		System.out.println("\nIterate a linked list in reverse order : ");
		Collections.sort(ll,Collections.reverseOrder());
		Iterator it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	public static void insertElements(LinkedList<String> ll)
	{
		ll.add(3, "to");
		System.out.println("\nInsert the specified element at the specified position in the linked list : " + ll);
	}
	
	public static void insertFirstAndLastElements(LinkedList<String> ll)
	{
		ll.addFirst("Hey");
		ll.addLast("World");
		System.out.println("\nInsert elements into the linked list at the first and last position : " + ll);
	}
	
	public static void insertfrontElement(LinkedList<String> ll)
	{
		ll.addFirst("Hi");
		System.out.println("\nInsert the specified element at the front of a linked list : " + ll);
	}
	
	public static void insertEndElement(LinkedList<String> ll)
	{
		ll.addLast("Thanks");
		System.out.println("\nInsert the specified element at the end of a linked list : " + ll);
	}
	
	public static void insertSomeElements(LinkedList<String> ll)
	{
		ll.add(2, "Bye");
		ll.add(4, "you");
		System.out.println("\nInsert some elements at the specified position into a linked list : " + ll);
	}
	
	public static void getFirstAndLastElements(LinkedList<String> ll)
	{
		System.out.println("\nGet the first occurrence of the specified elements in a linked list : " + ll.get(0));
		System.out.println("Get the Last occurrence of the specified elements in a linked list : " +ll.get(ll.size()-1));
	}
}

/*3. Write a Java program to,

  a. append the specified element to the end of a hash set.
  b. iterate through all elements in a hash list.
  c. get the number of elements in a hash set.
  d. empty the hash set.
  e. test a hash set is empty or not.
  f. clone a hash set to another hash set.
  g. convert a hash set to an array.
  h. convert a hash set to a tree set.
  i. convert a hash set to a List/ArrayList.
  j. compare two hash set.

*/

class HashSetOperations
{
	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<>();
		hs.add("Hello");
		hs.add("Hi");
		hs.add("Bye");
		hs.add("Thanks");
		
		System.out.println("\nAppend the specified element to the end of a hash set : " + hs);
		
		System.out.println("\nIterate through all elements in a hash list : ");
		for(String s : hs)
		{
			System.out.println(s);
		}
		
		System.out.println("\nGet the number of elements in a hash set : " + hs.size());
		
		hs.clear();
		System.out.println("\nEmpty the hash set : " + hs);
		
		System.out.println("\nTest a hash set is empty or not : " + hs.isEmpty());
		
		hs.add("hello");
		hs.add("hi");
		hs.add("bye");
		HashSet<String> cs = new HashSet<>(hs);
		System.out.println("\nClone a hash set to another hash set : " + cs);
		
		String[] arr = hs.toArray(new String[0]);
		System.out.println("\nConvert a hash set to an array : " + Arrays.toString(arr));
		
		TreeSet<String> ts = new TreeSet<>(hs);
		System.out.println("\nConvert a hash set to a tree set : " + ts);

       	List<String> al = new ArrayList<>(hs);
        System.out.println("\nConvert a hash set to a List/ArrayList : " + al);

        HashSet<String> hs1 = new HashSet<>(Arrays.asList("A", "B", "C"));
        HashSet<String> hs2 = new HashSet<>(Arrays.asList("A", "B", "C"));	
        System.out.println("\ncompare two hash set : " + hs1.equals(hs2));		
	}
}

/*4. Write a Java program to,

  a. create a new tree set, add some colours (string) and print out the tree set.
  b. iterate through all elements in a tree set.
  c. add all the elements of a specified tree set to another tree set.
  d. create a reverse order view of the elements contained in a given tree set.
  e. get the first and last elements in a tree set.
  f. clone a tree set list to another tree set.
  g. get the number of elements in a tree set.
  h. compare two tree sets.
  i. find the numbers less than 7 in a tree set.
  j. get the element in a tree set which is greater than or equal to the given element.
  k. get the element in a tree set which is less than or equal to the given element.
  l. get the element in a tree set which is strictly greater than or equal to the given element.
  m. get an element in a tree set which is strictly less than the given element.
  n. retrieve and remove the first element of a tree set.
  o. retrieve and remove the last element of a tree set.
  p. remove a given element from a tree set.
  
 */
 
 class TreeSetOperations
 {
	public static void main(String[] args)
	{
		TreeSet<String> ts = new TreeSet<>();
         
        ts.add("RED");
		ts.add("YELLOW");
        ts.add("GREEN");		
		
		System.out.println("\nCreate a new tree set, add some colours (string) and print out the tree set : " + ts);
		
		System.out.println("\nIterate through all elements in a tree set : ");
		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		TreeSet<String> ts2 = new TreeSet<>(ts);
		System.out.println("\nAdd all the elements of a specified tree set to another tree set : " + ts2);
		
		System.out.println("\nCreate a reverse order view of the elements contained in a given tree set: "+ts2.descendingSet());
		
		System.out.println("\nGet the first elements in a tree set : " + ts2.first());
		System.out.println("\nGet the Last elements in a tree set : " + ts2.last());
		
		TreeSet<String> cs = new TreeSet<>(ts2);
		System.out.println("\nClone a tree set list to another tree set : " + cs);
		
		System.out.println("\nGet the number of elements in a tree set : " + cs.size());
		
		TreeSet<String> compareSet = new TreeSet<>();
		compareSet.add("RED");
		compareSet.add("green");
		compareSet.add("Yellow");
		for(String color : cs)
		{
            System.out.println("\n" + color + " exists in compareSet? " + compareSet.contains(color));	
		}			
		
		TreeSet<Integer> numSet = new TreeSet<>();
        numSet.addAll(Arrays.asList(1, 2, 3, 5, 7, 8, 10));

        System.out.println("\nNumeric TreeSet: " + numSet);

        System.out.println("i. Numbers < 7: " + numSet.headSet(7));

        System.out.println("j. Ceiling of 7: " + numSet.ceiling(7));

        System.out.println("k. Floor of 7: " + numSet.floor(7));

        System.out.println("l. Higher than 7: " + numSet.higher(7));

        System.out.println("m. Lower than 7: " + numSet.lower(7));

        System.out.println("n. Poll First: " + numSet.pollFirst());
        System.out.println("   TreeSet after pollFirst: " + numSet);

        System.out.println("o. Poll Last: " + numSet.pollLast());
        System.out.println("   TreeSet after pollLast: " + numSet);

        boolean removed = numSet.remove(5);
        System.out.println("p. Remove 5: " + (removed ? "Removed" : "Not Found"));
        System.out.println("   Final TreeSet: " + numSet);
	}
 }
 
/*5. Write a Java program to,

  1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
  2. iterate through all elements in priority queue.
  3. add all the elements of a priority queue to another priority queue.
  4. insert a given element into a priority queue.
  5. remove all the elements from a priority queue.
  6. count the number of elements in a priority queue.
  7. compare two priority queues.
  8. retrieve the first element of the priority queue.
  9. retrieve and remove the first element.
  10. convert a priority queue to an array containing all of the elements of the queue.

 */
 
class  PriorityQueueOperations
{
	public static void main(String[] args)
	{
		PriorityQueue<String> pq = new PriorityQueue<>();
		
		pq.add("RED");
		pq.add("YELLOW");
		pq.add("GREEN");
	
		System.out.println("\nPriority Queue : " + pq);
		
		Iterator<String> it = pq.iterator();
		
		System.out.println("\nIterate through all elements in priority queue : ");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		PriorityQueue<String> pq2 = new PriorityQueue<>(pq);
 		System.out.println("\nAdd all the elements of a priority queue to another priority queue : " + pq2);
		
	    pq.add("Blue");
        System.out.println("\nInsert a given element into a priority queue : " + pq);

        pq2.clear();
        System.out.println("\nRemove all the elements from a priority queue : " + pq2);	

		System.out.println("\nCount the number of elements in a priority queue : " + pq.size());
		
		PriorityQueue<String> pq3 = new PriorityQueue<>(pq);
		System.out.println("\nCompare two priority queues : " + pq3.equals(pq));
		
		System.out.println("\nRetrieve the first element of the priority queue : " + pq.peek());
		
		System.out.println("\nRetrieve and remove the first element : " + pq.poll());
		
		Object[] arr = pq.toArray();
		System.out.println("\nConvert a priority queue to an array containing all of the elements of the queue : " + Arrays.toString(arr));
	}
}	
 
 /*6. Write a Java program to,
   1. associate the specified value with the specified key in a Tree Map.
   2. copy a Tree Map content to another Tree Map.
   3. search a key in a Tree Map.
   4. search a value in a Tree Map.
   5. get all keys from the given a Tree Map.
   6. delete all elements from a given Tree Map.
   7. sort keys in Tree Map by using comparator.
   8. get a key-value mapping associated with the greatest key and the least key in a map.
   9. get the first (lowest) key and the last (highest) key currently in a map.
   10. get a reverse order view of the keys contained in a given map.
   
 */
 
class TreeMapOperations
{
	public static void main(String[] args)
	{
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		tm.put(2, "Karthik");
		tm.put(3, "Doss");
		tm.put(4, "Mahali");
		
		System.out.println("\nAssociate the specified value with the specified key in a Tree Map : " + tm);
		
		TreeMap<Integer, String> tm2 = new TreeMap<>(tm);
		System.out.println("\nCopy a Tree Map content to another Tree Map : " + tm2);
		
		System.out.println("\nSearch a key in a Tree Map : " + tm.containsKey(2));
		
		System.out.println("\nSearch a value in a Tree Map : " + tm.containsValue("Karthik"));
		
		Set<Integer> keys = tm.keySet();
		System.out.println("\nGet all keys from the given a Tree Map : " + keys);
		
		tm2.clear();
		System.out.println("\nDelete all elements from a given Tree Map : " + tm2);
		
		TreeMap<Integer, String> sm = new TreeMap<>(Collections.reverseOrder());
		sm.putAll(tm);
		System.out.println("\nSort keys in Tree Map by using comparator : " + sm);
		
		Map.Entry<Integer, String> greatest = tm.lastEntry();	
        Map.Entry<Integer, String> least = tm.firstEntry();		
		System.out.println("\nGet a key-value mapping associated with the greatest key in a map : " + greatest);
		System.out.println("Get a key-value mapping associated with the least key in a map : " + least);
		
		System.out.println("\nGet the first (lowest) key currently in a map : " + tm.firstKey());
		System.out.println("Get the last (highest) key currently in a map : " + tm.lastKey());
		
		NavigableSet<Integer> reverseKeys = tm.descendingKeySet();
        System.out.println("\nGet a reverse order view of the keys contained in a given map : " + reverseKeys);
	}
}	
 
 /*7. Write a Java program to,
 
   1. associate the specified value with the specified key in a HashMap.
   2. count the number of key-value (size) mappings in a map.
   3. copy all of the mappings from the specified map to another map.
   4. remove all of the mappings from a map.
   5. check whether a map contains key-value mappings (empty) or not.
   6. get a shallow copy of a HashMap instance.
   7. test if a map contains a mapping for the specified key.
   8. test if a map contains a mapping for the specified value.
   9. create a set view of the mappings contained in a map.
   10. get the value of a specified key in a map.

*/

class HashMapOperations
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> hm = new HashMap<>();
		
	    hm.put(1, "Karthik");
		hm.put(2, "Vels");
		hm.put(3, "Doss");
		hm.put(4, "Mahali");
		
		System.out.println("\nAssociate the specified value with the specified key in a HashMap : " + hm);
		
		System.out.println("\nCount the number of key-value (size) mappings in a map : " + hm.size());
		
		HashMap<Integer, String> hm2 = new HashMap<>(hm);
		System.out.println("\nCopy all of the mappings from the specified map to another map : " + hm2);
		
		hm2.clear();
		System.out.println("\nRemove all of the mappings from a map : " + hm2);
		
		System.out.println("\nCheck whether a map contains key-value mappings (empty) or not : " + hm2.isEmpty());
		
		HashMap<Integer, String> hm3 = new HashMap<>(hm);
		System.out.println("\nGet a shallow copy of a HashMap instance : " + hm3);
		
		System.out.println("\nTest if a map contains a mapping for the specified key : " + hm.containsKey(3));
		
		System.out.println("\nTest if a map contains a mapping for the specified key : " + hm.containsValue("Karthik"));
		
		System.out.println("\nCreate a set view of the mappings contained in a map : ");
        Set<Map.Entry<Integer, String>> es = hm.entrySet();
        for(Map.Entry<Integer, String> e : es)
		{
            System.out.println("Key : " + e.getKey() + " = Value : " + e.getValue());
		}			
		
		System.out.println("\nGet the value of a specified key in a map : " + hm.get(2));
	}
}

/*8. Develop a Java program to manage a list of bank accounts using ArrayList.

--->Create an Account class with the following attributes:
a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use autoboxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed).

*/

class Account
{
	private int accountNumber;
	private String holderName;
	private Double balance;                   //AutoBoxing
	
	Account(int accountNumber, String holderName, double balance)
	{
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public void applyInterestRate(Double interest)
	{
		double newBalance = balance + (balance * interest / 100); //UnBoxing
		balance = newBalance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public String getHolderName()
	{
		return holderName;
	}
	
	public Double getBalance()
	{
		return balance;
	}
}

class Bank
{
	public static void main(String[] args)
	{
		Double interest = 5.0; //Manual Boxing
		
		ArrayList<Account> al = new ArrayList<>();
		
	    al.add(new Account(23253, "Karthik", 1500.00));
		al.add(new Account(26433, "Kishore", 1000.00));
		al.add(new Account(25363, "Ram", 1800.00));
		
		for(Account a : al)
		{
		    System.out.println("Account Number : " + a.getAccountNumber());
		    System.out.println("Account Holder Name : " + a.getHolderName());
		    System.out.println("Account Balance : " + a.getBalance());

			a.applyInterestRate(interest);
			
			double updateBalance = a.getBalance(); 
			
			System.out.println("Balance after 5% interest : " + updateBalance + "\n");
		}
	}
}
