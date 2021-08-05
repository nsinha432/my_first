package task1;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		
		System.out.println(maxWords(s));
		
		sc.close();
	}
	
	public static String maxWords(String s) {
		
		String ans = "";
		String[] arr = s.split(" ");
		int max = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].length() > max) max = arr[i].length();
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].length() == max) ans += arr[i] + " ";
		}
	
		return ans;
	}
}
