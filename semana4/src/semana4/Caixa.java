package semana4;

public class Caixa extends Funcionario {

	private final Integer horario;
	private final Integer percent;

	public Caixa(String nome, String telefone, String matricula, Double salario, Integer horario, Integer percent) {
		super(nome, telefone, matricula, salario, percent);
		this.horario = horario;
		this.percent = percent;
	}

	public void exibeDados() {
		System.out.println(" Nome: " + this.nome + "\n Telefone: " + this.telefone + "\n Matricula: " + this.matricula
				+ "\n Salario com " + this.percent + "%: R$" + this.salario + "\n Horário: " + this.horario + "hr" +"\n Ganho anual: R$"
				+ this.exibeGanhoAnual() + "\n");
	}
}
