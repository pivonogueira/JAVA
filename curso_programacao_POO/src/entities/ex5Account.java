package entities;

public class ex5Account {

	private int accountNumber;
	private String name;
	private static double balance;

	public static double spent = 5.00;

	// Construtores
	public ex5Account(int accountNumber, String name, double value) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(value);
	}

	public ex5Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	// Getter and Setters
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	// Metodos

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + spent;
	}

	public String toString() {
		return "Account " + accountNumber + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
	}
}
