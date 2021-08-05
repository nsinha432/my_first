package vowel_no_repitition;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class VowelNoRepitition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(vowelNoRepititionDescending(s));
	}
	public static String vowelNoRepititionDescending(String s) {
		
		 Map<Integer, String> mp = new TreeMap<>(Collections.reverseOrder());
		 
		 String[] arr = s.split(" ");
		 Arrays.sort(arr, Collections.reverseOrder());
		 
		 int n = arr.length;
		 for(int i = 0; i<n; i++) {
			 int counter = 0;
			 String temp ="";
			 
			 int length = arr[i].length();
			 for(int j =0; j<length; j++) {
				 
				 char comp = Character.toLowerCase(arr[i].charAt(j));
				 if(comp == 'a' || comp == 'e'|| comp == 'i'|| comp == 'o'|| comp =='u'){
					 
					 temp = temp + comp+"";
					 
				 }
			 }

			 counter = countRep(temp);
			
			 if(mp.containsKey(counter)) {
				 String s2 = mp.get(counter);
				 s2 = s2+" " + arr[i];
				 mp.put(counter, s2);
			 }
			 else mp.put(counter, arr[i]);
		 }
		 
		 //System.out.println(mp.entrySet());
		 String ans = "";
		 for(Entry<Integer, String> e: mp.entrySet()) {
			 ans = ans+" " + e.getValue();
		 }
		
		return ans.trim();
	}
	
	public static int countRep(String s) {
		int count = 0;
		int[] ar2 = new int[5];
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == 'a')  ar2[0] = 1;
			if(s.charAt(i) == 'e')  ar2[1] = 1;
			if(s.charAt(i) == 'i')  ar2[2] = 1;
			if(s.charAt(i) == 'o')  ar2[3] = 1;
			if(s.charAt(i) == 'u')  ar2[4] = 1;
			
		}
		
		for(int k = 0; k<ar2.length;k++) {
			if(ar2[k] == 1) count++;
		}
		
		return count;
	}
}
