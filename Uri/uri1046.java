import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int inicio = sc.nextInt();
		int Hfinal = sc.nextInt();
		int tempo;
		
		if ( Hfinal > inicio) {		
		tempo = Hfinal - inicio;
		} else {
		tempo = 24 - inicio + Hfinal;
		}
		System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
		}
	}