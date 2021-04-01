package com.aluno;

public class Principal {

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.instanceAluno();

    }

    public void instanceAluno() {
        System.out.println("\n ----------- Instanciando aluno ----------- \n");
        Aluno a = new Aluno("Maria antonieta");
        a.matricular(1111,"Sistemas de informação", 2017 );
        System.out.println("- dados originais -");
        System.out.println(a.exibeDados());
        a.setMatricula(2222);
        a.setCurso("Engenharia de software");
        a.setAno(2018);
        System.out.println("- dados novos dados -");
        System.out.println(a.exibeDados());
    }
}
