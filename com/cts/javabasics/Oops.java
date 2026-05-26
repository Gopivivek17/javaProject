package com.cts.javabasics;

abstract class Animal{
	
	abstract void makeSound();
	
	void sleep() {
		System.out.println("sleeping");
	}
}

class Dog extends Animal{
	
	private String breed;
	
	public Dog(String breed){
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
	void makeSound() {  //@Override
		System.out.println("barking!");
	}
	
}

class Cat extends Animal{
	
	@Override
	void makeSound() { //@Override
		System.out.println("meow!");
	}
	
}


public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog("Husky");
		
		System.out.println("Dog breed : "+dog.getBreed());
		
		Animal newdog = new Dog("lab");
		
		newdog.makeSound();
		
		Animal cat = new Cat();
		
		cat.makeSound();

	}

}
