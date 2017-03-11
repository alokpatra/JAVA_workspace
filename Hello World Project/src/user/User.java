package user;

public class User {
	
	String name;
	int age;
	
	public User() {
		name = "arjun";
		age = 24;
	}
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print_my_age() {
		System.out.println("my age is " + age);
	}
	
	public void print_my_age(String name) {
		this.print_my_age();
	}
}
