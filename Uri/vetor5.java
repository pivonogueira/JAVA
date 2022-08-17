import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vetA = new double[N];
		double media = 0;
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			vetA[i] = sc.nextDouble();
			
			if (vetA[i] % 2 == 0) {
				media += vetA[i];
				count++;
			}
		}
		
		media = (double) media / count;
		System.out.printf("%.1f%n", media);
		sc.close();
	}
}