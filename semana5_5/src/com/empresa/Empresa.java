package com.empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    protected String nome;
    protected String cnpj;
    public List<Funcionario> funcionarios = new ArrayList<>();

    Empresa(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void adicionaFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void exibeFuncionarios() {

        for (Funcionario func : funcionarios) {
            System.out.println("Nome: " + func.nome + " CPF: "
                    + func.cpf + " Salario: " + func.salario);

        }

    }

    public void exibeData(Integer percent) {
        System.out.println("Empresa: " + nome + " | Cnpj: " + cnpj + "\n" + "Funcionarios:");
        for (Funcionario func : funcionarios) {
            System.out.println("Nome: " + func.nome + " | CPF: "
                    + func.cpf + " | Salario: " + func.salario + " | Ganhos anuais: " + func.exibeGanhoAnual());
            func.aumentaSalario(percent);
            System.out.println("Nome: " + func.nome + " | CPF: "
                    + func.cpf + " | Salario: " + func.salario + " | Ganhos anuais: " + func.exibeGanhoAnual());
        }

    }
}
