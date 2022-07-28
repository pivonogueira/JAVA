import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		sc.close();

		double imposto,calcIR, calcIR1, calcIR2;
		
		
		
		if (salario <= 2000.0) {
			System.out.println("Isento");
		} else if (salario <= 3000.00) {
			calcIR = (salario - 2000.0) * 0.08;
			calcIR2 = 
			System.out.printf("R$ %.2f%n", imposto);
		} else if (salario <= 4500.0) {
			calcIR = (salario - 2000.0) * 0.08;
			calcIR1 = (salario - 3000.0) * 0.18;
			imposto = calcIR + calcIR1;
			System.out.printf("R$ %.2f%n", imposto);
		} else {
			calcIR = (salario - 2000.0) * 0.08;
			calcIR1 = (salario - 3000.0) * 0.18;
			calcIR2 = (salario - 4500.0) * 0.28;
			imposto = calcIR + calcIR1 + calcIR2;
			System.out.printf("R$ %.2f%n", imposto);
		}
		
	}
}