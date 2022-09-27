package entities;

public class ex15Individual extends ex15TaxPayer {

	public Double healthExpenditures;

	// Constructor
	public ex15Individual() {
		super();
	}

	public ex15Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	// G&S
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	// Methods
	@Override
	public Double tax() {
		if (getAnualIncome() < 20000.0) {
			return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
 		} else {
 			return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
 		}
	}

}
