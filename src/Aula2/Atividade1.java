package Aula2;

import java.io.IOException;
import java.util.Scanner;

public class Atividade1 {

		public static void main(String[] args) throws InterruptedException, IOException {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			int n1, n2, n3,maior = 0,menor =0;
			Scanner teclado = new Scanner(System.in);

			System.out.println("Informe o Primeiro N�mero: ");
			n1 = teclado.nextInt();
			System.out.println("Informe o Segundo N�mero: ");
			n2 = teclado.nextInt();
			System.out.println("Informe o Terceiro N�mero: ");
			n3 = teclado.nextInt();

			if (n1 > n2 && n1 > n3) {
				maior = n1;
				if (n2 > n3) {
					menor = n3;
				} else {
					menor = n2;
				}

			} else if (n2 > n1 && n2 > n3) {
				maior = n2;
				if (n1 > n3) {
					menor = n3;
				} else {
					menor = n1;
				}
			} else if (n3 > n2 && n3 > n1) {
				maior = n3;
				if (n2 > n1) {
					menor = n1;
				} else
					menor = n2;
			}
			if(n1 == n2 && n1 == n3) {
				System.out.println("Os tr�s n�meros s�o iguais.");
				maior = n1;
				menor = n1;
			}
				System.out.println("O menor N�mero: " + menor + ". O maior n�mero: " + maior + ".");
				teclado.close();
				
		}
	}