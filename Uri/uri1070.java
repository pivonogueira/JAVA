import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int impar = 0;
		while (impar < 6) {
			if ( n % 2 == 1) {
				System.out.println(n);
				impar++;
			}
		n++;
		}
		sc.close();
	}
}