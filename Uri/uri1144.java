import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			int quadrado = i * i;
			int cubo = i * i * i;
			System.out.printf("%d %d %d%n", i, quadrado, cubo);
			
			int repete1 = quadrado + 1;
			int repete2 = cubo + 1;
			System.out.printf("%d %d %d%n", i, repete1, repete2);
			
		}
		
		sc.close();

	}
}