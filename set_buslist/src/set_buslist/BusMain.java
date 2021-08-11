package set_buslist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BusMain {
	public static void main(String[] args) {
		
		Set<Bus> s= new LinkedHashSet<>();
		
		
		s.add(new Bus(109, 783.45, "Ramesh Travels", 4.4f));	//28388282
		s.add(new Bus(105, 1000.32, "Sujata Travels", 4.1f));	//388382
		s.add(new Bus(102, 988.31, "Sunil Travels", 3.5f));
		s.add(new Bus(103, 1340.36, "Shoureya Travels", 3.8f));
		s.add(new Bus(100, 1902.93, "Mahesh Travels", 2.9f));
		
		s.add(new Bus(101, 1000.32, "akshay travels", 3.5f));	//387374445
		s.add(new Bus(101, 30.32, "nikhil travels", 3.5f));
		s.add(new Bus(101, 30.32, "nikhil travels", 3.5f));
		s.add(new Bus(101, 1000.32, "Shruti Travels", 3.5f));
		printList(s);
		
		
		
		/*List<Bus> li = new LinkedList<>(s);
		
		
		Collections.sort(li, new BusComparator());
		
		//Collections.sort(s);
		
		System.out.println();
		
		printList(li);
		
		Collections.sort(li, (Bus b1, Bus b2)->{
			
			return b1.getProviderName().compareTo(b2.getProviderName());
			
		});
		
		System.out.println("\n Printing using lambda expression based on provider name");
		
		printList(li);
		*/
		
		/*Set<Integer> s1 = new LinkedHashSet<>();
		s1.add(10);
		s1.add(8);
		s1.add(10);
		s1.add(8);
		s1.add(10);
		s1.add(8);
		s1.add(10);
		s1.add(8);
		
		for(Integer i: s1) {
			System.out.println(i);
		}
		
		*/
		
		List<Object> li3 = new ArrayList<>();
		li3.add("abc");
		li3.add(12);
		li3.add('a');
		
		for(Object i : li3) {
			System.out.println(i);
		}
		
		
	}
	
	public static void printList(List<Bus> li) {
		for(Bus b:li) {
			System.out.println(b);
		}
	}
	
	public static void printList(Set<Bus> s) {
		for(Bus b: s) {
			System.out.println(b);
		}
	}
}
