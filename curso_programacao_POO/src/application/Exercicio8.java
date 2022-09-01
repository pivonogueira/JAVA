package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ex8Employee;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		List<ex8Employee> list = new ArrayList<>();
		
		
		for(int i = 1; i <= N; i++) {
			System.out.println("Emplyoee #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new ex8Employee (id, name, salary));		
		}

		System.out.println("Enter the employee id that will have salary increase : ");
		int findId = sc.nextInt();
		ex8Employee emp = list.stream().filter(x -> x.getId() == findId).findFirst().orElse(null);
		if ( emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for( ex8Employee obj : list) {
			System.out.println(obj);
		}
		
		
		
		
		sc.close();
	}

}
