/*
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
Exemplo 1:
Quantos elementos vai ter o vetor? 6
Digite um numero: 8
Digite um numero: 2
Digite um numero: 11
Digite um numero: 14
Digite um numero: 13
Digite um numero: 20
MEDIA DOS PARES = 11.0
Exemplo 2:
Quantos elementos vai ter o vetor? 3
Digite um numero: 7
Digite um numero: 9
Digite um numero: 11
NENHUM NUMERO PAR
*/
package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		int[] vetA = new int[N];

		double positive = 0;
		int quantity = 0;

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vetA[i] = sc.nextInt();

			if(vetA[i] % 2 == 0) {
				positive += vetA[i];
				quantity++;
			}
		}

		positive = (double) positive / quantity;
		if(quantity > 0) {
		System.out.printf("MEDIA DOS PARES = %.2f%n", positive);
		} else System.out.println("NENHUM NUMERO PAR");
		
		sc.close();
	}
}