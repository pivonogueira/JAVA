import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int testes = sc.nextInt();
		int coelho = 0;
		int rato = 0;
		int sapo = 0;
		
		for (int i = 0; i < testes; i++) {
			int quantia = sc.nextInt();
			char tipo = sc.next().charAt(0);
						
			if (tipo == 'C') {
				coelho += quantia;
			} else if ( tipo == 'R'){
				rato += quantia;
			} else {
				sapo += quantia;
			}
		}
		
		sc.close();
		
		int total = coelho + sapo + rato;
		double porcentCoelho = (double) coelho / total * 100.0;
		double porcentRato = (double) rato / total * 100.0;
		double porcentSapo = (double) sapo / total * 100.0;
		
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelho);
		System.out.println("Total de ratos: " + rato);
		System.out.println("Total de sapos: " + sapo);
		System.out.printf("Percentual de coelhos: %.2f %%%n", porcentCoelho);
		System.out.printf("Percentual de ratos: %.2f %%%n", porcentRato);
		System.out.printf("Percentual de sapos: %.2f %%%n", porcentSapo);


	}
}