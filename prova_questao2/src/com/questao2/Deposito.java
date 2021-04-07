package com.questao2;

public class Deposito {
    private final String descricao;
    private final double valor;

    Deposito (String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String toString () {
        return descricao + " - " + valor;
    }

}
