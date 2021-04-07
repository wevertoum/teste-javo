package com.questao2;

public class Saque {
    private final String descricao;
    private final double valor;
    private final Integer dia;

    Saque (String descricao, double valor, Integer dia) {
        this.descricao = descricao;
        this.valor = valor;
        this.dia = dia;
    }

    public String toString () {
        return dia + " - "+ descricao + " - " + valor;
    }

    public double getValor() {
        return valor;
    }
}
