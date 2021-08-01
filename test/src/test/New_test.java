package test;

import java.util.Arrays;

public class New_test {
	public static void main(String[] args) {
		
		String s = "hello";
		
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println(sb+" "+System.identityHashCode(sb));
		
		sb.reverse();
		sb.insert(0, 'a');
		
		System.out.println(sb+" "+System.identityHashCode(sb));
		
		
	
		
	}
}
