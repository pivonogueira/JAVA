import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		
		
		if (x < y + z && y < x + z && z < x + y) {
			double perimetro = x + y + z;
			System.out.printf("Perimetro = %.1f%n", perimetro);
		} else {
			double area = (x + y) * z / 2;
			System.out.printf("Area = %.1f%n", area);
		}

		sc.close();
	}
}