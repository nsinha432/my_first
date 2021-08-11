package test1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ConcurrentModification {
	public static void main(String[] args) {
		
		List<Integer> li = new LinkedList<>();
		li.add(10);
		li.add(23);
		li.add(10);
		li.add(232);
		li.add(134);
		li.add(2);
		li.add(0);
		li.add(24);
		li.add(610);
		li.add(63);
		li.add(40);
		li.add(9);
		
		System.out.println(li);
		
		/*for(Integer i:li) {
			if(i == 232) {
				li.remove(i);
			}
		}*/
		
	//	System.out.println(li);
		
		
		
		Iterator i = li.listIterator();
		
		Integer k = 232;
		System.out.println(k);
		
		while(i.hasNext()) {
			if(i.next().equals(k)) {
				i.remove();
			}
		}
		System.out.println(li);
		
		
	}
}
