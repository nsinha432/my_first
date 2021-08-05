package test;

public class B extends A{
	
	public static void hello() {
		System.out.println("Hellooooo");
}
	
	public void non_staticHello() {
		System.out.println("Helloooooo");
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		A a = new A();
		
		a.non_staticHello();
		
	}
	
}
