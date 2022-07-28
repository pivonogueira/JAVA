import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String tipo1 = sc.next();
		String tipo2 = sc.next();
		String tipo3 = sc.next();

		if (tipo1.equals("vertebrado")) {
				if (tipo2.equals("ave")) {
					if (tipo3.equals("carnivoro")) {
						System.out.println("aguia");
					} else {
						System.out.println("pomba");
					}
				} else {
					if (tipo3.equals("onivoro"));{
						System.out.println("homem");
					} else {
						System.out.println("vaca");
					}
		} else (tipo2.equals("inseto")) {
				if (tipo3.equals("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} else {
				if (tipo3.equals("hematofago"));{
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}
			}
		
		sc.close();
	}
}