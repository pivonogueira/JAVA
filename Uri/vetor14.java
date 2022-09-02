/*
 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
Exemplo:
Quantos valores vai ter cada vetor? 6
Digite os valores do vetor A:
8
2
11
14
13
20
Digite os valores do vetor B:
5
10
3
1
10
7
VETOR RESULTANTE:
13
12
14
15
23
27 
*/
package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int N = sc.nextInt();
		int[] vetA = new int[N];
		int[] vetB = new int[N];
		int[] vetC = new int[N];

		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < N; i++) {
			vetA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < N; i++) {
			vetB[i] = sc.nextInt();
		}

		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < N; i++) {
			vetC[i] = vetA[i] + vetB[i];
			System.out.println(vetC[i]);
		}
		
		sc.close();
	}
}