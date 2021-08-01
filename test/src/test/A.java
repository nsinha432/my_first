package test;

public class A {

	public static void hello() {
		System.out.println("Hello from static");
	}
	
	public void tata() {
		System.out.println("hello from non-static");
	}
	
	public static void main(String[] args) {
		A a1 = new B();
		a1.tata();
		hello();
	}
	
}
