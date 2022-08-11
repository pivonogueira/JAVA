import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int golInter = 0;
		int golGremio = 0;
		int newGrenal = 1;
		int grenal = 0;
		int gremio = 0;
		int inter = 0;
		int empate = 0;
		
		while(newGrenal == 1) {
			golInter = sc.nextInt();
			golGremio = sc.nextInt();
				
				if (golInter > golGremio) {
					inter++;
				} else if (golGremio > golInter){
					gremio++;
				} else empate++;
			
			grenal = grenal + 1;		
			System.out.println("Novo grenal (1-sim 2-nao)");
			newGrenal = sc.nextInt();
		}
		
		System.out.println(grenal + " grenais");
		System.out.println("Inter:" + inter);
		System.out.println("Gremio:" + gremio);
		System.out.println("Empates:" + empate);
		if (inter > gremio) {
			System.out.println("Inter venceu mais");
		} else if(gremio > inter) {
			System.out.println("Gremio venceu mais");
			
		} else System.out.println("Nao houve vencedor");
		sc.close();
	}
}