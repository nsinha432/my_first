package middle_letter_upperCase;
import java.util.Scanner;

public class Upper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(toUpperCase(s));
		
	}
	
	public static StringBuilder toUpperCase(String s) {
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].length()%2 != 0) {
				sb.append(arr[i].substring(0, arr[i].length()/2)).append(Character.toUpperCase(arr[i].charAt(arr[i].length()/2))).append(arr[i].substring(arr[i].length()/2 +1)+" ");
			}
			else {
				sb.append(arr[i]+" ");
			}
		}
		
		
		return sb;
	}
}
