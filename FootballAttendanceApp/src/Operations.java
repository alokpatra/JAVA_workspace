
public class Operations {
	private int[] Team;
	private int NoOfElements;
	int i;
	
	// Constructor 
	
	Operations(int max) {
		Team = new int[max];
		NoOfElements = 0;
		
	}
	
	// Search Method
	
	public boolean search(int element) {
		// TODO Auto-generated method stub
		for (i =0; i<NoOfElements; i++) 
			if (Team[i]== element) {
				System.out.println("Element Found!");
				break;
		
			}
		if (i==NoOfElements)
			return false;
			//System.out.println("Element NOT found");
		else
			return true;
	}
	
	//Display Method
	
	public void display() {
		// TODO Auto-generated method stub
		for (i =0; i<NoOfElements; i++) 
			System.out.println(Team[i] + " is at Position " + i );
		
	}
	
	//Delete Method
	
	public boolean delete(int value) {
		for (i =0; i<NoOfElements; i++) 
			if (Team[i]== value) {
				System.out.println("Element" + value + "to be deleted Found!");
				break;
		
			}
		if (i==NoOfElements) {
			System.out.println("Element" + value + "NOT found");
			return false;
		}
		else {
			for(int k=i; k<NoOfElements; k++)
				Team[k]=Team[k+1];
			NoOfElements--;
			return true;
		}
	}
	
	//Insert Method
	public void insert(int value) {
		Team[NoOfElements] = value;
		System.out.println("Element " + value + " inserted at postion " + NoOfElements);
		NoOfElements++;
	}
}
