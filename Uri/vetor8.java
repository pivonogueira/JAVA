import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		char[] sexo = new char[N];
		double[] altura = new double[N];
		double alto = 0, baixo = 10;
		int contMan = 0;
		int contWom = 0; 
		double altWom = 0;	
		
		for (int i = 0; i < N; i++) {
			altura[i] = sc.nextDouble();
			sexo[i] = sc.next().charAt(0);
			
			if (altura [i] > alto) {
				alto = altura[i];
			}
			if (altura[i] < baixo) {
				baixo = altura[i];
			}
			if (sexo[i] != 'F') {
				contMan++;
			} else {
				altWom += altura[i];
				contWom++;
			}
		}
		double media = (double) altWom / contWom;
		
		System.out.printf("Menor altura = %.2f%n", baixo);
		System.out.printf("Maior altura = %.2f%n", alto);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.println("Numero de homens = " + contMan);
		sc.close();
	}
}