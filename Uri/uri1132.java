import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		int soma = 0;
		
		int menor = X;
		int maior = Y;
		
		if (X > Y) {
			menor = Y;
			maior = X;
		}
		
		for(int i = menor; i <= maior; i++) {
			if( i % 13 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);		
	}
}