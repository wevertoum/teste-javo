package com.semana6;

public class ContaSalario extends ContaCorrente{
    ContaSalario(int numero, Cliente dono) {
        super(numero, dono);
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - (valor + 0.01);
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + (valor - 0.01);
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }
}
