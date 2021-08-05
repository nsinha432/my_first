package test1;

public class TesterCustomPresentation {
	public static void main(String[] args) {
		
		TesterCustomBussiness t1 = new TesterCustomBussiness();
			try {
				t1.isValidAge(1);
				System.out.println("Age Validated");
			} catch (TesterInvalidAgeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
	}
}
