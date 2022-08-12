import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int x = 0;
		for (int i = 0; i < N; i++) {

			x++;
			System.out.print(x + " ");
			x++;
			System.out.print(x + " ");
			x++;
			System.out.print(x + " ");
			x++;
			System.out.println("PUM");
	
			
		}
		
		sc.close();

	}
}