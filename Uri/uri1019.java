import java.util.Locale;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int N, hora, minuto, mode;
    
    N = sc.nextInt();
    
    hora = N / 3600;
    mode = N % 3600;
    minuto = mode / 60;
    mode = mode % 60;
    
    System.out.println(hora + ":" + minuto + ":" + mode);
    
    
    sc.close();
    }
 
}  