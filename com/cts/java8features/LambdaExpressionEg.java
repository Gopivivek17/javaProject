package com.cts.java8features;

import java.util.Arrays;
import java.util.List;

interface Sample{
	int display(int a, int b);
	
	default void show()
	{
		System.out.println("This is default method");
	}
	static void demo()
	{
		System.out.println("This is static method");
	}
	
}
public class LambdaExpressionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample add = (a,b) -> a+b;
		Sample multiply = (a,b) -> a*b;
		
		System.out.println(add.display(5, 8));
		System.out.println(multiply.display(5, 8));
		
		List<String> names = Arrays.asList("Gopi", "Vivek","ram","rajeswari","venkaiah","nirmala");
		
		names.stream()
		.filter(name -> name.startsWith("r"))
		.forEach(name -> System.out.println(name));
		
		

	}

}
