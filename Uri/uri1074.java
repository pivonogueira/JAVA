import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		for (int i=0; i < n; i++) {
			int x = sc.nextInt();
			if (x > 0 && x % 2 == 0) {
					System.out.println("EVEN POSITIVE");
			} else if(x > 0 && x % 2 != 0) {
				System.out.println("ODD POSITIVE");
			} else if(x < 0 && x % 2 == 0) {
				System.out.println("EVEN NEGATIVE");
			} else if(x < 0 && x % 2 != 0) {
				System.out.println("ODD NEGATIVE");
			} else {
				System.out.println("NULL");
			}
		}
		
		sc.close();
	}
}