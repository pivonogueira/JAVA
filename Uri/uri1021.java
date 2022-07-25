import java.util.Locale;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double N, mode;
    int mum, mcinquenta, mvinte, mdez, mcinco, ncem, ncinquenta, nvinte, ndez, ncinco, ndois, num;
    
    N = sc.nextDouble();
    
    ncem = (int) (N / 100.0);
    mode = N % 100.0;
    ncinquenta = (int) (mode / 50);
    mode = mode % 50.0;
    nvinte = (int) (mode / 20);
    mode = mode % 20.0;
    ndez = (int) (mode / 10);
    mode = mode % 10.0;
    ncinco = (int) (mode / 5);
    mode = mode % 5.0;
    ndois = (int) (mode / 2);  
    mode = mode % 2.0;
    num = (int) (mode / 1);
    mode = (mode % 1.0);
    mcinquenta = (int) (mode / 0.50);
    mode = mode % 0.50;
    mvinte = (int) (mode / 0.25);
    mode = mode % 0.25;
    mdez = (int) (mode / 0.10);
    mode = mode % 0.10;
    mcinco = (int) (mode / 0.05);
    mode = mode % 0.5;
    mum = (int) (mode / 0.01);
    
    
    
    System.out.println("NOTAS:");
    System.out.println( ncem + " nota(s) de R$ 100.00");
    System.out.println( ncinquenta + " nota(s) de R$ 50.00");
    System.out.println( nvinte + " nota(s) de R$ 20.00");
    System.out.println( ndez + " nota(s) de R$ 10.00");
    System.out.println( ncinco + " nota(s) de R$ 5.00");
    System.out.println( ndois + " nota(s) de R$ 2.00");  
    System.out.println("MOEDAS:");
    System.out.println( num + " moeda(s) de R$ 1.00");
    System.out.println( mcinquenta + " moeda(s) de R$ 0.50");
    System.out.println( mvinte + " moeda(s) de R$ 0.25");
    System.out.println( mdez + " moeda(s) de R$ 0.10");
    System.out.println( mcinco + " moeda(s) de R$ 0.05");
    System.out.println( mum + " moeda(s) de R$ 0.01");

    
    sc.close();
    }
 
}  