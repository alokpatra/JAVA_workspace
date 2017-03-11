
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;

public class Books {
	static String Title[];
	static String Author[];
	//List<String> Title = new ArrayList<String>();
	//List<String> Author = new ArrayList<String>();
	String Publisher[];
	static int bookID[];
	int index=0;
	static int totalNoOfBooks = 0;
	static int i;
	static int SearchOption;
	static int indexOfBook;
	static String searchInput;
	static int IssueInput;
	static boolean searchStatus = false;	
	static boolean bookStatus[];	
	static BufferedReader Input_1 = new BufferedReader(new InputStreamReader(System.in));
	static BufferedReader Input_2 = new BufferedReader(new InputStreamReader(System.in));
	public void bookOperations() {
		
	}

	public static void search(int indexOfUser) throws IOException {
		System.out.println("Seach by :");
		System.out.println("1. Title :");
		System.out.println("2. Author :");
		System.out.println("3. Publisher :");
		System.out.println("4. Book ID");
		System.out.println("5. Back to Main Menu");
		switch(SearchOption) {
		case 1:
			System.out.println("Enter the Title"); // Book to be searched
			searchInput = Input_1.readLine(); //taking input from user
			//
			for (i=0;i<totalNoOfBooks;i++) {
				if (searchInput==Title[i]) {
					indexOfBook = i;
					System.out.println("Book found"); 
					System.out.println("Book_ID:" + bookID[indexOfBook] + "Title: " + Title[i] + "by" + Author[i] );
					if (bookStatus[i] == false) {
						System.out.println("issue Book ?");
						System.out.println("1. to issue book");
						IssueInput = Integer.parseInt(Input_1.readLine());
						if (IssueInput == 1) {
							User.Issue(indexOfUser, indexOfBook);	
						}						
					}
					else if (bookStatus[i] == true) {
						System.out.println("Sorry! Book is in circulation");
					}
					searchStatus = true;
					break;
				}
			}
			if (searchStatus==false) {
				System.out.println("Book NOT Found");
				break;
			}		
		case 2: 
			System.out.println("Enter the author of the book to be searched"); // Book to be searched
		case 3: 
			System.out.println("Enter the publisher of the book to be searched"); // Book to be searched
		case 4: 
			System.out.println("Enter the Book ID of the book to be searched"); // Book to be searched
		case 5: 
			System.out.println("Enter the author of the book to be searched"); // Book to be searched
		}		
	}
	
	
	public static void addBooks() throws IOException {
		
		System.out.println("Enter Title of book");
		Title[totalNoOfBooks] = Input_1.readLine();
		//Title.add(Input_1.readLine());
		System.out.println("Author");
		Author[totalNoOfBooks] = Input_1.readLine();
		//Author.add(Input_1.readLine());
		System.out.println(Title[totalNoOfBooks] + "by" + Author[totalNoOfBooks] + "sucessfully added to the Library!");
		totalNoOfBooks++;
	}

	public static void search() {
		// TODO Auto-generated method stub
		
	}

}
