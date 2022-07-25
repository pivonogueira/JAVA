import java.util.Locale;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int N, ano, mes, mode;
    
    N = sc.nextInt();
    
    ano = N / 365;
    mode = N % 365;
    mes = mode / 30;
    mode = mode % 30;

    System.out.println(ano + " ano(s)");
    System.out.println(mes + " mes(es)");
    System.out.println(mode + " dia(s)");
    
    sc.close();
    }
 
}  