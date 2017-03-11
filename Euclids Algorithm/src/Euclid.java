import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Euclid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0, n2=0;
		System.out.println("Enter the two numbers whose GCD you want to find");
		BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
		try {
			n1 = Integer.parseInt(Input.readLine());
			n2 = Integer.parseInt(Input.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The GCD of the numbers "+ n1 + " and " + n2 + " is " + gcd(n1, n2));
		
		

	}
	
	public static int gcd(int p1, int p2) {
		if (p2==0) return p1;
		int r = p1%p2;
		return gcd(p2, r);
	}

}
