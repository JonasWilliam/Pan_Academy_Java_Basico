package Aula2;

public class CondicionaisTeste {
	
	public static void main(String[] args) {

		int idade = 15;
		int pessoas = 4;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos.");
		} else if (pessoas >= 3) {
			System.out.println("Você pode entrar, pois está acompanhada.");
		} else {
			System.out.println("Você não pode entrar, pois não está acompanhada.");
		}
		System.out.println("Você tem menos de 18 anos.");
	}

}