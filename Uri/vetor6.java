import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] nome = new String[N];
		int[] idade = new int[N];

		int velho = 0;
		int idadeMax = 0;

		for (int i = 0; i < N; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();

			if (idade[i] > idadeMax) {
				idadeMax = idade[i];
				velho = i;
			}
		}
		System.out.printf("Pessoa mais velha: " + nome[velho]);

		sc.close();
	}
}