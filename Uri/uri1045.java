import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		double a, b, c;

		if (x > y && x > z) {
			a = x;
			if (y > z) {
				b = y;
				c = z;
			} else {
				b = z;
				c = y;
			}
		} else if (y > z) {
			a = y;
			if (x > z) {
				b = x;
				c = z;
			} else {
				b = z;
				c = x;
			}
			} else {
			a = z;
			if (x > y) {
				b = x;
				c = y;
			} else {
				b = y;
				c = x;
			}
			}
	

	if(a>=b+c) {
		System.out.println("NAO FORMA TRIANGULO");
	}else{
		if (a * a == b*b + c*c) {
			System.out.println("TRIANGULO RETANGULO");
		}else if(a*a > b*b + c*c) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}else {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		
		if(a == b && b == c) {
			System.out.println("TRIANGULO EQUILATERO");
		}else if (a == b || a == c || b == c){
			System.out.println("TRIANGULO ISOSCELES");
		}
		
		sc.close();
	}
}
}