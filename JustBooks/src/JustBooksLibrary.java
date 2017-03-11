import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.io.BufferedReader;
public class JustBooksLibrary {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		int Option = 0, indexOfUser=-1;
		String Username;		
		BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hi");
		System.out.println("Are you a User or Librrian ? ");
		System.out.println("1. User");
		System.out.println("2. Librarian");
		Option = Integer.parseInt(Input.readLine());
		switch(Option) {
		case 1:
			System.out.println("Enter Username");
			Username = Input.readLine();
			// Find user and log index of user
			indexOfUser = User.searchUser(Username);
			if (indexOfUser != -1) {
				User.UserWelcome(indexOfUser);
			}			
			else if (indexOfUser == -1) {
				System.out.println("User not found");
				break;
			}
			
		case 2:
			Librarian.librarianWelcome();
			
			
			break;
		default:
			System.out.println("Wrong input");
			break;
			
		
		}
	}

}
