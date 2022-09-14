package entities;

public class ex10OrderItem {

	private Integer quantity;
	private Double price;

	private ex10Product product;

	// constructor
	public ex10OrderItem() {
	}

	public ex10OrderItem(Integer quantity, Double price, ex10Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	// get and set
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ex10Product getProduct() {
		return product;
	}

	public void setProduct(ex10Product product) {
		this.product = product;
	}

	// Method
	public Double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return getProduct().getName() + ", $" + getPrice() + ", Quantity: " + getQuantity() + ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}
