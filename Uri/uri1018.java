import java.util.Locale;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int N, cem, cinquenta, vinte, dez, cinco, dois, mode;
    
    N = sc.nextInt();
    
    cem = N / 100;
    mode = N % 100;
    cinquenta = mode / 50;
    mode = mode % 50;
    vinte = mode / 20;
    mode = mode % 20;
    dez = mode / 10;
    mode = mode % 10;
    cinco = mode / 5;
    mode = mode % 5;
    dois = mode / 2;
    mode = mode % 2;
    
    System.out.println(N);
    System.out.println( cem + " nota(s) de R$ 100,00");
    System.out.println( cinquenta + " nota(s) de R$ 50,00");
    System.out.println( vinte + " nota(s) de R$ 20,00");
    System.out.println( dez + " nota(s) de R$ 10,00");
    System.out.println( cinco + " nota(s) de R$ 5,00");
    System.out.println( dois + " nota(s) de R$ 2,00");
    System.out.println( mode + " nota(s) de R$ 1,00");
    
    sc.close();
    }
 
}  