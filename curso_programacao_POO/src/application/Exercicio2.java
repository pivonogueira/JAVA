/*
 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.
 */


package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ex2Employee;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ex2Employee employed =  new ex2Employee();
		
		System.out.print("Name: ");
		employed.Name = sc.nextLine();
		System.out.print("Gross salary: ");
		employed.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employed.Tax = sc.nextDouble();
		
		System.out.println("Employee: " + employed);
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employed.IncreaseSalary(percentage);
		
		System.out.println("Updated data:" + employed);
		
		
		
		sc.close();
	}

}
