package Polimorfismo;

public class Principal {

	public static void main(String[] args) {

		Lobo lobo = new Lobo("thor", "m", "qualquer");
		lobo.emitirSom();

		Leao leao = new Leao("thor", "m", "qualquer");
		leao.emitirSom();

		Tigre tigre = new Tigre("thor", "m", "qualquer");
		tigre.emitirSom();

		Cachorro cachorro = new Cachorro("thor", "m", "qualquer");
		cachorro.emitirSom();

		Gato gato = new Gato("thor", "m", "qualquer");
		gato.emitirSom();
	}
}
