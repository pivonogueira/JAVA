package entities;

import enums.ex14Color;

public class ex14Circle extends ex14Shape {
	
	public Double radius;

	//Constructor
	public ex14Circle() {
		super();
	}
	
	public ex14Circle(ex14Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	//G&S
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	//Methods
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
	
}
