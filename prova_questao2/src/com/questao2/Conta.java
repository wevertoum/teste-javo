package com.questao2;

import java.util.ArrayList;

public class Conta {
    private String nome;
    private double saldo;
    int mes;
    private ArrayList<Deposito> depositos = new ArrayList<>();
    private ArrayList<Saque> saques = new ArrayList<>();

    Conta (String nome, int mes, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.mes = mes;
    }

    void adicionaDeposito(String descricao,  double valor) {
        depositos.add(new Deposito(descricao, valor));
    }

    void adicionaDeposito(String descricao,  double valor, String cpf) {
        depositos.add(new DepositoIdentificado(descricao, valor, cpf));
    }

    void adicionaSaque(String descricao,  double valor, Integer dia) {
        saques.add(new Saque(descricao, valor, dia));
    }

    double totalSaldo() {
        double total = saldo;
        for (Deposito deposito : depositos) {
            total = total + deposito.getValor();
        }
        return total;
    }

    double saldoRestante(){
        double saldoRestante = saldo;
        for (Deposito deposito : depositos) {
            saldoRestante = saldoRestante + deposito.getValor();
        }
        for(Saque saque : saques){
            saldoRestante = saldoRestante - saque.getValor();
        }
        return saldoRestante;
    }

    public String toString() {
        StringBuilder dadosConta = new StringBuilder(nome + " - Mês : " + mes + "\n" + "Saldo : " + saldo + "\n");
        dadosConta.append("Depositos : \n");
        for (Deposito deposito : depositos) {
            dadosConta.append(deposito).append("\n");
        }
        dadosConta.append("Total DisponÌvel : ").append(totalSaldo()).append("\n");
        dadosConta.append("Saques : \n");
        for (Saque saque : saques) {
            dadosConta.append(saque).append("\n");
        }
        dadosConta.append("Saldo restante : ").append(saldoRestante()).append("\n");
        return dadosConta.toString();
    }
}
