package test;

import java.util.TreeMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;

public class New_test {
	public static void main(String[] args) {
		
		int X = 4;
		int N = 5;
		int[] arr =new int[N];
		arr[0] = -1;
		arr[1] = 323;
		arr[2] = -1;
		arr[3] = 8374;
		arr[4] = 1332;
		
		
		System.out.println(getMagicArray(X, N, arr));
		
	}
	
	public static List<Integer> getMagicArray(int X, int N, int[] arr) {
		List<Integer> ar2 = new ArrayList<>();
		
		for(int i =0; i<N; i++) {
			ar2.add(arr[i]);
		}
		
		System.out.println(ar2);
		
		for(int i = 0;i<N;i++) {
			if(ar2.get(i) == -1) {
				ar2.set(i, ((X+i+1)*(X+i+2)*(X+i+3))/3);
			}
		}
		
		return ar2;
	}
}
