package entities;

public class ex4CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double convertion(double amount, double price ) {
		return amount * price * (1.0 + IOF);
	}
}
