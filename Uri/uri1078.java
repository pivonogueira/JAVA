import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int soma = i * n;
			System.out.println(i + " x " + n + " = " + soma);
		}
		
		
		sc.close();
	}
}