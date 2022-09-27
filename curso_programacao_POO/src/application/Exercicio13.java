package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ex13ImportedProduct;
import entities.ex13Product;
import entities.ex13usedProduct;

public class Exercicio13 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int N = sc.nextInt();

		List<ex13Product> list = new ArrayList<>();

		for (int i = 1; i <= N; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.next();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ex13ImportedProduct(name, price, customsFee));
			} else if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new ex13usedProduct(name, price, manufactureDate));
			} else {
				list.add(new ex13Product(name, price));
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (ex13Product product : list) {
			System.out.println(product.priceTag());
		}
		sc.close();
	}

}
