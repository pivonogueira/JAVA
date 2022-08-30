package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ex4CurrencyConverter;

public class Exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f%n", ex4CurrencyConverter.convertion(amount, price));
		
		sc.close();
	}

}
