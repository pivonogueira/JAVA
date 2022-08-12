import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();	

		for (int i = 0; i < n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			int soma = 0;
			int contador = 0;

			for (int j = x; contador < y; j++) {
				if (j % 2 != 0) {
					soma += j;
					contador += 1;
				}
			}
			
			System.out.println(soma);
		}

		sc.close();

	}
}