import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.nio.ReadOnlyBufferException;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Console console = System.console();
		//String s = console.readLine();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String s;
		int option = 0;
		int num1 = 0;
		int num2 =0;
		int result =0;

		System.out.println("1. Addition");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("Enter the operation to be done" + '\n');
		
		try {
			option = Integer.parseInt(br.readLine()); //Input from user as to which operation he wants to do
			System.out.println("Enter the 1st no"+'\n');
			num1 = Integer.parseInt(br.readLine());
			System.out.println("Enter the 2nd no"+ 'n');
			num2 = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Incorrect Input");
			
						
		}
					
		BasicFucntions basic = new BasicFucntions();
		while (true) {
			if (option == 1) {
				result = basic.add(num1, num2);
				break;
			}
			else if (option ==2) {
				result =basic.subtract(num1, num2);
				break;
			}
			else if (option == 3) {
				result= basic.multiply(num1, num2);
				break;
			}
			else if (option == 4) {
				result = basic.divide(num1, num2);
				break;
			}
			else {
				System.out.println("Wrong Option");
				break;
			}
		}
		System.out.println("The result of you operation is " + result);
		System.out.println("Thank you");
			

	}

}
