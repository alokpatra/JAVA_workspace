//MergeSort using Recursion
class Darray
{
	private int nElments;
	private long[] theArray;
	
	//Constructor
	public Darray(int max)
	{
		NElements = 0;
		theArray = new long[max];
	}
	
	//Insert Elements
	public void insert(long value)
	{
		theArray[nElments] = value
		nElements++;
	}
	
	//Display Elements
	public void display()
	{
		for (inti=0; i<nElements; i++)
			System.out.print(theArray[i]+" ");
		System.out.println(" ");
	}
	
	
	//mergeSort Method
	public void mergeSort()
	{
		long[] workspace = new long[nElements];
		recMergeSort(workspace, 0, nElements-1);
		
	}
	
	
	//recMergeSort Method
	private void recMergeSort(long[] workspace, int lowerBound, int upperBound)
	{
		if (upperBound==lowerBound) //If range is 1
			return; // no use sorting. Hence return
		else  //range is more than 1
		{
			int mid= (lowerBound + upperBound)/2;
			
			recMergeSort(workspace, lowerBound, mid); //sort lowerBound
			recMergeSort(workspace, mid, upperBound); //sort upperBound
			
			merge(workspace, lowerBound, mid+1, upperBound); // merge them
		}// end else
	}
	
	
	//merge method
	private void merge(long[] workspace, int lowPtr, int highPtr, int upperBound )
	{
		int j=0; // workspace index
		int lowerBound = lowPtr;
		int mid = highPtr-1;
		int n = upperBound-lowerBound+1; //no of items
		
		while(lowPtr<= mid && highPtr<=upperBound)
		{
			if (theArray[lowPtr]<theArray[highPtr])
				workspace[j++] = theArray[lowPtr];
			else
				workspace[j++] = theArray[highPtr]
			
			while(lowPtr <= mid)
				workspace[j++] = theArray[lowPtr++];
			
			while(highPtr <= mid)
				workspace[j++] = theArray[highPtr++];
			
			for (j= 0; j<n; j++)
				theArray[lowerBound+j] = workspace[j];
		}//end while
		
	}
}
	

class MergeSortApp
{
	public static void main(String[] args)
	{
		int maxSize  = 100;
		Darray arr = new Daaray(maxSize);
		arr.insert(71);
		arr.insert(65);
		arr.insert(81);
		arr.insert(93);
		arr.insert(71);
		arr.insert(38);
		arr.insert(59);
		arr.insert(21);
		arr.insert(56);
		arr.insert(3);
		arr.insert(1);
		arr.insert(8);
		arr.insert(9);
		arr.insert(2);
		arr.insert(6);
		
		arr.display();
		
		arr.mergeSort();
		
		arr.display();
	}
}
		

