package my_package;
import java.util.Scanner;

public class Domain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(Domain.sendDomain(s));
		
	}
	
	public static String sendDomain(String s) {
		
		int ind = 0;
		
		if(s.startsWith("http://")) s = s.replaceFirst("http://", "");
		else if(s.startsWith("https://")) s = s.replaceFirst("https://", "");
		
		ind = s.indexOf('/');
		s = s.substring(0,ind);
		
		return s;
	}
}
