package semana4;

public class Funcionario extends Pessoa {

	protected String matricula;
	protected Double salario;
	private Integer percent;

	public Funcionario(String nome, String matricula) {
		super(nome);
		this.matricula = matricula;
	}

	public Funcionario(String nome, String telefone, String matricula, Double salario, Integer percent) {
		super(nome, telefone);
		this.matricula = matricula;
		this.salario = salario;
		this.percent = percent;
	}

	public double aumentaSalario() {
		return this.salario = salario + (salario * percent / 100);
	}

	public double exibeGanhoAnual() {
		return this.salario * 12;

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
