package com.empresa;

import java.util.List;

public class Vendedor extends Funcionario {
    public List<SalarioVendedor> salarioVendedor;

    Vendedor(String nome, String cpf, List<SalarioVendedor> salarioVendedor ){
        super(nome, cpf);
        this.salarioVendedor = salarioVendedor;
    }

    public double exibeGanhoAnual(){
        double acum = 0;
        for(SalarioVendedor salario : salarioVendedor){
            acum = acum + (salario.totalVendasMes * salario.percentualComissao / 100);
        }
        return acum;
    }

    public void exibeDados() {
        System.out.println("Nome: " + this.nome + " CPF: "
                + this.cpf + " Ganhos totais: " + exibeGanhoAnual());
    }
}
