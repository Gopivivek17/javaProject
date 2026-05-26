package com.cts.java8features;

import java.util.Arrays;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaUsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = Arrays.asList(10,4,78,43,2,8,4,0,1);
		
//		Comparator<Integer> c = (a,b) -> (a<b)?-1:(a>b)?1:0;
		
		Collections.sort(l,(a,b) -> (a<b)?-1:(a>b)?1:0);
		System.out.println(l);
		
		l.stream().forEach(System.out::println); // :: Method reference concept
		
		List<Integer> l1 = l.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(l1);
	}

}
