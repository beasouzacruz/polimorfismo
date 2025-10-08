package Polimorfismo;

public class PrincipalFuncionario {
	public static void main(String[] args) {
		Horista horista = new Horista(2, "batatinho", "(15)998555291", 12345, "rua dos bobos");
		System.out.println("salário de horista é: R$" + horista.calcularSalario(50, 40));
		Jornada jornada = new Jornada(2, "cenourinho", "(15)998555292", 12345, "rua dos bobos");
		System.out.println(jornada.calcularSalario(1000, 0));
		ConsultorPj consultorPj = new ConsultorPj(2, "alfacinho", "(15)998555293", 12345, "rua dos bobos");
		System.out.println(consultorPj.calcularSalario(12000, 1000));
	}
}
