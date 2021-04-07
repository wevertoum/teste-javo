package com.questao1;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    public Instituto instituto;
    public String nome;
    public List<Disciplina> disciplinas = new ArrayList<>();

    Curso(){}

    public Instituto getInstituto() {
        return instituto;
    }

    public void setInstituto(Instituto instituto) {
        this.instituto = instituto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

}
