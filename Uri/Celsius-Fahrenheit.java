import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char cont;
		do {
			System.out.println("Digite a temperatura em Celsius:");
			double temp = sc.nextInt();
			double fahren = 9.0 * temp / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahren);
			System.out.println("Deseja repetir (s/n)? ");
			cont = sc.next().charAt(0);
		} while (cont != 'n');

		sc.close();
	}
}