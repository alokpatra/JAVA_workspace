//Sorted List with Insert() Remove and displayList() methods

class Link
{
	public long dData; //Data Item
	public Link next;  // next Link in List
	
	//Contructor
	public Link(long dd)
	{
		dData = dd;
	}
	
	public void displayList()
	{
		System.out.println(dData + " ");
	}
}


class SortedList
{
	private Link first; //ref to 1st item on the list
	
	//Contructor
	public SortedList()
	{
		fisrt = null;
	}
	
	//IsEmpty Method
	public boolean isEmpty()
	{
		return (first == null); // If fisrt points to null then the list is empty
	}
	
	//Insert Method
	//Insert in order
	public void insert(long key) 
	{
		Link newLink = new Link(key);
		Link previous = null
		Link current = first;
		
		while (current!=null && key > current.dData) //loop to move into right location in the sorted list
		{
			previous = current;
			current = current.next;
		}
		
		//Now we are in the rght position to insert
		//Insertion can be at the start or somewhere in the middle
		//Link the previous.next array to the new one if insertion in the middle else link first to newLink if inseetion in the beginning
		if (previous = null) // Meaning at the beginning
			first = newLink;
		else
			previous.next = newLink;
		newLink.next = current;
	}		
		
	
	//Remove Method
	public Link remove() // return and delete 1st item and assume non empty list
	{
		Link temp = fisrt;
		fisrt = first.next;
		return temp;
	}
	
		
	//displayList Method
	public void displayList()
	{
		System.out.println("List (first --> last):");
		Link current =first; //begin at the starting of the list
		while(current !=null)
		{
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
		
}


class SortedListApp
{
	public static void main(String[] args)
	{
		//Create new list
		SortedList theSortedList = new SortedList();
		
		//Insert 2 Items
		theSortedList.insert(20);
		theSortedList.insert(40);
		
		//Display List
		theSortedList.displayList();
		
		//Insert 3 Items in the list
		theSortedList.insert(10);
		theSortedList.insert(30);
		theSortedList.insert(50);
		
		//Dsiplay List
		theSortedList.displayList();
		
		//Remove an item
		theSortedList.remove(20);
		
		//Display List
		theSortedList.displayList();
		
	}
}
	
		

		