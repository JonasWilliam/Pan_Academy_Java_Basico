package Aula3;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int totalDosLados;
		totalDosLados = teclado.nextInt();
		if (totalDosLados < 3) {
			System.out.println("NÃO É UM POLÍGONO.");
		} else if (totalDosLados > 5) {
			System.out.println("POLÍGONO NÃO IDENTIFICADO");
		}
		teclado.close();
	}

}