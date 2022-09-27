package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ex14Circle;
import entities.ex14Rectangle;
import entities.ex14Shape;
import enums.ex14Color;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Enter the number of shapes: ");
		int N = sc.nextInt();
		
		List<ex14Shape> list = new ArrayList<>();

		for (int i = 1; i <= N; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char shape = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			ex14Color color = ex14Color.valueOf(sc.next());
			if (shape == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new ex14Rectangle(color, width, height));
			} else if(shape == 'c') {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				list.add(new ex14Circle(color, radius));
			} else { 
				System.out.println("Nulo, reinicie o programa.");
			}
		}
		sc.close();
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for( ex14Shape total : list) {
			System.out.printf("%.2f%n", total.area());
		}
	}

}
