package test1;

public class TesterMain {
	public static void main(String[] args) {
		
		Tester t1 = new Tester(011, "Nikhil");
		System.out.println(t1);
		
		Tester t2 = new Tester(012, "Binay");
		System.out.println(t2);
		
		System.out.println(t1.equals(t2));
		
	}
}
