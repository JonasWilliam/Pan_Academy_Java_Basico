package Aula2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int anoNascimento, anoAtual, resultado;
		System.out.println("Informe o ano de nascimento: ");
		anoNascimento = teclado.nextInt();
		System.out.println("Informe o ano Atual: ");
		anoAtual = teclado.nextInt();
		resultado = anoAtual - anoNascimento;
		
		if((resultado >= 16)) {
			System.out.println("O Eleitor tem: "+ resultado +  " anos, pode votar.");
		}else
			System.out.println("O Eleitor é menor de 16 anos, não pode votar.");
		teclado.close();
	}
	
}