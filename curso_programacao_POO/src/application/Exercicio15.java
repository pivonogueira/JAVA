package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ex15Company;
import entities.ex15Individual;
import entities.ex15TaxPayer;

public class Exercicio15 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<ex15TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char c = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.next();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if (c == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new ex15Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new ex15Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		sc.close();
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0;
		for(ex15TaxPayer lista : list) {
			double taxa = lista.tax();
			System.out.println(lista.getName() + ": $ " + String.format("%.2f", taxa));
			sum += lista.tax();		
			}
		System.out.println();
		System.out.printf("TOTAL TAKES: $ %.2f", sum);

	}

}
