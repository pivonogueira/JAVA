package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> A = new HashSet<>();
		System.out.print("How many students for course A?");
		Integer n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int studentCode = sc.nextInt();
			A.add(studentCode);
		}
		
		Set<Integer> B = new HashSet<>();
		System.out.print("How many students for course B?");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int studentCode = sc.nextInt();
			B.add(studentCode);
		}
		
		Set<Integer> C = new HashSet<>();
		System.out.print("How many students for course C?");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int studentCode = sc.nextInt();
			C.add(studentCode);
		}
		
		Set<Integer> total = new HashSet<>(A);
		total.addAll(B);
		total.addAll(C);
		
		System.out.println("Total students: " + total.size());

		sc.close();
	}
}
