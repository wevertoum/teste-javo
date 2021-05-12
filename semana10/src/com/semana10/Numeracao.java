package com.semana10;

public class Numeracao {
    public static Numeracao instancia;
    private static int seq = 0;
    private final int numero;

    private Numeracao() {
        numero = ++seq;
    }

    public static Numeracao getInstancia() {
        if (instancia == null) {
            instancia = new Numeracao();
        }
        return instancia;
    }

    public String toString() {
        return "Numeração " + numero;
    }

}
