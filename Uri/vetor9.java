import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] nome = new String[N];
		double[] compra = new double[N];
		double[] venda = new double[N];
		int abaixo = 0;
		int acima = 0;
		int entre = 0;
		double totcompra = 0;
		double totvenda = 0;

		for (int i = 0; i < N; i++) {
			nome[i] = sc.next();
			compra[i] = sc.nextDouble();
			venda[i] = sc.nextDouble();

			totcompra += compra[i];
			totvenda += venda[i];

			if (venda[i] - compra[i] < compra[i] * 0.1) {
				abaixo++;
			} else if (venda[i] - compra[i] > compra[i] * 0.1 && venda[i] - compra[i] < compra[i] * 0.2) {
				acima++;
			} else
				entre++;

		}
		
		double lucro = totvenda - totcompra;
		
		System.out.println("Lucro abaixo de 10%: " + abaixo);
		System.out.println("Lucro entre 10% e 20%: " + entre);
		System.out.println("Lucro acima de 20%: " + acima);
		System.out.printf("Valor total de compra: %.2f%n", totcompra);
		System.out.printf("Valor total de venda: %.2f%n", totvenda);
		System.out.printf("Lucro total: %.2f%n", lucro);
		
		
		
		sc.close();
	}
}