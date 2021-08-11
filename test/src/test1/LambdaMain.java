package test1;

public class LambdaMain {
	public static void main(String[] args) {
		
		TesterMyInterface t1 =(int a, int b)-> System.out.println("I am hello from lambda "+a);
		t1.hello(5,6);
		
		TesterMyInterface t2 =(int a, int b)->{
			System.out.println("hello again");
			System.out.println(a);
			System.out.println(b);
		};
		t2.hello(6, 8);
		t2.abc();
		TesterMyInterface.iamStatic();
		
	}
}
