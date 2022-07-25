import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int distancia = sc.nextInt();
    int minutos = 2 * distancia;
    System.out.println(minutos + " minutos");
    
    sc.close();
    }
 
}