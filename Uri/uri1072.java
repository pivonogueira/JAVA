import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		for (int i = 0; i < n; i++) {
			int numero = sc.nextInt();
			if (numero >= 10 && numero <= 20) {
				in++;
			} else {
				out++;
			}		
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
}