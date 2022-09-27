package entities;

public class ex12Employee {
	
	public String name;
	public Integer hours;
	public Double valuePerHour;
	
	//Constructor
	public ex12Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	
	//Get and Set
	public ex12Employee() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	//Method
	public Double payment() {
		return hours * valuePerHour;
	}

}
