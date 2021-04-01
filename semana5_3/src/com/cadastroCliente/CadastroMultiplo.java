package com.cadastroCliente;

import java.util.Scanner;

public class CadastroMultiplo {

    public static void main(String[] args) {
        CadastroMultiplo cadastroMultiplo = new CadastroMultiplo();
        cadastroMultiplo.instanceCliente();
    }

    public void instanceCliente() {

        // defini um array menor e com scan pro codigo nao ficar muito estatico.
        Cliente[] cliente = new Cliente[2];
        int x = 0;
        while (x < cliente.length) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome do cliente Nº "+ x);
            String nome = sc.nextLine();
            cliente[x] = new Cliente(nome);

            System.out.println("Digite o telefone do cliente Nº "+ x);
            String fone = sc.nextLine();
            cliente[x].setTelefone(fone);

            System.out.println("Digite a idade do cliente Nº "+ x);
            Integer idade = sc.nextInt();
            cliente[x].setIdade(idade);

            x++;
        }

        for (Cliente value : cliente) {
            System.out.println(value.exibeDados());
        }
    }
}
