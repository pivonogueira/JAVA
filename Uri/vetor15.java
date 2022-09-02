/*
 * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
Exemplo:
Quantos elementos vai ter o vetor? 4
Digite um numero: 10.0
Digite um numero: 15.5
Digite um numero: 13.2
Digite um numero: 9.8
MEDIA DO VETOR = 12.125
ELEMENTOS ABAIXO DA MEDIA:
10.0
9.8 
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
		double[] vetA = new double[N];

		double avg = 0;

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vetA[i] = sc.nextDouble();
			avg += vetA[i];
		}

		avg = avg / N;
		
		System.out.printf("MEDIA DO VETOR = %.3f%n", avg);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for (int i = 0; i < N; i++) {
			if (vetA[i] < avg) {
				System.out.println(vetA[i]);
			}
		}

		sc.close();
	}
}