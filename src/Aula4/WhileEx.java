package Aula4;

import java.util.Scanner;

public class WhileEx {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int qtdNotas = 0;
		double notas = 0.0, total = 0.0;
		while(notas != -1) {
			System.out.println("Digite a nota - Para parar digite -1");
			notas = teclado.nextInt();
			if(notas <= 10 || notas >= 0) {
				qtdNotas++;
				total += notas;
			}else
				System.out.println("Nota Invalida.");
		}
		System.out.println("Notas digitadas: " + qtdNotas);
		System.out.println("Média: " + total / qtdNotas);
		teclado.close();
	}
}
