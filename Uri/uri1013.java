import java.util.Locale;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int A, B, C, maior1, maior2;

    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    
    maior1 = (A + B + Math.abs(A - B)) / 2;
    maior2 = (maior1 + C + Math.abs(maior1 - C)) / 2; 
 

    System.out.println(maior2 + " eh o maior");

    sc.close();
    }
 
}  