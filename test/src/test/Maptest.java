package test;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maptest {
	public static void main(String args[]) {
		
		Map<Integer, String> ht = new Hashtable<>();
		ht.put(23232,"nikhil");
		//ht.put(null, "abc");
		//ht.put(2323, null);
		ht.put(3454, "vinay");
		ht.put(985, "Mohit");
		ht.put(2, "xhks");
		ht.put(890889, "a");
		
		System.out.println(ht);
		System.out.println(ht.size());
		System.out.println(ht.get(2));
		System.out.println(ht.remove(2));
		System.out.println(ht);
		ht.replace(985, "manjinder");
		System.out.println(ht);
		
		System.out.println(ht.containsKey(344));
		System.out.println(ht.containsValue("a"));
		System.out.println(ht.putIfAbsent(7, "lucky"));
		System.out.println(ht);
		System.out.println(ht.put(7, "lucky"));
		System.out.println(ht);
		
		System.out.println();
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		System.out.println(ht.entrySet());
		
		System.out.println();
		Set<Integer> s = ht.keySet();
		
		for(Integer i:s) {
			System.out.println("Key: " + i +" Value :"+ht.get(i)+", ");
		}
		
		System.out.println();
		
		for(Entry<Integer,String> es:ht.entrySet()) {
			System.out.println("Key :"+ es.getKey()+" value :"+es.getValue());
		}
	
		

		
	}
}
