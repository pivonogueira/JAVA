package entities;

public class ex13ImportedProduct extends ex13Product{
	
	public Double customsFee;

	//Constructor
	public ex13ImportedProduct(){
		super();	
	}
	
	public ex13ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	//Get and Set
	public Double getCustomsFee() {
		return customsFee;
	}
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return getPrice() + customsFee;		
	}
	
	//Methods
	@Override
	public String priceTag() {
		return getName() + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee : $ " + String.format("%.2f", customsFee) + ")"; 
	}
	


}
