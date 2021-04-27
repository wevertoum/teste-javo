package com.semana6;

public class ContaCorrente extends Conta {

    ContaCorrente(int numero, Cliente dono) {
        super(numero, dono);
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - (valor + 0.05);
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta destino) {
        sacar(valor);
        destino.depositar(valor);
    }
}
