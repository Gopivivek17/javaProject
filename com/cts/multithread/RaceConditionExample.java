package com.cts.multithread;


class MyRunnable implements Runnable{

	int count = 0;
	
	public synchronized/* use (synchronized) to avoid multiple threads accessing this method at the same time(race condition) */ void increment() {
		count++;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i<1000; i++) {
			increment();
		}
	}
	
}
public class RaceConditionExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyRunnable obj = new MyRunnable();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);

		t1.start();
		t2.start();


		t1.join();
		t2.join();
		
		System.out.println("total count = "+obj.count); // returns different count value each time we execute due to race condition
	}

}
