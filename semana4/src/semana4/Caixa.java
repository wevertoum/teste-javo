package semana4;

public class Caixa extends Funcionario {

	private Integer horario;

	Caixa(String nome, String telefone, String matricula, String salario, Integer horario) {
		super(nome, telefone, matricula, salario);
		this.horario = horario;
	}

	public Integer getHorario() {
		return horario;
	}

	public void setHorario(Integer horario) {
		this.horario = horario;
	}
}