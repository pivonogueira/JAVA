import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double aumento;
		
		if (salario <= 400.00) {
			aumento = 15.0;
		} else if (salario <= 800.00) {
			aumento = 12.0;			
		} else if (salario <=1200.00) {
			aumento = 10.0;
		} else if (salario <= 2000.00) {
			aumento = 7.0;
		} else {
			aumento = 4.0;																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
		}
		
		double ajuste = salario * aumento / 100.0;
		double nsalario = ajuste + salario;
		
		System.out.printf("Novo salario: %.2f%n", nsalario);
		System.out.printf("Reajuste ganho: %.2f%n", ajuste);
		System.out.printf("Em percentual: %.0f %%%n", aumento);
	}
}