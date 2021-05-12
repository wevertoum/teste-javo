package com.factory;

public class CadastroDocumentos {
    public static void main(String[] args) {
        FabricaDocumento factory = new FabricaDocumento();
        int numero = 1;
        String remetente = "Carlos";
        // TIPO PODE SER:
        // C = carta
        // T = telegrama
        // N = notificacao
        String tipo = "T";
        Documento documento = factory.criaDocumento(numero, remetente, tipo);
    }
}
