import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] matrizA = new int[M][N];
		int[][] matrizB = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrizA[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrizB[i][j] = sc.nextInt();
			}
		}

		int[][] matrizC = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				int soma = 0;
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(matrizC[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
