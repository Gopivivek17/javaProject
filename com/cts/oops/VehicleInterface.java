package com.cts.oops;

public interface VehicleInterface {
	
	void start();
	
	default void fuelType() {
		System.out.println("diesel/petrol");
		
		serviceRemainder();
	}
	
	static void company() {
		System.out.println("Vehicle Interface");
	}
	
	private void serviceRemainder() {
		System.out.println("Service of after every 6 months");
	}

}

class car implements VehicleInterface{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("car started");
	}
	
}


