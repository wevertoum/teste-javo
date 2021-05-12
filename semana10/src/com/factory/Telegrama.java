package com.factory;

public class Telegrama extends Documento {
    public Telegrama(int numero, String remetente) {
        System.out.println("Essa telegrama foi enviada por: " + remetente + " | numero: " + numero);
    }
}
