package test1;

public class SingletonTesterMain {
	public static void main(String[] args) {
		
		SingletonTester s1 = SingletonTester.getInstance();
		SingletonTester s2 = SingletonTester.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
