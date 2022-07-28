import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int Hinicio = sc.nextInt();
		int Minicio = sc.nextInt();
		int Hfinal = sc.nextInt();
		int Mfinal = sc.nextInt();

		int inicio = Hinicio * 60 + Minicio;
		int fim = Hfinal * 60 + Mfinal;
		
		int total;
		if (inicio < fim ) {
			total = fim - inicio;
		} else {
			total = (24* 60 - inicio) + fim;
		}
		
		int horas = total / 60;
		int minutos = total % 60;
		
		System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
		
		
		sc.close();
	}
}