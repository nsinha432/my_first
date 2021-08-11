package test1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TesterBusMain {
	
	public static void main(String[] args) {
		
		List<TesterBus> li =new ArrayList<>();
		
		li.add(new TesterBus(100, "abc travels", 1100.0, 3.4f));
		li.add(new TesterBus(102, "xyz travels", 1250.0, 2.4f));
		li.add(new TesterBus(101, "mno travels", 570.0, 2.7f));
		li.add(new TesterBus(105, "abc travels", 1500.0, 4.1f));
		li.add(new TesterBus(104, "rut travels", 600.0, 3.0f));
		li.add(new TesterBus(103, "xyz travels", 1100.0, 2.7f));
		
		List li2 = new ArrayList();
		
		li2.add(2121);
		li2.add(334);
		li2.add(2121);
		li2.add(334);
		li2.add(2121);
		li2.add(334);
		li2.add(2121);
		li2.add(334);
		li2.add("shabs");
		
		for(Object i:li2) {
			System.out.println(i);
		}

		printList(li);

		System.out.println();
		
		Collections.sort(li);
		
		System.out.println("\nSorting based on id");
		
		printList(li);


		
	/*	Collections.sort(li2);
		
		System.out.println("\n Sorting based on rating");
		
		for(Integer i:li2) {
			System.out.println(i);
		}
		*/
		
		
		printList(li);
		
		Collections.sort(li, new TesterBusNameComparator());
		
		System.out.println("\n Sorting based on provider name");
		
		printList(li);
		
		Collections.sort(li, new TesterBusCostComparator());
		
		System.out.println("\n Sorting based on cost");
		
		printList(li);
		
	}
	
	public static void printList(List<TesterBus> li) {
		for(TesterBus b : li) {
			System.out.println(b);
		}
	}
}
