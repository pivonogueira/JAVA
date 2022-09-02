/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
Exemplo:
Quantos numeros voce vai digitar? 4
Digite um numero: 8.0
Digite um numero: 4.0
Digite um numero: 10.0
Digite um numero: 14.0
VALORES = 8.0 4.0 10.0 14.0
SOMA = 36.00
MEDIA = 9.00 

 */

import java.util.Locale;
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
		
		System.out.print("VALORES: ");
		
		double sum = 0;
		for (int i = 0; i < N; i++) {
			sum += vetA[i];
			System.out.printf("%.1f ", vetA[i]);
		}
		
		double avg = sum / N;
		
		System.out.println();
		System.out.println(sum);
		System.out.println(avg);
		
				
		sc.close();
	}
}