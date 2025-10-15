package Polimorfismo;

public class PrincipalProfissionalSaude {

	public static void main(String[] args) {

		ProfissionalSaude medico = new Medico("Ana Souza", "Cardiologia", 250, "CRM12345");
		ProfissionalSaude dentista = new Dentista("Carlos Lima", "Ortodontia", 180, "CRO67890");
		ProfissionalSaude fisio = new Fisioterapeuta("Beatriz Silva", "Reabilitação", 200, "CREFITO54321");

		medico.agendarConsulta();
		dentista.agendarConsulta();
		fisio.agendarConsulta();
	}
}
