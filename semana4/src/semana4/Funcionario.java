package semana4;

public class Funcionario extends Pessoa {

	private String matricula;
	private Double salario;

	public Funcionario(String nome, String matricula) {
		super(nome);
		this.matricula = matricula;
	}

	public Funcionario(String nome, String telefone, String matricula, Double salario) {
		super(nome, telefone);
		this.matricula = matricula;
		this.salario = salario;
	}

	public double aumentaSalario(double salario, int percent) {
		double newSalario;
		newSalario = salario + (salario * percent / 100);
		return newSalario;
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
