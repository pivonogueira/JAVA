package entities;

public class ex18Product {
	
	private String name;
	private Double price;
	private Integer quantity;
	
	//C
	public ex18Product(String name, Double price, Integer quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	//G&S
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


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	//Meth
	public Double total() {
		return price * quantity;
	}
		

}
