package com.factory;

abstract class Fabrica {
    public abstract Documento criaDocumento(int numero,
                                            String remetente,
                                            String tipo);
}
