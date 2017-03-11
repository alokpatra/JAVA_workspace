
public class ObjectSortApp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 100;
		Operations arr; //Reference to array
		arr= new Operations(max); // Create a new array of type Operations
		//Insert people
		arr.Insert("Alok", "Patra", 24);
		arr.Insert("Prajwal", "Verma", 26);
		arr.Insert("Sahil", "Gardner", 25);
		arr.Insert("Arjun", "Hariharan", 28);
		arr.Insert("Ashwin", "Palve", 23);
		arr.Insert("Tushar", "Wagh", 19);
		
		
		
		//Display People
		System.out.println("Array before Sorting");
		arr.Display();
		
		//Sort People
		System.out.println("Sorting Array");
		arr.Sort();
		
		//Display People
		System.out.println("Array after Sorting");
		arr.Display();
		

	}

}
