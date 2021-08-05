package test1;

public class TesterException {
	public static void main(String args[]) {
		
		int a = 10;
		int b = 2;
		int sum = 0;
		String s =" ss";
		
		System.out.println("We are going to calculate the sum");
		try{
			System.out.println(sum = a/b);
			System.out.println("The sum has printed");
			System.out.println(s.length());
			System.out.println(args[0]);
		}
		catch(ArithmeticException e) {
			System.out.println("You cannot divide by zero");
		}
		catch(NullPointerException e) {
			System.out.println(e+" String is null");
		}
		catch(Exception e) {
			System.out.println(e+ "Some other form of Exception");
		}
		System.out.println("Other LOC");
	}
}
