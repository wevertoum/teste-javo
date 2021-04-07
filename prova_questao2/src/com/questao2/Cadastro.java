package com.questao2;

import javax.swing.*;

public class Cadastro {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Cadastre os Saques/Depositos de uma Conta");

        String nome = JOptionPane.showInputDialog(null,"Entre com o nome da Conta : ");
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com o Mês : "));
        double saldo = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com o saldo de " + nome + " para o mês " + mes + " : "));

        Conta conta = new Conta(nome, mes, saldo);
        conta.adicionaDeposito("doação", 3000.00, "123456789");

        String resp = JOptionPane.showInputDialog(null,"Entrar com as Saques/Depositos de " + nome + " ? (S/N)");
        while (resp.equalsIgnoreCase("S")) {
            String tipo = JOptionPane.showInputDialog(null,"Saque ou Deposito ? (S/D)");
            String descricao = JOptionPane.showInputDialog(null,"descricao :");
            double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Valor : "));
            int dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com o dia : "));

            if (tipo.equalsIgnoreCase("D"))
                conta.adicionaDeposito(descricao, valor);

            if (tipo.equalsIgnoreCase("S"))
                conta.adicionaSaque(descricao, valor, dia);

            resp = JOptionPane.showInputDialog(null,"Adicionar novo Saque / Deposito da conta " + nome + " ? (S/N)");

        }
        JOptionPane.showMessageDialog(null,conta);

    }
}
