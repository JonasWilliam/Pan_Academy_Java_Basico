package AtividadesDeCasa14_10;

import java.util.Random;
import java.util.Scanner;

public class EstruturasDeControleAtv1 {

	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner teclado = new Scanner(System.in);
		int resposta = 0, nSorteado, tentativas = 0;
		nSorteado = gerador.nextInt(101);

		do {
			System.out.println("Tente adivinhar o número entre 0 e 100");
			resposta = teclado.nextInt();
			tentativas++;
			if (resposta > nSorteado) {
				System.out.println("O número sorteado é menor.");
			} else if (resposta < nSorteado) {
				System.out.println("O número sorteado é maior.");
			}
		} while (nSorteado != resposta);
		System.out.println("Parabens: " + nSorteado + ", Tentativas: " + tentativas);
		teclado.close();
	}
}
/*
 * 1. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um
 * número aleatório em uma variável. O jogador tem 10 tentativas para adivinhar
 * o número gerado. Ao final de cada tentativa, imprima a quantidade de
 * tentativas restantes, e imprima se o número inserido é maior ou menor do que
 * o número armazenado.
 */
