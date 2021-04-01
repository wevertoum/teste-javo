package com.cadastroCliente;

public class Cadastro {

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        cadastro.instanceCliente();
    }

    public void instanceCliente() {
        Cliente cliente = new Cliente ("Maria");
        cliente.setTelefone("9823-2323");
        cliente.setIdade(20);

        System.out.println("\n>>> mostrando dados na classe cadastro");
        System.out.println("Cliente: " + cliente.getNome() + " | Telefone: " + cliente.getTelefone() + " | Idade: " + cliente.getIdade());

        System.out.println("\n>>> mostrando dados na classe cliente (outro metodo)");
        System.out.println(cliente.exibeDados());
    }
}
