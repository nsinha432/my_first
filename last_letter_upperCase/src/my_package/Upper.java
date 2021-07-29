package my_package;

import java.util.Scanner;

public class Upper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(toUpperCase(s));
		sc.close();
		
	}
	
	public static StringBuilder toUpperCase(String s) {
		
		String[] arr = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<arr.length; i++) {
			sb.append(arr[i].substring(0, arr[i].length()-1)).append(Character.toUpperCase(arr[i].charAt(arr[i].length()-1))).append(" ");
		}
		
		return sb;
	}
}
