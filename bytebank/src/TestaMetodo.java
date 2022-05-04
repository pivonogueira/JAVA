
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPedro = new Conta();
		contaDoPedro.saldo = 100;
		contaDoPedro.deposita(50);
		System.out.println(contaDoPedro.saldo);
		boolean conseguiuRetirar = contaDoPedro.saca(20);
		System.out.println(contaDoPedro.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta ();
		contaDaMarcela.deposita(1000);
		
		if (contaDaMarcela.transfere(300, contaDoPedro)) {
			System.out.println("Transferencia com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println("Seu saldo é " + contaDoPedro.saldo);
	}
}
