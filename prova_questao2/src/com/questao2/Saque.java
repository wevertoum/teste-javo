package com.questao2;

public class Saque {
    private String descricao;
    private double valor;
    private Integer dia;

    Saque (String descricao, double valor, Integer dia) {
        this.descricao = descricao;
        this.valor = valor;
        this.dia = dia;
    }

    public String toString () {
        return dia + " - "+ descricao + " - " + valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }
}
