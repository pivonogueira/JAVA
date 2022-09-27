package entities;

public abstract class ex15TaxPayer {

	public String name;
	public Double anualIncome;
	
	//Contructor
	public ex15TaxPayer(){
		}
	
	public ex15TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	//G&S
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAnualIncome() {
		return anualIncome;
	}
	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	//Methods
	public abstract Double tax();
}
