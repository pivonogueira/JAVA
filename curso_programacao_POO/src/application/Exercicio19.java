/*
 * Uma empresa deseja automatizar o processamento de seus contratos. O processamento deum contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base nonúmero de meses desejado.
A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxapor pagamento. Por enquanto,
o serviço contratado pela empresa é o do Paypal, que aplicajuros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato,e valor total do contrato). Em seguida, o programa deve ler o número de meses paraparcelamento do contrato,
e daí gerar os registros de parcelas a serem pagas (data e valor),sendo a primeira parcela a ser paga um mês após a data do contrato,
a segunda parcela doismeses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.
 */

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
