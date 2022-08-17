import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vetA = new int[N];
		int[] vetB = new int[N];
		
		for (int i = 0; i < N; i++) {
			vetA[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			vetB[i] = sc.nextInt();
		}
		
		int[] vetC = new int[N];
		for (int i = 0; i < N; i++) {
			vetC[i] = vetA[i] + vetB[i];
		}
		for (int s : vetC) {
		System.out.print(s + " ");
		}
		
		sc.close();
	}
}