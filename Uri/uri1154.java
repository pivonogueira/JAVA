import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int soma = 0;
		int i = 0;
		double media = 0;
		
		while (n > 0) {
			soma += n;
			i++;
			n = sc.nextInt();
		}

		media = (double) soma / i;
		System.out.printf("%.2f%n", media);
		sc.close();

	}
}