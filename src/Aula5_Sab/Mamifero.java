package Aula5_Sab;

public class Mamifero extends Animal{

	@Override
	public void comunicar() {
		System.out.println("Comunica��o dos mamiferos atrav�s do Som.");
		
	}
	@Override
	public void movimentar() {
		System.out.println("Movimenta��o dos mamiferos: Andando, Voando ou Nadando.");
		
	}
}
