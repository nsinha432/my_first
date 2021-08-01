package test;

import java.util.Scanner;

public class testing {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(isPalindrome(s));
		
	}
	
	public static String isPalindrome(String s) {
		
		String result = "";
		
		StringBuilder sb = new StringBuilder();					//munum
		
		sb.append(s.charAt(s.length()-1));
		sb.append(s);
		
		if(sb.toString().equals(sb.reverse().toString())) result += s.charAt(s.length()-1);
		else return "Z";
		
		return result;
	}
}
