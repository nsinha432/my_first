package test1;

import java.util.HashSet;
import java.util.Set;

public class Streamtest {
	public static void main(String[] args) {
		
		Set<TesterBus> s = new HashSet<>();
		
		s.add(new TesterBus(102, "Abc Travels", 1000.34, 4.1f));
		s.add(new TesterBus(101, "Xyz Travels", 900.36, 3.1f));
		s.add(new TesterBus(100, "Abc Travels", 700.67, 3.8f));
		s.add(new TesterBus(105, "Bcd Travels", 1300.3, 4.0f));
		s.add(new TesterBus(103, "Xyz Travels", 835.61, 2.7f));
		s.add(new TesterBus(107, "Bcd Travels", 1100.89, 3.6f));
		
		System.out.println("\nBus with high rating");

		for(TesterBus b: s ) {
			if(b.getRating()>4) System.out.println(b);
		}
		
		System.out.println("\n Bus with high rating using stream");
		s.stream().filter(e->e.getRating()>=4).forEach(System.out::println);
		
		System.out.println("\nAverage cost");
		Double cost = s.stream().map(e-> e.getCost()).reduce(0.0, (a, b)-> a+b);
		
		System.out.println(cost/s.size());
		
		System.out.println("Average cost of Abc Travels");
		Double abcCost = s.stream().filter(e-> e.getProviderName() == "Abc Travels")
		.map(e->e.getCost())
		.reduce(0.0, (a, b)-> a+b);
		
		Long abcCount = s.stream().filter(e-> e.getProviderName() == "Abc Travels").count();
		
		System.out.println(abcCost/abcCount);
	}
}
