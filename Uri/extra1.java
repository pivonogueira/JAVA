import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int bateria = sc.nextInt();
		
		while (bateria > 5) {
			char sensor1 = sc.next().charAt(0);
			char sensor2 = sc.next().charAt(0);
					
			if (sensor1 == 'L' && sensor2 == 'P') {
				System.out.print("avançar: ");
				bateria -= 1;
				System.out.println(bateria);
			} else if (sensor1 == 'L' && sensor2 == 'A') {
				System.out.print("virar: ");
				bateria -= 5;
				System.out.println(bateria);
			} else if (sensor1 == 'B' && sensor2 == 'P') {
				System.out.print("virar: ");
				bateria -= 5;
				System.out.println(bateria);
			} else {
				System.out.print("virar: ");
				bateria -= 5;
				System.out.println(bateria);
			}
			
			
		} 
		
		if (bateria <= 5) {
			System.out.print("Recarregar: ");
		}
		
		System.out.println(bateria);
		sc.close();
	}
}