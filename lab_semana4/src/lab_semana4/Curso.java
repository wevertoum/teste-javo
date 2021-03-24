package lab_semana4;

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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
