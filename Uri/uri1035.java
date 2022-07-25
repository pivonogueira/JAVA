import java.util.Locale;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    
    if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
    	System.out.println("Valores aceitos");
    } else {
    	System.out.println("Valores nao aceitos");
    }
    sc.close();
    
    }
}