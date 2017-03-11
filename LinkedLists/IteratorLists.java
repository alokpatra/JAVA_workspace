//Iterator List
class ListIterator
{
	private Link current;
}

public static void main()
{
	LinkList theList = new LinkList(); // Make List
	ListIterator iter1 = theList.getIterator();
	Link aLink = iter1.getCurrent();
	iter1.getNext();
}

	