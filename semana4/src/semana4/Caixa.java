package semana4;

public class Caixa extends Funcionario {

	private Integer horario;
	private Integer percent;

	public Caixa(String nome, String telefone, String matricula, Double salario, Integer horario, Integer percent) {
		super(nome, telefone, matricula, salario, percent);
		this.horario = horario;
		this.percent = percent;
	}

	public void exibeDados() {
		System.out.println(" Nome: " + this.nome + "\n Telefone: " + this.telefone + "\n Matricula: " + this.matricula
				+ "\n Salario com " + this.percent + "%: R$" + this.salario + "\n Ganho anual: R$"
				+ this.exibeGanhoAnual() + "\n");
	}

	public Integer getHorario() {
		return horario;
	}

	public void setHorario(Integer horario) {
		this.horario = horario;
	}

	public Integer getPercent() {
		return percent;
	}

	public void setPercent(Integer percent) {
		this.percent = percent;
	}
}
