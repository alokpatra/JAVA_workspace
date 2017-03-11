class Maths {
	private int x = 30;
	private int y = 10;
	private int result;
	public static void main(Strg args[]) {
		result= add(x,y);
		System.out.println("The sum of the to numbers is" + result);
		result=  subt(x, y);
		System.out.println("The difference between the two numbers is " + result);
	}
	
	public int add(int a, int b) {
		return (a+b)
	}
	
	public int subt(int a, int b) {
		return(a-b)
	}
}