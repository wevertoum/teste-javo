package com.empresa;

public class Gerente extends Funcionario {

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	public double bonificacao(){
		return salario * 0.15;
	}

	public double exibeGanhoAnual() {
		return bonificacao() * 12;
	}

	public void exibeDados() {
		System.out.println("Nome: " + this.nome + " CPF: "
				+ this.cpf + " Ganhos totais: " + exibeGanhoAnual());
	}

}