
public class Operations {
	
	private long[] Team;
	public int out, inn, mark;
	int NoOfElements;
	
	public Operations(int max) {
		// TODO Auto-generated constructor stub
		Team = new long[max];
		
	}

	public void Sort(int mark) {
		out = 1;
		inn = out;
		for (int i=out; i<NoOfElements; i++) {
			mark = Team[out+1];
			for (int j=i; j>=0; j--) {
				if (Team[j] > mark) 
					Team[j+1]= Team[j];
				else {
					Team[j+1] = mark;
					break;
					
				}
			}
		}
		
		
		
		
		
	}

	public void insert(int value) {
		// TODO Auto-generated method stub
		Team[NoOfElements] = value;
		System.out.println("Element " + value + " inserted at postion " + NoOfElements);
		NoOfElements++;
		
	}
	

}
