package my_package;

public class Area {

	public static double AreaCalculator(double a) {
		return a*a;
	}
	
	public static double AreaCalculator(double a, double b) {
		return a*b;
	}
	
	public static double AreaCalculator(double a, double b, double h) {
		
		return h*(a+b)/2;
		
	}
	
	public static void main(String args[]) {
		
		System.out.println(AreaCalculator(5));
		System.out.println(AreaCalculator(5,10));
		System.out.println(AreaCalculator(22,10,5));
	}
}
