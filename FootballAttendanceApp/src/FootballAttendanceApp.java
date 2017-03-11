//Football Attendance to search, insert, display delete players
//Un-OrderedArray

public class FootballAttendanceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations Fteam = new Operations(50);
		
		//Add elements into the array
		Fteam.insert(1);
		Fteam.insert(2);
		Fteam.insert(3);
		Fteam.insert(4);
		Fteam.insert(5);
		Fteam.insert(6);
		
		//Display Elements
		
		Fteam.display();
		
		// Search for element 4
		
		Boolean SearchStatus = Fteam.search(4);
		if (SearchStatus == true)
			System.out.println("Element 4 Found");
		else
			System.out.println("Element NOT Found");
		
		//Delete Element
		
		Fteam.delete(2);
		System.out.println("Element 2 deleted");
		Fteam.delete(5);
		System.out.println("Element 5 deleted");
		
		//Insert Element
		
		Fteam.insert(7);
				
		//Display Elements
		
		Fteam.display();
		
		
		
		

	}

}
