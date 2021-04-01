package com.aluno;

public class Curso {
    private final String nome;
    private String sigla;

    public Curso(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
