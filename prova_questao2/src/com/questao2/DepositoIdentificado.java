package com.questao2;

public class DepositoIdentificado extends Deposito {
    private String cpf;

    DepositoIdentificado(String descricao, double valor, String cpf){
        super(descricao, valor);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
