class Link
{
	public long dData;
	public Link next;
	
	//Contructor
	public Link(long dd)
	{
		dData = dd;
	}
	
	//Display Method
	public void displayLink()
	{
		System.out.println(dData + " ");
	}
}
	
class LinkList
{
	private Link first;
	
	//Constructor
	public LinkList();
	{
		first = null;
	}
	
	//Get Link Method
	public Link getFirst()
	{
		return first;
	}
		
	//SetFirst Method
	public void setFirst()
	{
		first = f;
	}
	
	
	//IsEmpty Method
	public boolean isEmpty()
	{
		return first==null;
	}
	
	//Get Iterator Method
	public ListIterator getIterator()
	{
		return new ListIterator(this);
	}
	
	//DisplayList Method
	public void displayList()
	{
		Link current = first; // Start at the beginning of the list
		while(current != null)
		{
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	
} // end class LinkList

class ListIterator
{
	private Link previous;
	private Link current;
	private LinkList ourList; //Our LinkedList
	
	//Contructor
	public ListIterator(LinkList list)
	{
		ourList = list;
		reset();
	}
	
	//Reset Method
	public void reset()
	{
		current = ourList.getFirst();
		previous = null;
	}
	
	//atEnd Method
	public boolean atEnd()
	{
		return current.next==null;
	}
	
	//nextLink Method
	public void nextLink();
	{
		previous = current;
		current = current.next;
	}
	
	//getCurrent Method
	public Link getCurrent()
	{
		return current;
	}
	
	//insertAfter Method
	public void insertAfter(long dd)
	{
		Link newLink = new Link(dd);
		if (ourList.isEmpty())
		{
			ourList.setFirst(newLink);
			current = newLink;
		}
		else
		{
			newLink.next = current.next;
			current.next = newLink;
			nextLink();
		}
	} //end insertAfter method
	
		
	//insertBefore Method
	public void insetBefore()
	{
		Link newLink = new Link(dd);
		if (previous ==null) //if beginning of the List or Empty List
		{
			newLink.next = ourList.getFirst();
			ourList.setFirst(newLink);
			reset();
		}
		else
		{
			newLink.next = previous.next;
			previous.next = newLink;
			current = newLink;
		}
	}
	
	//deleteCurrent Method
	public long deleteCurrent()
	{
		long value = current.dData; // to store value of deleted element
		
		
		if (previous=null) // if beginning of the list or Empty List
		{
			ourList.setFirst(current.next);
			reset();
		}
		else //Not Beginning
		{
			previous.next = current.next;
			if (atEnd)
				reset();
			else
				current = current.next;
			
		}
		return value;
			
		
	}
	
}		
		

Class InterIterApp
{
	public static void main(String[] args) IOException
	{
		LinkList theList = new LinkList(); //new list
		LinkIterator iter1 = theList.getIterator; // new Iter
		long value;
		
		iter1.insertAfter(20); //Insert Items
		iter1.insertAfter(40);
		iter1.insertAfter(60);
		iter1.insertAfter(80);
		iter1.insertAfter(100);
		
		while (true)
		{
			System.out.println("Enter 1st letter of show, reset, next, get, before, after, delete");
			System.out.flush();
			int choice = getchar(); // get user opinion
			switch(choice)
			{
				case 's': //Show List
					if (!theList.isEmpty())
						theList.displayList();
					else
						System.out.println("The list is Empty");
					break;
				case 'r': //Reset
					iter1.reset();
					break;
				case 'n': // Advance to next
					if (!theList.isEmpty() && !iter1.atEnd())
						iter1.nextLink();
					else 
						System.out.println("Can't goto next link");
					break;
				case 'g': // Get current Item Item
					if (!theList.isEmpty())
					{
						value = iter1.getCurrent().dData;
						System.out.println("Returned Value: " + value);
					}
					else
						System.out.println("The list is Empty");
					break;
				case 'b': // Insert before current
					System.out.println("Enter value to insert");
					System.out.flush();
					value = getInt();
					iter1.insertBefore(value);
					break;
					
				case 'a': // Insert after current
					System.out.println("Enter value to insert");
					System.out.flush();
					value = getInt();
					iter1.insertAfter(value);
					break;
				case 'd': // Delete current Item
					if (!theList.isEmpty())
					{
						value = iter1.deleteCurrent();
						System.out.println("Deleted Value: " + value);
					}
					else
						System.out.println("Can't delete as List is Empty");
					break;
			}//end switch
		}//end while loop
	}//end main
	
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s  = br.readLine();
		return s;
	}
	
	public static char getChar() throws IOException
	{
		String s =getString();
		return s.charAt(0);
	}
	public static int getInt() throws IOException
	{
		String s  = getString();
		return Integer.parseInt(s);
	}
	
}//ends class

				
			
					
					
					
					
					
					
						
			
		
		
		
		
		
		
		
		
		
		