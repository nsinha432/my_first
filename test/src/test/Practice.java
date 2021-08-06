package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(5);
		li.add(52);
		li.add(21);
		
		System.out.println(li);
		
		System.out.println(Collections.binarySearch(li, 5));
		
	}
}
