package com.factory;

public class FabricaDocumento extends Fabrica {

    public Documento criaDocumento(int numero,
                                   String remetente,
                                   String tipo)
    {
        if (tipo.equals("C"))
            new Carta(numero, remetente);
        if (tipo.equals("T"))
            new Telegrama(numero, remetente);
        if (tipo.equals("N"))
            new Notificacao(numero, remetente);
        return null;
    }
}
