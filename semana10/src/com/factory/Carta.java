package com.factory;

public class Carta extends Documento {
    public Carta(int numero, String remetente) {
        System.out.println("Essa carta foi enviada por: " + remetente + " | numero: " + numero);
    }
}
