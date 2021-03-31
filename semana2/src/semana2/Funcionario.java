package semana2;

public class Funcionario {

	String cpf;
	int matricula;
	String nome;
	String cargo;
	double salario;
	String departamento;
	Endereco Endereco;

	Funcionario(String nome, String cpf, int matricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
	}

	Funcionario(double salario) {
		this.salario = salario;
	}

	Funcionario() {
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
