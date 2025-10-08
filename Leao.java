package Polimorfismo;

public class Leao extends Animal {

	public Leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void emitirSom() {
		System.out.println("o leao está rugindo");
	}
}
