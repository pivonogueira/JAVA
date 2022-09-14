/*
 * Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
o instante do sistema: new Date()
 */

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ex10Client;
import entities.ex10Order;
import entities.ex10OrderItem;
import entities.ex10Product;
import enums.ex10OrderStatus;

public class Exercicio10 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		ex10Client client = new ex10Client(name, email, birthDate);

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		ex10OrderStatus status = ex10OrderStatus.valueOf(sc.next());

		ex10Order order = new ex10Order(new Date(), status, client);

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();

			ex10Product product = new ex10Product(productName, productPrice);

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			ex10OrderItem it = new ex10OrderItem(quantity, productPrice, product);

			order.addItem(it);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);

		sc.close();
	}

}
