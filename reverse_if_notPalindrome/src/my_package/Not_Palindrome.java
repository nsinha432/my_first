package my_package;
import java.util.Scanner;

public class Not_Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(rev_if_notPalindrome(s));
		
	}
	
	public static StringBuilder  rev_if_notPalindrome(String s) {
		String[] arr = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		
		for(int i = 0; i<arr.length; i++) {
			StringBuilder sb2 = new StringBuilder("");
			
			sb2.append(arr[i]);
			//sb2.reverse();
			//System.out.println(sb2.equals(sb2.reverse()));
			
			if(sb2.toString().equals(sb2.reverse().toString())) sb.append(arr[i]+" ");		
			else {
				sb.append(sb2+" ");
			}
		}
		
		return sb;
	}
}
