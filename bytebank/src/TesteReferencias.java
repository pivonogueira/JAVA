
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda: " + segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("s�o iguais");
		} else {
			System.out.println("s�o diferentes");
		}

	}
	
}
