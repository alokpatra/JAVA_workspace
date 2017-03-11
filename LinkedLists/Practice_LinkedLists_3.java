class LinkedListApp
{
	public static void main(String[] args)
	{
		LinkList theList = new LinkedList(); //Make new list
		theList.isertFirst(10, 10.0);
		theList.isertFirst(11, 11.1);
		theList.isertFirst(12, 12.2);
		theList.isertFirst(13, 13.3);
		
		theList.displayList();
		
		while(!theList.isEmpty())
		{
			Link aLink = theLink.deleteFirst();
			System.out.println("Deleted ");
			aLink.displayLink();
			System.out.println("");
		}
		theList.displayList();
	}
}