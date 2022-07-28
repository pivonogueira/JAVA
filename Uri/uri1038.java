import java.util.Locale;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int pedido = sc.nextInt();
        int quantidade = sc.nextInt();
        double conta;
        
        if ( pedido == 1) {
        	conta = quantidade * 4.0;
        } else if (pedido == 2) {
        	conta = quantidade * 4.5;
        } else if (pedido == 3) {
        	conta = quantidade * 5.0;
        } else if (pedido == 4) {
        	conta = quantidade * 2.0;
        } else {
        	conta = quantidade * 1.5;
        }
    	
        System.out.printf("Total: R$ %.2f%n", conta);
    }
 
}