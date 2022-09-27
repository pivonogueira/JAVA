package entities;

public class ex13Product {

	public String name;
	public Double price;
	
	// Constructors
	public ex13Product() {
		
	}

	public ex13Product(String name, Double price) {
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
	
	//Methods
	public String priceTag() {
		return name + " $ " + String.format("%.2f", price);
	}

}
