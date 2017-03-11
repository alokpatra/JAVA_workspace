
public class Person {
	String FirstName;
	String LastName;
	int Age;

	
	//Constructor
	public Person(String first, String last, int age) {
		// TODO Auto-generated constructor stub
		FirstName = first;
		LastName = last;
		Age = age;
	}

	//Method to get Last Name
	
	public String getFirst() {
		// TODO Auto-generated method stub
		
		
		return FirstName;
	}
	
	//Display Person
	
	public void displayPerson() {
		System.out.print("FirstName " + FirstName);
		System.out.print("LastName " + LastName);
		System.out.print("Age " + Age);
	}

}
