package entities;

import enums.ex14Color;

public abstract class ex14Shape {

	private ex14Color color;

	//constructor
	public ex14Shape() {
	}
	
	public ex14Shape(ex14Color color) {
		this.color = color;
	}

	//Get and Set
	public ex14Color getColor() {
		return color;
	}

	public void setColor(ex14Color color) {
		this.color = color;
	}
	
	//Methods
	public abstract double area();
	
	
}
