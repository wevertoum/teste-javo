package com.empresa;

public class Funcionario {

	protected String nome;
	protected String cpf;
	protected double salario;

	Funcionario(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}

	Funcionario(String nome, String cpf, double salario){
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public double bonificacao(){
		return salario * 0.10;
	}

	public double exibeGanhoAnual() {
		return (salario + bonificacao()) * 12;
	}

	public void exibeDados() {
		System.out.println("Nome: " + this.nome + " CPF: "
				+ this.cpf + " Ganhos totais: " + exibeGanhoAnual());
	}

	public void aumentaSalario(Integer percent) {
		this.salario = (salario + bonificacao()) + (salario * percent / 100);
	}
}
