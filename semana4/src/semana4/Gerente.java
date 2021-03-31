package semana4;

public class Gerente extends Funcionario {

	private Double bonificacao;
	private TipoPessoa tipo;
	private Integer percent;

	public Gerente(String nome, String telefone, String matricula, Double salario, Double bonificacao, TipoPessoa tipo,
			Integer percent) {
		super(nome, telefone, matricula, (salario + bonificacao), percent);
		this.bonificacao = bonificacao;
		this.tipo = tipo;
		this.percent = percent;
	}

	public void exibeDados() {
		System.out.println(" Nome: " + this.nome + "\n Telefone: " + this.telefone + "\n Matricula: " + this.matricula
				+ "\n Bonificacao: R$" + this.bonificacao + "\n Salario com " + this.percent + "%: R$" + this.salario
				+ "\n Ganho anual: R$" + this.exibeGanhoAnual() + "\n Tipo: " + this.tipo + "\n");
	}

	public Double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(Double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public TipoPessoa getTipo() {
		return tipo;
	}

	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}

	public Integer getPercent() {
		return percent;
	}

	public void setPercent(Integer percent) {
		this.percent = percent;
	}

}
