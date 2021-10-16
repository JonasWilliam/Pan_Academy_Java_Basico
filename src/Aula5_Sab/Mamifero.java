package Aula5_Sab;

public class Mamifero extends Animal{

	@Override
	public void comunicar() {
		System.out.println("Comunicação dos mamiferos através do Som.");
		
	}
	@Override
	public void movimentar() {
		System.out.println("Movimentação dos mamiferos: Andando, Voando ou Nadando.");
		
	}
}
