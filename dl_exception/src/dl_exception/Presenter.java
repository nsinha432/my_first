package dl_exception;
import java.util.Scanner;

public class Presenter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		DlValidator d1 = new DlValidator();
		
		try{
			d1.isValidDl(s);
			System.out.println("DL has been validated successfully");
		}
		catch(InvalidDlException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
