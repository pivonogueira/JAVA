import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    double X = sc.nextDouble();
    double Y = sc.nextDouble();

    double valor = X / Y ;
   
    System.out.printf("%.3f km/l%n", valor);
    
    sc.close();
    }
 
}