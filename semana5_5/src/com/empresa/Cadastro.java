package com.empresa;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        cadastro.createFuncionarios();
        cadastro.createGerentes();
        cadastro.createVendedores();
        cadastro.createEmpresa();
        cadastro.createEmpresaMostraDadosFuncionario();
    }

    public void createFuncionarios() {
        System.out.println("\n ----------- funcionarios ----------- \n");
        List<Funcionario> funcionarios = new ArrayList<>();

        Funcionario funcionario = new Funcionario("Juliano", "041.841.022-03",2000.00);
        funcionarios.add(funcionario);

        funcionario = new Funcionario("Marta", "041.821.022-03",3000.00);
        funcionarios.add(funcionario);

        funcionario = new Funcionario("Joelma", "041.841.822-03",5000.00);
        funcionarios.add(funcionario);

        funcionario = new Funcionario("Magdalena", "051.841.022-03",2000.00);
        funcionarios.add(funcionario);

        funcionario = new Funcionario("Juliete", "048.841.022-03",3500.00);
        funcionarios.add(funcionario);

        for (Funcionario func : funcionarios) {
            func.exibeDados();
            func.aumentaSalario(10);
            func.exibeDados();
        }
    }

    public void createGerentes() {
        System.out.println("\n ----------- gerentes ----------- \n");
        List<Gerente> gerentes = new ArrayList<>();

        Gerente gerente = new Gerente("Antonio reis", "049.841.022-23",5000.00);
        gerentes.add(gerente);

        gerente = new Gerente("Augusto castro", "061.841.025-03",5600.00);
        gerentes.add(gerente);

        for (Gerente geren : gerentes) {
            geren.exibeDados();
            geren.aumentaSalario(10);
            geren.exibeDados();
        }
    }

    public void createVendedores() {
        System.out.println("\n ----------- vendedores ----------- \n");
        List<Vendedor> vendedores = new ArrayList<>();


        List<SalarioVendedor> salariosVendedor = new ArrayList<>();
        SalarioVendedor salario = new SalarioVendedor(2500.00, 20);
        salariosVendedor.add(salario);

        salario = new SalarioVendedor(2600.00, 20);
        salariosVendedor.add(salario);

        salario = new SalarioVendedor(2800.00, 10);
        salariosVendedor.add(salario);

        salario = new SalarioVendedor(2900.00, 20);
        salariosVendedor.add(salario);

        salario = new SalarioVendedor(2100.00, 80);
        salariosVendedor.add(salario);

        salario = new SalarioVendedor(2800.00, 20);
        salariosVendedor.add(salario);

        salario = new SalarioVendedor(2000.00, 20);
        salariosVendedor.add(salario);

        salario = new SalarioVendedor(2000.00, 60);
        salariosVendedor.add(salario);

        salario = new SalarioVendedor(2000.00, 20);
        salariosVendedor.add(salario);

        salario = new SalarioVendedor(2070.00, 10);
        salariosVendedor.add(salario);

        salario = new SalarioVendedor(2020.00, 20);
        salariosVendedor.add(salario);

        salario = new SalarioVendedor(2720.00, 20);
        salariosVendedor.add(salario);

        Vendedor vendedor = new Vendedor("Antonio reis", "049.841.022-23", salariosVendedor);
        vendedores.add(vendedor);

        for (Vendedor vende : vendedores) {
            vende.exibeDados();
        }

    }

    public void createEmpresa() {
        System.out.println("\n ----------- empresa ----------- \n");
        Empresa empresa = new Empresa("Empresa patata", "0124.23123.0001/02");

        Funcionario funcionario = new Funcionario("Rodolfo abreu", "041.841.022-03",2000.00);
        empresa.adicionaFuncionario(funcionario);

        funcionario = new Funcionario("Roberto costa", "041.541.022-03",2000.00);
        empresa.adicionaFuncionario(funcionario);

        empresa.exibeFuncionarios();

    }

    public void createEmpresaMostraDadosFuncionario(){
        System.out.println("\n ----------- empresa c dados funcionario ----------- \n");
        Empresa empresa = new Empresa("Empresa patati", "0154.23123.0701/52");

        Funcionario funcionario = new Funcionario("Abel brito", "041.841.022-03",4000.00);
        empresa.adicionaFuncionario(funcionario);

        funcionario = new Funcionario("Adio Lindo", "041.541.022-03",6000.00);
        empresa.adicionaFuncionario(funcionario);

        empresa.exibeData(10);
    }
}
