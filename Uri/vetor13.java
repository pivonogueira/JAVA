package application;

import java.util.Locale;
/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
Exemplo:
Quantos numeros voce vai digitar? 6
Digite um numero: 8.0
Digite um numero: 4.0
Digite um numero: 10.0
Digite um numero: 14.0
Digite um numero: 13.0
Digite um numero: 7.0
MAIOR VALOR = 14.0
POSICAO DO MAIOR VALOR = 3 
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		double[] vetA = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vetA[i] = sc.nextDouble();
		}

		double high = 0;
		int highPosition = 0;
		
		for (int i = 0; i < N; i++) {
			
			if(vetA[i] > high) {
				high = vetA[i];
				highPosition = i;
			}
			
		}
		
		
		System.out.println();
		System.out.println("MAIOR VALOR = " + high);
		System.out.println("POSICAO DO MAIOR VALOR = " + highPosition);
		
		
		sc.close();
	}
}
