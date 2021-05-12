package com.factory;

public class CadastroDocumentos {
    public static void main(String[] args) {
        FabricaDocumento factory = new FabricaDocumento();
        int numero = 1;
        String remetente = "Carlos";
        String tipo = "N";
        Documento documento = factory.criaDocumento(numero, remetente, tipo);
    }
}
