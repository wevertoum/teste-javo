package com.singleton;

public class TesteNumeracao {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Numeracao numeracao = Numeracao.getInstancia();
            System.out.println(numeracao);
        }
    }
}
