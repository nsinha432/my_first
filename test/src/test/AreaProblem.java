package test;

class square{
	public static int area(int x) {
		return x*x;
	}
}
class rectangle {
	public static int area(int x, int y) {
		return x*y;
	}
}

class trapezium{
	public static double area (int x, int y, int h) {
		return (double)((x+y)*h)/2;
	}
}


public class AreaProblem {
	
	public static void main(String[] args) {
		trapezium t = new trapezium();
		System.out.println(trapezium.area(5,6,4));
		System.out.println(rectangle.area(2, 3));
	}

}
