package Aula2;

import java.io.IOException;
import java.util.Scanner;

public class Atividade1 {

		public static void main(String[] args) throws InterruptedException, IOException {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			int n1, n2, n3,maior = 0,menor =0;
			Scanner teclado = new Scanner(System.in);

			System.out.println("Informe o Primeiro Número: ");
			n1 = teclado.nextInt();
			System.out.println("Informe o Segundo Número: ");
			n2 = teclado.nextInt();
			System.out.println("Informe o Terceiro Número: ");
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
				System.out.println("Os três números são iguais.");
				maior = n1;
				menor = n1;
			}
				System.out.println("O menor Número: " + menor + ". O maior número: " + maior + ".");
				teclado.close();
				
		}
	}