package Aula5_Sab;

public class Ave extends Animal{

	@Override
	public void comunicar() {
		System.out.println("Comunica��o das Aves: Cantando.");
		
	}
	@Override
	public void movimentar() {
		System.out.println("Movimenta��o: Voando.");
		
	}
	
}
