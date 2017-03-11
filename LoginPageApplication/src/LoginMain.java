import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Username;
		String Password;
		
		Username = "myname";
		Password = "123456";
		
		Scanner input_1 = new Scanner(System.in);
		System.out.println("Enter Username ?");
		String username = input_1.next();
		
		//Scanner input_1 = new Scanner(System.in);
		System.out.println("Enter password ?");
		String password = input_1.next();
		
		if (username.equals(Username) && password.equals(Password)) {
			System.out.println("Access Granted");
		}
		else {
			System.out.println("check username and password combination");
		}
		
			
		
		
		
		
	}

}
