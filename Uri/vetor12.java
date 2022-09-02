/*
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
Exemplo:
Quantos numeros voce vai digitar? 6
Digite um numero: 8
Digite um numero: 2
Digite um numero: 11
Digite um numero: 14
Digite um numero: 13
Digite um numero: 20
NUMEROS PARES:
8 2 14 20
QUANTIDADE DE PARES = 4 
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		int[] vetA = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vetA[i] = sc.nextInt();
		}

		System.out.println("NUMEROS PARES:");
		int sum = 0;

		for (int i = 0; i < N; i++) {

			if (vetA[i] % 2 == 0) {
				sum++;
				System.out.print(vetA[i] + " ");
			}
		}

		System.out.println();
		System.out.println(sum);

		sc.close();
	}
}
