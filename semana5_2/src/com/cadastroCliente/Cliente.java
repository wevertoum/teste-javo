package com.cadastroCliente;

public class Cliente {
    private String nome;
    private String telefone;
    private Integer idade;

    Cliente(String nome){
        this.nome = nome;
    }

    public String exibeDados() {
        return "Cliente: " + nome + " | Telefone: " + telefone + " | Idade: " + idade ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }


}
