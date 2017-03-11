import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {
	static String users[];
	static int userID[];
	static boolean userIssueStatus[];
	static int bookID_ofBookIssuedByUser[];
	static int indexOfUser =0;
	static int indexOfBook =0;
	static int i, option;
	static int totalNoOfUsers =0;
	static String userName;
	static BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
	
	public static void UserWelcome(int indexOfUser) throws NumberFormatException, IOException {
		System.out.println("Enter the operation you want to carry out");
		System.out.println("1. Search Book to Issue");
		System.out.println("2. Return Book");
		option = Integer.parseInt(Input.readLine());
		switch(option) {
		case 1:
			Books.search(indexOfUser);	
		case 2:
			User.Return(indexOfUser);
			
		}
		
	}
	
	public static void Issue(int indexOfUser, int indexOfBook) {
		System.out.println("Welcome to Book Issue");
		userIssueStatus[indexOfUser] = true;
		bookID_ofBookIssuedByUser[indexOfUser] = Books.bookID[indexOfBook];
		Books.bookStatus[indexOfBook] = true;
		System.out.println("Book Issued Sucessfully! Happy Reading");			
	}
	
	
	
	public static void Return(int indexOfUser) throws NumberFormatException, IOException {
		System.out.println("Welcome to Return Book");
		if (userIssueStatus[indexOfUser] == false) {
			System.out.println("No Book Issued!!");
		}
		else {
			System.out.println("Hit 1. To return " + bookID_ofBookIssuedByUser[indexOfUser]);
			option = Integer.parseInt(Input.readLine());
			if (option == 1 ) {
				for(i=0; i< Books.totalNoOfBooks; i++) {
					if (Books.bookID[i] ==bookID_ofBookIssuedByUser[indexOfUser]) {
						indexOfBook = i;
						break;
					}
					
				}
				Books.bookStatus[indexOfBook] = false;
				bookID_ofBookIssuedByUser[indexOfUser] = -1;
				userIssueStatus[indexOfUser] = false;
				
			}
		}
	}
	
	
	
	public static int searchUser(String username) {
		for (i =0; i<totalNoOfUsers; i++) {
			if (users[i] == username) {
				indexOfUser = i;
								
			}
			
		}
		return indexOfUser;
	}
	
	
	public static void addUser() throws Exception  {
		System.out.println("Enter name of User to be added");
		userName = Input.readLine();
		users[totalNoOfUsers] = userName;
		userID[totalNoOfUsers] = totalNoOfUsers;		
		bookID_ofBookIssuedByUser[totalNoOfUsers] = -1;
		userIssueStatus[totalNoOfUsers] = false;
		System.out.println("User " + userName +" added sucessfully :");
		totalNoOfUsers ++;		
	}


}

