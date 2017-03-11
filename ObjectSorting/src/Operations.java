
public class Operations {
	
	private Person[] a; // Create a reference
	int NoOfElements, i=0;   
	
	//Constructor
	
	Operations(int size) {
		a = new Person[size]; //Create an array
		NoOfElements = 0;	  
	}
	
	//Insert Method
	
	public void Insert(String Name, String LastName, int Age) {
		a[NoOfElements] = new Person(Name, LastName, Age);
		NoOfElements++;		
	}
	
	
	//Sorting Method
	
	public void Sort() {
		int inn, out;
		for(out=1; out<NoOfElements; out++) {
			inn = out;
			Person temp = a[out];
			//while(inn>0 && a[inn-1].getFirst().compareTo(temp.getFirst())>0) {
			while (inn>0 && a[inn-1].Age>temp.Age) {
			a[inn] = a[inn-1]; //Shift the values to the right
				--inn; //Go left one position
			}
			a[inn] = temp;
			
		}// Close outter for loop
	}// Close sort method

	
	//Display Method
	public void Display() {
		for (i = 0; i<NoOfElements; i++) {
			a[i].displayPerson();
			System.out.println("");
		}
	}

}
