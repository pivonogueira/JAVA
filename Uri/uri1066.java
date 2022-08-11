import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		int positivo = 0;
		int negativo = 0;
		int n;
		for(int i = 0; i < 5; i++) {
		n = sc.nextInt();
		if (n % 2 == 0 ){
			par++;
		} else {
			impar ++;		
		}
		if (n >= 0) {
			positivo++;
		} else {
			negativo++;
		}
		}

		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		
		sc.close();
	}
}