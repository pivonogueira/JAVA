import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vetA = new double[N];
		double media = 0;
		
		for (int i = 0; i < N; i++) {
			vetA[i] = sc.nextDouble();
			media += vetA[i];
		}
		
		
		media = media / N;
		System.out.printf("%.3f%n", media);
		for (int i = 0; i < N; i++) {
			if (vetA[i] < media) {
				System.out.printf("%.1f%n", vetA[i]);
			}
		}
		
		sc.close();
	}
}