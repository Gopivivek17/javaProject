package com.cts.java8features;

public class AnonymousInnerClassAndLambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* here new Runnable() is the object of the anonymous inner 
		 * class but not the object of the Runnable interface and also
		 * it is not possible to create object for the interface */
		
//		Runnable r = new Runnable() { // creating  Anonymous Inner Class with no class name
//			
//			public void run() {
//				for(int i=0; i<10; i++) {
//					System.out.println("Child Thread: "+i);
//				}
//			}
//		};
		
		// Implementing run method Using lambda expression
		Runnable r = () ->{
			for(int i=0; i<10; i++) {
				System.out.println("Child Thread: "+i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread: "+i);
		}

	}

}
