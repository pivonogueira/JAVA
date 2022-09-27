package entities;

public class ex12OutsourcedEmployee extends ex12Employee{
	
	public Double additionalCharge;

	// Constructor
	public ex12OutsourcedEmployee () {
		super();
		
	}
	public ex12OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	//Get and Set
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	//Method~
	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1; 
	}
}
