package entities;

import enums.ex14Color;

public class ex14Rectangle extends ex14Shape {

	public Double width;
	public Double height;
	
	
	public ex14Rectangle() {
		super();
	}
		
	//Construct
	public ex14Rectangle(ex14Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	//G&S
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	//Methods
	@Override
	public double area() {
		return width * height;
	}
}
