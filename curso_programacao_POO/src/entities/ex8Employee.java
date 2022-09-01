package entities;

public class ex8Employee {

	private Integer id;
	private String name;
	private Double salary;

	// Constructor
	public ex8Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	// Method
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100;
	}
	
	//toString
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
}
	
	
	
	