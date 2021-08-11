package test1;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.Collections;
import java.util.LinkedHashSet;

public class TesterStream {
	public static void main(String[] args) {
		
		List<Integer> li = new LinkedList<>();
		
		li.add(6);
		li.add(5);
		li.add(7);
		li.add(8);
		li.add(9);
		li.add(34);
		li.add(0);
		li.add(32);
		
		System.out.println("\nPrinting using forEach");
		li.stream().forEach(e -> System.out.println(e));
		
		System.out.println("\nPrinting using forEach and  member expression");
		li.stream().forEach(System.out::println);
		
		System.out.println("\nPrinting squares using map function");
		li.stream().map(e->e*e).forEach(System.out::println);
		
		System.out.println("\nSending squares to list");
		List<Integer> li2 = li.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(li2);
		
		System.out.println("\nSorting the stream");
		li.stream().sorted().forEach(System.out::println);
		
		System.out.println("\nSorting and storing in list");
		List<Integer> li3 = li.stream().sorted().collect(Collectors.toList());
		System.out.println(li3);
		
		System.out.println("\nPrinting uptill the 4th index");
		li.stream().limit(4).forEach(System.out::println);
		
		System.out.println("\nFiltering the values above 10");
		li.stream().filter(e->e>10).forEach(System.out::println);
		
		
		
	}	
}
