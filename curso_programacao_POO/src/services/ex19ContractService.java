package services;

import java.time.LocalDate;

import entities.ex19Contract;
import entities.ex19Installment;

public class ex19ContractService {

	private ex19OnlinePaymentService onlinePaymentService;

	public ex19ContractService(ex19OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(ex19Contract contract, int months) {

		double basicQuota = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			double amount = basicQuota + interest + fee;
			
			contract.getIntalmments().add(new ex19Installment(dueDate, amount));
		}
	}

}
