package semana4;

public class Pessoa {
	protected String nome;
	protected String telefone;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}