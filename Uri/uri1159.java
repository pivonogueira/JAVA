import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		

		while (x != 0) {

			if (x % 2 != 0) {
				x += 1;
			}

			int soma = x + x + 2 + x + 4 + x + 6 + x + 8;
			System.out.println(soma);
			x = sc.nextInt();

		}

		sc.close();

	}
}