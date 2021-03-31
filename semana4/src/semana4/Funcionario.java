package semana4;

public class Funcionario extends Pessoa {

	private String matricula;
	private String salario;

	public Funcionario(String nome, String telefone, String matricula, String salario) {
		super(nome, telefone);
		this.matricula = matricula;
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
}
