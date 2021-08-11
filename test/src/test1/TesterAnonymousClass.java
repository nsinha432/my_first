/*package test1;

public class TesterAnonymousClass implements TesterMyInterface{
	
	public static void main(String[] args) {
		
		TesterAnonymousClass cs = new TesterAnonymousClass();
		cs.hello();
		
		TesterMyInterface ts = new TesterMyInterface() {
			@Override
			public void hello() {
				System.out.println("Hello from anonymous class");
			}
		};
		ts.hello();
		
		TesterMyInterface ts22 = new TesterMyInterface() {
			@Override
			public void hello() {
				hello2();
			}
			public void hello2() {
				System.out.println("I am hello2 from anony class");
			}
		};
		
		ts22.hello();
		
	}
	
	@Override
	public void hello() {
		System.out.println("Hello from hello()");
	}
}
*/