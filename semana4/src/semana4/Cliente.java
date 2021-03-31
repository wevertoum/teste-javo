package semana4;

public class Cliente extends Pessoa {

	private final Integer idade;
	private final String cpf;
	private Status status;

	public Cliente(String nome, String telefone, Integer idade, String cpf) {
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

	public void exibeDados() {
		System.out.println("Nome: " + this.nome + " Telefone: " + this.telefone + " Idade: " + this.idade + " CPF: "
				+ this.cpf + " Status: " + this.status);
	}

}
