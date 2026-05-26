package com.cts.oops;

public abstract class AbstractShape {

	double area;
	
	abstract void findArea();
	
	public void show() {
		System.out.println("Area is: "+area);
	}
	
}

class Circle extends AbstractShape{

	int r;
	@Override
	void findArea() {
		// TODO Auto-generated method stub
		r = 3;
		area = r*r;
		show();
	}
	
}

class Rectangle extends AbstractShape{
	
	int l,b;
	@Override
	void findArea() {
		// TODO Auto-generated method stub
		l = 8;
		b = 4;
		area = l*b;
		show();
	}
	
}
