/*
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
Exemplo:
Quantos numeros voce vai digitar? 6
Digite um numero: 8
Digite um numero: -2
Digite um numero: 9
Digite um numero: 10
Digite um numero: -3
Digite um numero: -7
NUMEROS NEGATIVOS:
-2
-3
-7 
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
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for (int i = 0; i < N; i++) {
			if (vetA[i] < 0) {
				System.out.println(vetA[i]);
			}
		}
		
				
		sc.close();
	}
}
