package Aula5_Sab;

public class Ave extends Animal{

	@Override
	public void comunicar() {
		System.out.println("Comunicação das Aves: Cantando.");
		
	}
	@Override
	public void movimentar() {
		System.out.println("Movimentação: Voando.");
		
	}
	
}
