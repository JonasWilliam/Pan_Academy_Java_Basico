package TarefinhasDeCasa14_10;

import java.util.Scanner;

public class EstruturasDeControleAtv2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int soma = 0, num;
		do {
			System.out.print("Informe um n�mero: (Maior ou igual a 0 / para parar digite um negativo: ");
			num = teclado.nextInt();
			if(num >= 0) {
				System.out.println("Soma atual: "+ (soma += num));
			}else
				System.out.print("Resultado Final: " + soma);
		}while(num >= 0);
		teclado.close();
	}

}
/*Criar um programa que, enquanto estiver recebendo n�meros positivos,
imprime no console a soma dos n�meros inseridos, caso receba um
n�mero negativo, encerre o programa. Tente utilizar a estrutura do while*/