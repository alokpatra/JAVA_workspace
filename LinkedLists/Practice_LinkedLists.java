Class Link
{
	public int iData;
	public double dData;
	public Link next;
	
	//Constructor
	public Link(int i, int d)
	{
		iData = i;
		dData = d;
	}
	
	public void displayLink()
	{
		System.out.println("{"+ iData +", " + dData +"}");
	}

}
