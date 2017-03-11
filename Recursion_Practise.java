//Triangle App
//Recursion
import java.io.*;
class TriangleApp
{
	static int num;
	public static void main(String[] args) throws IOException
	{
		//Main method
		System.out.println("Enter a number");
		num = getInt();
		int tri = triangle(num);
		System.out.println("Triangle No for entered number " + num + " is " + tri);
	}

	//Get string method
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		return str;
	}


	//getInt Method
	public static int getInt() throws IOException
	{
		String s = getString();
		return Integer.parseInt(s);
	}

	//Triangle Method
	public static int triangle(int n)
	{
		if (n==1)
			return 1;
		else
			return (n + triangle(n-1));
	}
}
