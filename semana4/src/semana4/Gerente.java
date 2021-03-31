package semana4;

public class Gerente extends Funcionario {

	private Double bonificacao;
	private Status status;

	Gerente(String nome, String telefone, String matricula, String salario, Double bonificacao, Status status) {
		super(nome, telefone, matricula, salario);
		this.status = status;
	}

	public Double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(Double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
