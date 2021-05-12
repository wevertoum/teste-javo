package com.factory;

public class Telegrama extends Documento {
    public Telegrama(int numero, String remetente) {
        System.out.println("Esse telegrama foi enviada por: " + remetente + " | numero: " + numero);
    }
}
