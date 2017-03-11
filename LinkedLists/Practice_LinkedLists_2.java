class LinkList 
{
	private Link first;
	
	//Constructor
	public LinkList()
	{
		first = null;
	}
	
	//Check Empty or not method
	public boolean isEmpty()
	{
		return (first=null);
	}
	
	//InsertFirst Method
	public void insertFirst(int id, double dd) 
	{
		//Make a new Link
		Link newLink = new Link(id, dd);
		newLink.next = first;
		first = newLink;
	}
	
	public Link deleteFirst()
	{
		Link temp = first;
		first= first.next;
		return temp;
	}
	
	public displayList()
	{
		System.out.println("List (first-->last):");
		Link current = first;
		while(current!=null)
		{
			curent.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
		