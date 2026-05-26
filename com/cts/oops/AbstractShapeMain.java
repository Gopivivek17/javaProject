package com.cts.oops;

public class AbstractShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dynamic binding or run time polymorphism
		AbstractShape obj;
		
		obj = new Circle();
		
		obj.findArea();
		
		obj = new Rectangle();
		
		obj.findArea();
		
		// static binding or compile time polymorphism
		
	/*	Circle c = new Circle();
		
		c.findArea();
		
		Rectangle r = new Rectangle();
		
		r.findArea();
	*/
	}

}
