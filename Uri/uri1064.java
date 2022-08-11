import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		double smedia = 0;
		for(int i = 0; i < 6; i++) {
			double n = sc.nextDouble();
			if (n >=0 ){
				smedia = smedia + n;
				soma++;
			}
		}
		double media = smedia / soma;
		System.out.println(soma + " valores positivos");
		System.out.printf("%.1f%n", media);
		
		sc.close();
	}
}