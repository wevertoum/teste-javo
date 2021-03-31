package semana4;

public class Cliente extends Pessoa {

	private Integer idade;
	private String cpf;
	private Status status;

	public Cliente(String nome, String telefone, Integer idade, String cpf, Status status) {
		super(nome, telefone);
		this.idade = idade;
		this.cpf = cpf;
		this.status = Status.ATIVO;
	}

	public void desativar() {
		if (this.status == Status.ATIVO) {
			this.status = Status.INATIVO;
		} else {
			System.out.println("Usuario" + this.getNome() + "já está inativo");
		}
	}

	public String toString() {
		return super.toString() + " Idade: " + this.idade + " CPF: " + this.cpf + " Status: " + this.status;
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
