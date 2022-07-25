import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
    	
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int DIFERENCA = (A * B - C * D);
    System.out.println("DIFERENCA = " + DIFERENCA);
    
    sc.close();
    }
 
}