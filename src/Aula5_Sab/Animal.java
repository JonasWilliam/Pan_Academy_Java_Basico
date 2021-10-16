package Aula5_Sab;

public class Animal implements Controlador {

	private String especie;

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public void comunicar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void movimentar() {
		// TODO Auto-generated method stub

	}

}
/*
 * Crie uma estrutura de herança para demonstrar o polimorfismo utilizando
 * classes de animais �? Crie o método comunicar() e movimentar() na classe
 * Animal �? Nas classes descendentes de animais, sobrescreva os métodos citados
 * de acordo com os tipos de animais
 */
