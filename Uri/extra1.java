/*
Programa embarcado na Joaninha
Quando a Joaninha é ligada, o programa captura da bateria um valor inteiro entre 0 e 100, correspondente à
porcentagem de carga disponível

A Joaninha só funciona com carga mínima maior que 5%

Antes de cada movimento, o programa obtém informações de dois sensores. O primeiro sensor informa B de bateu
ou L se a área livre a frente. O segundo sensor informa A se tem um Abisbmo, ou P se há Piso para avançar

Para controlar a joaninha, seu programa emites os comandos virar, em caso de necessidade, ou avançar, sempre que
possível. Quando não há bateria disponível para trabalhar, seu programa avisa que é hora de recarregar. Junto com
cada comando, seu sempre programa informa o quanto de bateria resta na Joaninha

Cada movimento de avançar consome 1% de bateria. Cada movimento de virar consome 5% de bateria

Entrada
Primeira linha: um valor inteiro entre 0 e 100
A seguir, um número indeterminado de pares de linhas com uma letra cada
- o priimeiro valor do par contém B ou L
- o segundo valor do par contém A ou P
*/


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




/*
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
*/
