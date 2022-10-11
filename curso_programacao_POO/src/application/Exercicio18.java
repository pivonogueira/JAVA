package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ex18Product;

public class Exercicio18 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file patch: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		String source = path.getParent();

		String targetFile = source + "\\out\\sumary.csv";
		List<ex18Product> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				list.add(new ex18Product(name, price, quantity));

				line = br.readLine();
			}
			boolean sucess = new File(source + "\\out").mkdir();
			System.out.println("Folder created: " + sucess);
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
				for (ex18Product product : list) {
					bw.write(product.getName() + "," + String.format("%.2f", product.total()));
					bw.newLine();
				}
				System.out.println("Folder write: Sucess");

			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
