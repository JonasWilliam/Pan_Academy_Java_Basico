package Aula3;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int totalDosLados;
		totalDosLados = teclado.nextInt();
		if (totalDosLados < 3) {
			System.out.println("N�O � UM POL�GONO.");
		} else if (totalDosLados > 5) {
			System.out.println("POL�GONO N�O IDENTIFICADO");
		}
		teclado.close();
	}

}