package com.app.pages;

abstract class Shape {
	protected int x;
	protected int y;


	// default constructor
	public Shape() {
		// initialize default values for fields
		x = 0;
		y = 0;
	}

	// abstract method to calculate area
	public abstract double getArea();

	// other methods
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void printPosition() {
		System.out.println("The Position: (" + x + ", " + y + ")");
	}
}

class Circle extends Shape {
	protected double radius;

	// constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	// implementation of getArea() for Circle
	public double getArea() {
		return Math.PI * radius * radius;
	}
}

class Square extends Shape {
	protected double side;

	// constructor
	public Square(double side) {
		this.side = side;
	}

	// implementation of getArea() for Square
	public double getArea() {
		return side * side;
	}
}

public class DefaultMain {
	public static void main(String args[]) {
		// create a Circle object
		Circle circle = new Circle(5);
		circle.setPosition(2, 3);

		// print the area and position of the Circle object
		System.out.println("Area of a circle is: " + circle.getArea());
		circle.printPosition();

		// create a Square object
		Square square = new Square(4);
		square.setPosition(5, 7);

		// print the area and position of the Square object
		System.out.println("Area of a square is: " + square.getArea());
		square.printPosition();
	}
}
