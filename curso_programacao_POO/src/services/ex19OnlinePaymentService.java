package services;

public interface ex19OnlinePaymentService {

	Double paymentFee(double amount);
	Double interest(double amount, int months);
}
