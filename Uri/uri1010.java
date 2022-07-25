import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    int p1 = sc.nextInt();
    int n1 = sc.nextInt();
    double v1 = sc.nextDouble();
    int p2 = sc.nextInt();
    int n2 = sc.nextInt();
    double v2 = sc.nextDouble();
    double valor = (n1 * v1) + (n2 * v2);
   
    System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
    
    sc.close();
    }
 
}