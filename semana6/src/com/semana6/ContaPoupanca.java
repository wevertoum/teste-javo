package com.semana6;

public class ContaPoupanca extends Conta {
    ContaPoupanca(int numero, Cliente dono) {
        super(numero, dono);
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - (valor + 0.05);
    }

    public void atualizaSaldo(int percent) {
        saldo = saldo + (saldo * percent / 100);
    }

    @Override
    public void transferir(double valor, Conta destino) {
        sacar(valor);
        destino.depositar(valor);
    }
}
