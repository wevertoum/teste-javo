package com.questao2;

public class DepositoIdentificado extends Deposito {
    private final String cpf;

    DepositoIdentificado(String descricao, double valor, String cpf){
        super(descricao, valor);
        this.cpf = cpf;
    }

}
