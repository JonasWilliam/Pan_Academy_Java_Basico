package AtividadesDeCasa14_10;

import java.util.Scanner;

public class EstruturasDeControleAtv3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome: ");
		String nome = teclado.next();
		for (int i = 0; i <= nome.length() - 1; i++) {
			System.out.println(nome.charAt(i));
		}
		teclado.close();
	}
	
}
/*
Criar um programa que receba uma palavra e em seguida imprime no
console letra por letra.
*/