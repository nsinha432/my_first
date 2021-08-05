package test1;

public class TesterCustomBussiness {
	public void isValidAge(int age) throws TesterInvalidAgeException  {
		
		if(age<= 0) {
			throw new TesterInvalidAgeException("Age cannot be zero or negative");
		}
		
		else if(age>30 || age<18) {
			throw new TesterInvalidAgeException("You are outside the eligible ages");
		}
		
		
	}
}
