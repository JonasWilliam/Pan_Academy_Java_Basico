package Aula2;

public class CondicionaisTeste {
	
	public static void main(String[] args) {

		int idade = 15;
		int pessoas = 4;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos.");
		} else if (pessoas >= 3) {
			System.out.println("Voc� pode entrar, pois est� acompanhada.");
		} else {
			System.out.println("Voc� n�o pode entrar, pois n�o est� acompanhada.");
		}
		System.out.println("Voc� tem menos de 18 anos.");
	}

}