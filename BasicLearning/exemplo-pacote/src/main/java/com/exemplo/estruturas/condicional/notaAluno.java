package com.exemplo.estruturas.condicional;

import java.util.concurrent.ThreadLocalRandom;

public class notaAluno {
    public static void main(String[] args) {
        double min = 1.0;
        double max = 10.0;

        double nota = ThreadLocalRandom.current().nextDouble(min,max);

        if(nota > 8.0){
            System.err.println(nota);
            System.err.println("Aprovado!");
        } else {
            System.err.println(nota);
            System.err.println("Reprovado");
        }
    }
    
}
