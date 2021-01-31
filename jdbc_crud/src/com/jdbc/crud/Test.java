package com.jdbc.crud;

class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing circle");
	}
	
}
class Rectangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing rectangle");
	}
	
}
class Square implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing square");
	}
	
}
public class Test {
	
	public static void main(String[] args) {
		
		Shape shape = new Circle();
		shape.draw();
		/*print(shape);
	}
	private static void print(Shape shape) {
		shape.draw();*/
	}
}
