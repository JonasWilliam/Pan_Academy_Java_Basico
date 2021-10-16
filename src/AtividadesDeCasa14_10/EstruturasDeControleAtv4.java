package AtividadesDeCasa14_10;


import java.util.Scanner;

public class EstruturasDeControleAtv4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numAtual,maiorNum = 0;
		for(int i = 0; i < 10;i++) {
			numAtual = teclado.nextInt();
			if(numAtual >= maiorNum) {
				maiorNum = numAtual;
			}
		}
		System.out.println("Maior número: " + maiorNum);
		teclado.close();
	}

}

/*Crie um programa que recebe 10 valores e ao final imprima o maior
número*/