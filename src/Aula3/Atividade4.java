package Aula3;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numMacas;
		double m1 = 0.30, m2 = 0.25;
		numMacas = teclado.nextInt();
		if (numMacas < 12) {
			System.out.println("Quantidade de Maças: " + numMacas * m1);
		} else
			System.out.println("Quantidade de Maças: " + numMacas * m2);
		teclado.close();
	}
}
