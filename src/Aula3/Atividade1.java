package Aula3;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int Angulo1, Angulo2, Angulo3;
		System.out.println("Informe o 1° angulo: ");
		Angulo1 = teclado.nextInt();
		System.out.println("Informe o 2° angulo: ");
		Angulo2 = teclado.nextInt();
		System.out.println("Informe o 3° angulo: ");
		Angulo3 = teclado.nextInt();
		if (Angulo1 == 90 || Angulo2 == 90 || Angulo3 == 90) {
			System.out.println("Triângulo Retângulo.");
		} else if (Angulo1 > 90 || Angulo2 > 90 || Angulo3 > 90) {
			System.out.println("Triângulo Obtusângulo.");
		} else if (Angulo1 < 90 || Angulo2 < 90 || Angulo3 < 90) {
			System.out.println("Triângulo Acutângulo.");
		}
		teclado.close();
	}

}