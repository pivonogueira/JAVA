package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ex5Account;

public class Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ex5Account ex5Account;

		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		if (initialDeposit != 'n') {
			System.out.print("Enter initial deposit value: ");
			double value = sc.nextDouble();
			ex5Account = new ex5Account(accountNumber, name, value);
		} else {
			ex5Account = new ex5Account(accountNumber, name);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(ex5Account);
		System.out.println();
		System.out.print("Enter a deposit value:");
		double amount = sc.nextDouble();
		ex5Account.deposit(amount);
		System.out.println("Updated account data:");
		System.out.println(ex5Account);
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		ex5Account.withdraw(amount);
		System.out.println("Updated account data:");
		System.out.println(ex5Account);
		
		
		sc.close();
	}
}
