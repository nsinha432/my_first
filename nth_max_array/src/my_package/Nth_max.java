package my_package;
import java.util.Arrays;
import java.util.Scanner;

public class Nth_max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(nth_max(n, count, arr));
	}
		
		public static int nth_max(int n, int count, int[] arr) {
	
			Arrays.sort(arr);

			int max = arr[n-1];
			if(count == 1) return max;
			count-=1;
			
			for (int k = n-2; k >= 0; k--) {
				if (arr[k] < max) {
					max = arr[k];
					count--;
					if(count == 0) break;
				}
				
			}
			return max;
		
		}
}
