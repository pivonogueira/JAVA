/*
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ex3Student;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ex3Student student = new ex3Student();
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.notaTotal());
		if (student.notaTotal() > 60.0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.pts());
		}
		

	}

}
