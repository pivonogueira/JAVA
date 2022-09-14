/*
 * Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo
(próxima página).
 */

package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import enums.ex9WorkerLevel;

public class ex9Worker {

	private String name;
	private ex9WorkerLevel level;
	private Double baseSalary;

	private ex9Department department;

	private List<ex9HourContract> contracts = new ArrayList<>();

	//Constructor
	public ex9Worker() {
	}

	public ex9Worker(String name, ex9WorkerLevel level, Double baseSalary, ex9Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	//Get and Set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ex9WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(ex9WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public ex9Department getDepartment() {
		return department;
	}

	public void setDepartment(ex9Department department) {
		this.department = department;
	}

	public List<ex9HourContract> getContracts() {
		return contracts;
	}

	//Methods
	
	public void addContract(ex9HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(ex9HourContract contract) {
		contracts.remove(contract);
	}
	
	public Double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (ex9HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			
			if(year == c_year && month == c_month) {
			sum =+ c.totalValue();
			}
			}
		return sum;
	}
} 
