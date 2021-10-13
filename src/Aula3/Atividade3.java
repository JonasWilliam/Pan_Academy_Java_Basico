package Aula3;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int l1, l2, l3;
		System.out.println("Informe o 1° lado: ");
		l1 = teclado.nextInt();
		System.out.println("Informe o 2° lado: ");
		l2 = teclado.nextInt();
		System.out.println("Informe o 3° lado: ");
		l3 = teclado.nextInt();
		if (l1 == l2 && l1 == l3) {
			System.out.println("Triangulo Equilátero. ");
		} else if (l1 == l2 || l2 == l3 || l1 == l3) {
			System.out.println("Triangulo Isóscele. ");
		} else if (l1 != l2 && l2 != l3 && l1 != l3) {
			System.out.println("Triangulo Escaleno. ");
		}
		teclado.close();
	}
}