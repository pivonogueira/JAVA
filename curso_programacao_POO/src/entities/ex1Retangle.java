/*
 * Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.
 */
package entities;

public class ex1Retangle {

	public double width;
	public double height;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimeter() {
		return 2 * (width + height);
	}
	
	public double Diagonal() {
		return Math.sqrt((width * width) + (height * height));
	}
	
	public String toString() {
		return "AREA = "
				+ String.format("%.2f", Area())
				+ "PERIMETER = "
				+ String.format("%.2f", Perimeter())
				+ "DIAGONAL = "
				+ String.format("%.2f", Diagonal());
	}
}
