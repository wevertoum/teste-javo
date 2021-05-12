package com.factory;

public class Notificacao extends Documento {
    public Notificacao(int numero, String remetente) {
        System.out.println("Essa notificacao foi enviada por: " + remetente + " | numero: " + numero);
    }
}
