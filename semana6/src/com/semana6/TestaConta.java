package com.semana6;

public class TestaConta {

    public static void main(String[] args) {
        TestaConta testaConta = new TestaConta();
//      testaConta.testContasCasting();
//      testaConta.testContasDeclaracaoOriginal();
        testaConta.testContasTransfere();
    }


    public void testContasCasting() {
        Cliente cliente = new Cliente("Weverton", "(62) 99999-9999");

        Conta contaCorrente = new ContaCorrente(1, cliente);

        contaCorrente.depositar(200);
        contaCorrente.sacar(100);
        System.out.println("conta corrente >>> " + contaCorrente.toString());

        Conta contaPoupanca = new ContaPoupanca(2, cliente);

        contaPoupanca.depositar(200);
        contaPoupanca.sacar(100);
        System.out.println("conta poupanca antes de atualizar saldo >>> " + contaPoupanca.toString());
        ((ContaPoupanca) contaPoupanca).atualizaSaldo(10);
        System.out.println("conta poupanca depois de atualizar saldo >>> " + contaPoupanca.toString());
    }

    public void testContasDeclaracaoOriginal() {
        Cliente cliente = new Cliente("Joao marcos", "(62) 88888-8888");

        ContaCorrente contaCorrente = new ContaCorrente(1, cliente);
        contaCorrente.depositar(200);
        contaCorrente.sacar(100);
        System.out.println("conta corrente >>> " + contaCorrente.toString());

        ContaPoupanca contaPoupanca = new ContaPoupanca(2, cliente);

        contaPoupanca.depositar(200);
        contaPoupanca.sacar(100);
        System.out.println("conta poupanca antes de atualizar saldo >>> " + contaPoupanca.toString());
        contaPoupanca.atualizaSaldo(10);
        System.out.println("conta poupanca depois de atualizar saldo >>> " + contaPoupanca.toString());
    }

    public void testContasTransfere() {
        Cliente joana = new Cliente("Joana", "(62) 77777-7777");
        Cliente maria = new Cliente("Maria", "(62) 66666-6666");

        Conta contaCorrenteJoana = new ContaCorrente(1111, joana);
        contaCorrenteJoana.depositar(200);

        Conta contaPoupancaMaria = new ContaPoupanca(2222, maria);
        contaPoupancaMaria.depositar(200);

        contaCorrenteJoana.transferir(100.00, contaPoupancaMaria);
        System.out.println("conta corrente joana depois da receber de maria >>> " + contaPoupancaMaria.toString());
        System.out.println("conta corrente maria depois da enviar para joana >>> " + contaCorrenteJoana.toString());
    }
}
