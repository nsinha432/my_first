package test1;

@FunctionalInterface
public interface TesterMyInterface {
	public void hello(int a, int b);
	
	default void abc() {
		System.out.println("I am default");
	}
	
	public static void iamStatic() {
		System.out.println("hey i am static");
	}
	
}
