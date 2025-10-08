package Polimorfismo;

public class Lobo extends Animal {

	public Lobo(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override // sobre escreve o metodo principal
	public void emitirSom() {
		System.out.println("o lobo está uivando");
	}

}
