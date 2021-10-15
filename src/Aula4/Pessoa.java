package Aula4;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		Pessoa p1 = new Pessoa("Jonas", 22);
		Pessoa p2 = new Pessoa("Fer", 22);
		pessoas.add(p1);
		pessoas.add(p2);
		for (Pessoa p : pessoas) {
			System.out.println(p.getNome());
			System.out.println(p.getIdade());
		}
	}

}
