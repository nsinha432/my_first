package my_package;
import java.util.Arrays;
import  java.util.Scanner;

public class Remove_duplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
 		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
 		
 		System.out.println(Arrays.toString(removeDuplicates(n, arr)));
 		
	}
	
	public static int[] removeDuplicates(int n, int[] arr) {
		int[] ans = new int[n];
		
		return ans;
	}
}
