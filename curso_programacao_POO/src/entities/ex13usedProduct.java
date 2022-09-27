package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex13usedProduct extends ex13Product{
	
	public Date manufactureDate;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	//Constructor
	public ex13usedProduct() {
		super();
	}

	public ex13usedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	//Get and Set
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	//Methods
	
	@Override
	public String priceTag() {
		return getName() + " (used) $ " + String.format("%.2f", getPrice()) + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
	}
	
	
	
}
