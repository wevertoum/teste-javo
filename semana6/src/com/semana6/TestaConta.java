package com.semana6;

import javax.swing.*;
import java.util.ArrayList;

public class TestaConta {

    public static void main(String[] args) {
        TestaConta testaConta = new TestaConta();
        testaConta.testContasCasting();
        testaConta.testContasDeclaracaoOriginal();
        testaConta.testContasTransfere();
        testaConta.testContasSalario();
        testaConta.showCadastroPanel();
    }


    public void testContasCasting() {
        Cliente cliente = new Cliente("Weverton", "(62) 99999-9999");

        Conta contaCorrente = new ContaCorrente(1, cliente);

        contaCorrente.depositar(200);
        contaCorrente.sacar(100);
        System.out.println("conta corrente >>> " + contaCorrente.toString());

        Conta contaPoupanca = new ContaPoupanca(2, cliente);

        contaPoupanca.depositar(200);
        contaPoupanca.sacar(100);
        System.out.println("conta poupanca antes de atualizar saldo >>> " + contaPoupanca.toString());
        ((ContaPoupanca) contaPoupanca).atualizaSaldo(10);
        System.out.println("conta poupanca depois de atualizar saldo >>> " + contaPoupanca.toString());
    }

    public void testContasDeclaracaoOriginal() {
        Cliente cliente = new Cliente("Joao marcos", "(62) 88888-8888");

        ContaCorrente contaCorrente = new ContaCorrente(1, cliente);
        contaCorrente.depositar(200);
        contaCorrente.sacar(100);
        System.out.println("conta corrente >>> " + contaCorrente.toString());

        ContaPoupanca contaPoupanca = new ContaPoupanca(2, cliente);

        contaPoupanca.depositar(200);
        contaPoupanca.sacar(100);
        System.out.println("conta poupanca antes de atualizar saldo >>> " + contaPoupanca.toString());
        contaPoupanca.atualizaSaldo(10);
        System.out.println("conta poupanca depois de atualizar saldo >>> " + contaPoupanca.toString());
    }

    public void testContasTransfere() {
        Cliente joana = new Cliente("Joana", "(62) 77777-7777");
        Cliente maria = new Cliente("Maria", "(62) 66666-6666");

        Conta contaCorrenteJoana = new ContaCorrente(1111, joana);
        contaCorrenteJoana.depositar(200);

        Conta contaPoupancaMaria = new ContaPoupanca(2222, maria);
        contaPoupancaMaria.depositar(200);

        contaCorrenteJoana.transferir(100.00, contaPoupancaMaria);
        System.out.println("conta corrente joana depois da receber de maria >>> " + contaPoupancaMaria.toString());
        System.out.println("conta corrente maria depois da enviar para joana >>> " + contaCorrenteJoana.toString());
    }

    public void testContasSalario() {
        Cliente mario = new Cliente("Mario", "(62) 33333-3333");
        Cliente julia = new Cliente("Julia", "(62) 22222-2222");

        Conta contaSalarioMario = new ContaSalario(3333, mario);
        contaSalarioMario.depositar(200);
        Conta contaSalarioJulia = new ContaSalario(4444, julia);
        contaSalarioJulia.depositar(200);

        contaSalarioMario.transferir(100.00, contaSalarioJulia);
        System.out.println("conta salario de julia depois de receber de mario >>> " + contaSalarioJulia.toString());
        System.out.println("conta salario de mario depois de enviar de julia >>> "+ contaSalarioMario.toString());

    }

    public void showCadastroPanel() {
        ArrayList<Conta> contas = new ArrayList<Conta>();
        JOptionPane.showMessageDialog(null,"Cadastro de contas");
        int tipo = Integer.parseInt(JOptionPane.showInputDialog(null,"1 - Corrente | 2 - Conta Salário | 3 - poupança"));
        while (tipo != 0) {
            String nome = JOptionPane.showInputDialog(null,"Nome do cliete:");
            String telefone = JOptionPane.showInputDialog(null,"Telefone do cliente:");
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero da conta:"));
            Cliente cliente = new Cliente(nome, telefone);

            switch (tipo) {
                case 1:
                    contas.add(new ContaCorrente(numero, cliente));
                    break;
                case 2:
                    contas.add(new ContaSalario(numero, cliente));
                    break;
                case 3:
                    contas.add(new ContaPoupanca(numero, cliente));
                    break;
            }

            tipo = Integer.parseInt(JOptionPane.showInputDialog(null,"1 - Corrente | 2 - Conta Salário | 3 - poupança"));
        }
        String outputStr = "";
        if(contas.size() > 0) {
            for (Conta conta : contas) {
                outputStr = outputStr + conta.toString() + "\n";
            }
        } else {
            outputStr = "nada por aq";
        }


        JOptionPane.showMessageDialog(null,outputStr);
    }
}
