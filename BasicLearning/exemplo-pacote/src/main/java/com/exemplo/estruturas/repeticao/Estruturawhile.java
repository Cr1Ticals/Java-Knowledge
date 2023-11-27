package com.exemplo.estruturas.repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class Estruturawhile {
    public static void main(String[] args) {
        double mesada = 50.00;
        while(mesada > 0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Valor do doce: " + valorDoce + " adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: "+ mesada);
        System.out.println("Ton gastou toda sua mesada em doces");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(5,15);
    }
}
