package semana4;

public class Gerente extends Funcionario {

	private Double bonificacao;
	private TipoPessoa status;

	public Gerente(String nome, String telefone, String matricula, Double salario, Double bonificacao, TipoPessoa status) {
		super(nome, telefone, matricula, salario);
		this.status = status;
	}

	public Double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(Double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public TipoPessoa getStatus() {
		return status;
	}

	public void setStatus(TipoPessoa status) {
		this.status = status;
	}

}
