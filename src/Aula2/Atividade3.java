package Aula2;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		int n1, senha = 1234;
		Scanner teclado = new Scanner(System.in);
		do {
		System.out.println("Informe a senha: ");
		n1 = teclado.nextInt();
		if(n1 == senha) {
			System.out.println("Acesso Permitido.");
		}else
			System.out.println("Acesso Negado.");
	}while(n1 != senha);
		teclado.close();
	}
	
}