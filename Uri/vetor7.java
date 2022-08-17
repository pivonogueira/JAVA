import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] nome = new String[N];
		double[] nota1 = new double[N];
		double[] nota2 = new double[N];
		double[] media = new double[N];

		for ( int i = 0; i < N; i++) {
			nome[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
			media[i] = (nota1[i] + nota2[i]) / 2;
			}
		System.out.println("Alunos aprovados:");
		
		for( int i = 0; i< N; i++) {
			if(media[i] >= 6) {
				System.out.println(nome[i]);
			}
		}

		sc.close();
	}
}