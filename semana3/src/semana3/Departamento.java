package semana3;

public class Departamento {
	String nome;
	String sigla;

	Departamento(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}

}
