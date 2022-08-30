/*
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.
 */

package entities;

public class ex3Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaTotal() {
		return nota1 + nota2 + nota3;
	}
	
	public double pts() {
		if (notaTotal() < 60){
			return 60.0 - notaTotal();
		} else return 0;
	}
	
	
	
	
}
