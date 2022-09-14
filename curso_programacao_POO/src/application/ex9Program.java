package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ex9Department;
import entities.ex9HourContract;
import entities.ex9Worker;
import enums.ex9WorkerLevel;

public class ex9Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		ex9Worker worker = new ex9Worker(workerName, ex9WorkerLevel.valueOf(workerLevel), baseSalary, new ex9Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.println("Duration (hours): ");
			int hours = sc.nextInt();
			ex9HourContract contract = new ex9HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);	
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY):");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for "+ monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		sc.close();
	}

}
