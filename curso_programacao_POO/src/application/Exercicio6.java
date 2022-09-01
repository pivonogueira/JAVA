/*
 *  Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos.
*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ex6Product;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ex6Product[] vect = new ex6Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ex6Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}
}