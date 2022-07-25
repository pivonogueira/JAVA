import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    String vendedor = sc.next(); 
    double salario = sc.nextDouble();
    double venda = sc.nextDouble();
    double total = venda * 0.15 + salario;
    
    System.out.printf("TOTAL = R$ %.2f%n", total);
    
    sc.close();
    }
 
}  