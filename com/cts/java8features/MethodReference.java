package com.cts.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Utility{
	
	public static void PrintSquare(int n) {
		System.out.println("Square of "+n+" is: "+n*n);
	}
}

class Messenger{
	public void display(String msg) {
		System.out.println("Message: "+msg);
	}
}


public class MethodReference {
	public static void main(String[] args) {
		
		// 1. Reference to a Static Method
        List<Integer> numbers = Arrays.asList(2,3,4,5,6);
        
        // Lambda: numbers.forEach(n -> Utility.printSquare(n));
        numbers.forEach(Utility::PrintSquare);
        
        // 2. Reference to an Instance Method of a Particular Object
        Messenger messenger = new Messenger();
        
        List<String> notes = Arrays.asList("Java", "Method", "Reference");
        
        // Lambda: notes.forEach(s -> messenger.display(s));
        notes.forEach(messenger::display);
        
        // 3. Reference to an Instance Method of an Arbitrary Object of a Type
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        
        
        // Lambda   List<String> k = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        // System.out.println(k);
        
        names.stream()
             .map(String::toUpperCase) // Calls toUpperCase() on each string
             .forEach(System.out::println); // Static-like ref to out object;
        
        
	}

}
