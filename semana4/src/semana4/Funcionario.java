package semana4;

public class Funcionario extends Pessoa {

	protected String matricula;
	protected Double salario;
	private final Integer percent;

	public Funcionario(String nome, String telefone, String matricula, Double salario, Integer percent) {
		super(nome, telefone);
		this.matricula = matricula;
		this.salario = salario;
		this.percent = percent;
	}

	public void aumentaSalario() {
		this.salario = salario + (salario * percent / 100);
	}

	public double exibeGanhoAnual() {
		return this.salario * 12;

	}

}
