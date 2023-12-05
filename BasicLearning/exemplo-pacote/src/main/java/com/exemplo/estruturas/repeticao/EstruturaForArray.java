package com.exemplo.estruturas.repeticao;

public class EstruturaForArray {
    public static void main(String[] args) {
        String aluno[] = {"Bruno","Ana","Carlos","Pedro"};

        for(int a = 0; a < aluno.length; a++) {
            System.out.println("O Aluno "+aluno[a]+" esta na posicao " + a);
        }
        //Outra forma de utilizar o for
        for(String aluno2 : aluno){
            System.out.println("O Aluno "+aluno2);
        }
    }
}
