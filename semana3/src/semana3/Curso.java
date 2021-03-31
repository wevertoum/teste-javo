package semana3;

public class Curso {
	String nome;
	String sigla;
	Departamento departamento;

	Curso(String nome, String sigla, Departamento departamento) {
		this.nome = nome;
		this.sigla = sigla;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}

}
