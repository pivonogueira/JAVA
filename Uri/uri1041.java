import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double cordx = sc.nextDouble();
		double cordy = sc.nextDouble();

		if (cordx == 0.0 && cordy == 0.0) {
			System.out.println("Origem");
		} else if (cordx == 0.0) {
			System.out.println("Eixo Y");
		} else if (cordy == 0.0) {
			System.out.println("Eixo X");
		} else if (cordx > 0.0 && cordy > 0.0) {
			System.out.println("Q1");
		} else if (cordx < 0.0 && cordy > 0.0) {
			System.out.println("Q2");
		} else if (cordx < 0.0 && cordy < 0.0) {
			System.out.println("Q3");
		} else {
			System.out.println("Q4");
		}
		sc.close();
	}
}