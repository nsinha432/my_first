package dl_exception;

import java.util.regex.Pattern;

public class DlValidator {
	
	public void isValidDl(String s) throws InvalidDlException {
		//String pattern = "[A-Z]{2}[0-9]{13}"; //Driver's License
		
		String pattern = "[0-9]{12}"; 	//Aadhar Card
		
		
		if (!Pattern.matches(pattern, s)) {
			throw new InvalidDlException("Your DL is not valid");
		}
	}
	
	
}
