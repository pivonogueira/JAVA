import java.util.Locale;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) {
    	
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    int Func = sc.nextInt();
    int Htrab = sc.nextInt();
    double Hsal = sc.nextDouble();
    double SALARIO = Htrab * Hsal;
    System.out.println("NUMBER = " + Func);
    System.out.printf("SALARY = U$ %.2f%n", SALARIO);
    
    sc.close();
    }
 
}