import user.User;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		Test t = new Test();
		t.print();
		
		User u = new User();
		u.print_my_age();
		
		User u1= new User("alok", 25);
		u1.print_my_age();
				
	}

}
