/*
 * Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ex1Retangle;

public class Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ex1Retangle retang = new ex1Retangle();

		System.out.println("Enter rectangle width and height:");
		retang.width = sc.nextDouble();
		retang.height = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", retang.Area());
		System.out.printf("PERIMETER = %.2f%n", retang.Perimeter());
		System.out.printf("DIAGONAL = %.2f%n", retang.Diagonal());

		sc.close();
	}

}
