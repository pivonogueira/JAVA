package entities;

public class ex10Product {

	private String name;
	private Double price;
	
	// Constructor
	public ex10Product() {
	}

	public ex10Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	// Get and Set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
