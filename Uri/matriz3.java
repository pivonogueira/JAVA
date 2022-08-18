import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] matriz = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			int maior = 0;
			for (int j = 0; j < N; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
			}
			System.out.println(maior);
		}
		sc.close();
	}
}