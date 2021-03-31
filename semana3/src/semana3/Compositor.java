package semana3;

public class Compositor {
	String nome;
	String nacionalidade;

	Compositor(String nome, String nacionalidade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

	public String getNome() {
		return nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

}