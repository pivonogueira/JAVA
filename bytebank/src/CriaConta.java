
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
				System.out.println(primeiraConta.saldo);
				
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("primeira conta: " + primeiraConta.saldo);
		System.out.println("segunda conta: " + segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("s�o iguais");
		} else {
			System.out.println("s�o diferentes");
		}
		
	}
	
}
