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
			System.out.println("Tente adivinhar o n�mero entre 0 e 100");
			resposta = teclado.nextInt();
			tentativas++;
			if (resposta > nSorteado) {
				System.out.println("O n�mero sorteado � menor.");
			} else if (resposta < nSorteado) {
				System.out.println("O n�mero sorteado � maior.");
			}
		} while (nSorteado != resposta);
		System.out.println("Parabens: " + nSorteado + ", Tentativas: " + tentativas);
		teclado.close();
	}
}
/*
 * 1. Jogo da adivinha��o: Tentar adivinhar um n�mero entre 0 - 100. Armazene um
 * n�mero aleat�rio em uma vari�vel. O jogador tem 10 tentativas para adivinhar
 * o n�mero gerado. Ao final de cada tentativa, imprima a quantidade de
 * tentativas restantes, e imprima se o n�mero inserido � maior ou menor do que
 * o n�mero armazenado.
 */
