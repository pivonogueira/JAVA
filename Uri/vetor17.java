/* Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
Exemplo:
Quantas pessoas voce vai digitar? 5
Dados da 1a pessoa:
Nome: Joao
Idade: 16
Dados da 2a pessoa:
Nome: Maria
Idade: 21
Dados da 3a pessoa:
Nome: Teresa
Idade: 15
Dados da 4a pessoa:
Nome: Carlos
Idade: 23
Dados da 5a pessoa:
Nome: Paulo
Idade: 17
PESSOA MAIS VELHA: Carlos 
*/
package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int N = sc.nextInt();

		String[] name = new String[N];
		int[] age = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			name[i] = sc.next();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
		}

		int high = age[0];
		int highPosition = 0;

		for (int i = 1; i < N; i++) {
			if (age[i] > high) {
				high = age[i];
				highPosition = i;
			}
		}
		
		 System.out.printf("PESSOA MAIS VELHA: %s\n", name[highPosition]);


		sc.close();
	}
}