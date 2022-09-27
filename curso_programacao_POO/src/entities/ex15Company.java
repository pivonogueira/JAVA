package entities;

public class ex15Company extends ex15TaxPayer {

	public Integer numberOfEmployees;

	// Constructor
	public ex15Company() {
		super();
	}

	public ex15Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	// G&S
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	// Methods
	@Override
	public Double tax() {
		if(numberOfEmployees < 10) {
			return getAnualIncome() * 0.16;
		} else {
			return getAnualIncome() * 0.14;
		}
	}
}
