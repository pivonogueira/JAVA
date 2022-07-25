import java.util.Locale;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double N = sc.nextDouble();


    if (N < 0 || N > 100.0) {
    	System.out.println("Fora de intervalo");

    } else {
    	if ( N <= 25.0) {
            System.out.println("Intervalo [0,25]");
    	} else {
    		if ( N <= 50.0 ){
    			System.out.println("Intervalo (25,50]");
    		} else {
    			if ( N <= 75.0 ){
    				System.out.println("Intervalo (50,75]");
    			} else {
    				System.out.println("Intervalo (75,100]");
    			}
    		}
    	}
    }
    sc.close();
    
    }
}