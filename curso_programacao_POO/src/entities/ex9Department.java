/*
 * Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo
(próxima página).
 */
package entities;

public class ex9Department {

	private String name;
	
	//Construtores
	public ex9Department() {
	}
	public ex9Department(String name) {
		this.name = name;
	}
	
	//Get and Set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
