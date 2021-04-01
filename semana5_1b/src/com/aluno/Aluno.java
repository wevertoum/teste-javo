package com.aluno;

public class Aluno {
    private final String nome;
    private int matricula;
    private int ano;
    private Curso curso;

    Aluno(String nome) {
        this.nome = nome;
    }

    public void matricular (int matricula, Curso curso, int ano) {
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    public String exibeDados() {
        return "Aluno: " + nome + " | Matricula: " + matricula + " | Curso : " + curso.getNome() + " - " + curso.getSigla() +  " - " + ano;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }


}

