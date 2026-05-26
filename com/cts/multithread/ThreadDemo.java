package com.cts.multithread;

class ChildThread extends Thread{
	
	public void run() {
		System.out.println("Running child Thread....");
		
		for(int i = 1;i<=10;i++) {
			System.out.println("Child thread value: "+i);
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildThread t = new ChildThread();
		
		t.start();
		System.out.println("Running Main Thread....");
		
		for(int i = 100;i<=105;i++) {
			System.out.println("Main thread value: "+i);
		}
		
	}

}
