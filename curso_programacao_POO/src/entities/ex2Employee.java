/*
 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.
 */
package entities;
public class ex2Employee {
	
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		GrossSalary += GrossSalary * percentage / 100.00;
	}
	
	public String toString() {
		return Name + ", $ " + String.format("%.2f",NetSalary());
	}
	
	
	
}
