package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ex17Account;
import exceptions.ex17DomainException;

public class Exercicio17 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double amount = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		ex17Account acc = new ex17Account(number, holder, amount, withdrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		amount = sc.nextDouble();

		try {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f%n", acc.getBalance());

		} catch (ex17DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		sc.close();
	}

}
