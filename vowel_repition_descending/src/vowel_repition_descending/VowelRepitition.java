package vowel_repition_descending;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class VowelRepitition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(vowelRepititionDescending(s));
		
	}
	
	public static String vowelRepititionDescending(String s) {
		
		Map<Integer, String> mp = new TreeMap<>(Collections.reverseOrder());
		
		String[] arr = s.split(" ");
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i = 0; i<arr.length; i++) {
			int count = 0;
			for(int j =0; j<arr[i].length(); j++) {
				
				char comp = Character.toLowerCase(arr[i].charAt(j));
				
				if(comp == 'a' || comp == 'e' || comp == 'i' || comp == 'o' || comp == 'u') {
					count++;
				}
			}
			
			if(mp.containsKey(count)) {
				String temp = mp.get(count);
				temp = temp +" "+ arr[i];
				mp.put(count, temp);
			}
			else mp.put(count, arr[i]);
		}
		
		String s2 = "";
		for(Entry<Integer,String> es: mp.entrySet()) {
			s2 = s2 + es.getValue()+" ";
		}
		
		return s2;
	}
}
