package eg1;

public class Add {
	public static int add(int a, int b) {
		return a +b;
	}
	
	public static int addPositiveNumbers(int a, int b) throws IllegalArgumentException {
		
		if(a<0 || b<0) throw new IllegalArgumentException("Negative numbers not allowed");
		
		return a + b;
	}
}
