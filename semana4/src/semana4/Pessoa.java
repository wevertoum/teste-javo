package semana4;

public class Pessoa {
	protected String nome;
	protected String telefone;

	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

}