package my_package;
import java.util.Scanner;

public class Secure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		Secure sec = new Secure();
		System.out.println(sec.isSecure(s));
		
		
	}
	
	public String isSecure(String s) {
		if(s.startsWith("https")) return "Secure";
		else return "Not Secure";
		
	}
}
