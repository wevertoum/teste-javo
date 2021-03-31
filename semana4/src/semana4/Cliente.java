package semana4;

public class Cliente extends Pessoa {

	private Integer idade;
	private String cpf;
	private Status status;

	Cliente(String nome, String telefone, Integer idade, String cpf, Status status) {
		super(nome, telefone);
		this.idade = idade;
		this.cpf = cpf;
		this.status = status;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
