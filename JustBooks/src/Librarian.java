import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Librarian {
	static BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
	static int option_2;
	static String userName;
	public static void librarianWelcome() throws Throwable {
		System.out.println("1. Search Book");
		System.out.println("2. Add User");
		System.out.println("3. Search User");
		System.out.println("4. Add Book");
		option_2 = Integer.parseInt(Input.readLine());
		if (option_2 == 1) {
			Books.search();
		}
		else if (option_2 == 2) {
			User.addUser();
		}
		else if (option_2 == 3) {
			System.out.println("Enter username to search");
			userName = Input.readLine();
			User.searchUser(userName);
		}
		else if (option_2 == 4) {
			Books.addBooks();
		}
		
	}

}
