import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[][] matrizA = new double[N][N];

		// Leitura das matrizes
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrizA[i][j] = sc.nextDouble();
			}
		}

		// Leitura linha e coluna escolhida
		int linha = sc.nextInt();
		int coluna = sc.nextInt();

		// soma dos positivos
		double soma = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matrizA[i][j] > 0) {
					soma = soma + matrizA[i][j];
				}
			}
		}
		System.out.printf("SOMA DOS POSITIVOS: %.2f%n", soma);

		// linha escolhida
		System.out.print("LINHA ESCOLHIDA : ");
		for (int i = 0; i < N; i++) {
			System.out.print(matrizA[linha][i] + " ");
		}
		System.out.println();

		// coluna escolhida
		System.out.print("LINHA ESCOLHIDA : ");
		for (int i = 0; i < N; i++) {
			System.out.print(matrizA[i][coluna] + " ");
		}
		System.out.println();

		// Diagonal principal
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < N; i++) {
			System.out.print(matrizA[i][i] + " ");
		}
		System.out.println();

		// Matriz alterada
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matrizA[i][j] < 0) {
					matrizA[i][j] = matrizA[i][j] * matrizA[i][j];
				}
			}
		}
		System.out.println("MATRIZ ALTERADA:");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		sc.close();
	}
}
