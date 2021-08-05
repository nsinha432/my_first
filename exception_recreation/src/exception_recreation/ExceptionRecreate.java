package exception_recreation;

public class ExceptionRecreate {
	public static void main(String[] args)  {
		int a = 1;
		int b = 4;
		
		if(a == 1) {
			throw new Unchecked_Exception("Dividing by one gives the same answer");
		}
		else {
			System.out.println(b/a);

		}
	}
}
