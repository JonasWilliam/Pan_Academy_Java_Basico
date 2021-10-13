package Aula2;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		double n1, n2, media;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a Primeira Nota: ");
		n1 = teclado.nextDouble();
		System.out.println("Informe a Segunda Nota: ");
		n2 = teclado.nextDouble();
		media = (n1 + n2) / 2;
		
		if (media >= 7 && media < 10) {
			System.out.println("Aprovado, Média: " + media);
		} else if (media < 7) {
			System.out.println("Reprovado, Média: " + media);
		} else if (media == 10) {
			System.out.println("Aprovado com Distinção, Média: " + media);
		}
		teclado.close();
	}

}