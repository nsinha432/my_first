package test;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(sortSentence(s));
		
	}
	
	public static String sortSentence(String s) {
		
		String[] arr = s.split(" ");
		Arrays.sort(arr);
		
		Map<Integer,String> mp = new TreeMap<>();
		
		for(int i = 0; i<arr.length; i++) {
			
			if(mp.containsKey(arr[i].length())){
				String temp = mp.get(arr[i].length());
				temp = temp +" "+arr[i];
				mp.put(arr[i].length(), temp);
			}
			else mp.put(arr[i].length(), arr[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(Entry<Integer, String> es : mp.entrySet()) {
			sb.append(es.getValue()+" ");
		}
		
		return sb.toString();
	}
}
