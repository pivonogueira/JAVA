import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int filas = sc.nextInt();
		int soldados = sc.nextInt();
		int[][] matriz = new int[filas][soldados];
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < soldados; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int girar = sc.nextInt();
		girar -= 1;
		
		int ultimo = matriz[girar][soldados - 1];
		
		for (int j = soldados - 1; j > 0; j--) {
			matriz[girar][j] = matriz[girar][j-1];
		}
		
		matriz[girar][0] = ultimo;
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < soldados; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
