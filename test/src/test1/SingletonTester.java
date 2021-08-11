package test1;

public class SingletonTester {
	private static SingletonTester singleton = null;
	
	private SingletonTester() {
	}
	
	public static SingletonTester getInstance() {
		if(singleton == null) singleton = new SingletonTester();
		return singleton;
	}
	
	
}
