package com.exemplo.escola;

public class Aula {
    public static void main (String[] args){
        Aluno aluno =  new Aluno();
        aluno.setNome("Felipe");
        aluno.getIdade();

        Professor professor = new Professor("Paula","Matematica" );

        System.out.println("Hoje a aula sera ministrada para o aluno "+ aluno.getNome() + " e o professor que vai ensinar e " + professor.getNome() +".");
    }
}
