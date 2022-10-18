package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.ex19Contract;
import entities.ex19Installment;
import services.ex19ContractService;
import services.ex19PaypalService;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		Integer number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();
		
		ex19Contract obj = new ex19Contract(number, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int N = sc.nextInt();
		
		sc.close();
		
		ex19ContractService contractService = new ex19ContractService(new ex19PaypalService());
		
		contractService.processContract(obj, N); 
		
		System.out.println("Parcelas:");
		
		for( ex19Installment installment : obj.getIntalmments()) {
			System.out.println(installment);
		}
		
		
	}

}
