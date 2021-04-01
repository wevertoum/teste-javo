package com.aluno;

public class Principal {

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.instanceAluno();

    }

    public void instanceAluno() {
        System.out.println("\n----------- Instanciando aluno -----------\n");
        // aluno original
        Aluno a = new Aluno("Maria antonieta");
        Curso cSi = new Curso("Sistemas de informação", "SI");
        a.matricular(1111,cSi, 2017 );
        System.out.println(">>> dados originais");
        System.out.println(a.exibeDados());

        // alterando matricula com nova classe Curso
        Curso cEs = new Curso("Engenharia de software", "ES");
        a.setMatricula(2222);
        a.setAno(2018);
        a.setCurso(cEs);
        System.out.println("\n>>> dados novos dados");
        System.out.println(a.exibeDados());
    }
}
