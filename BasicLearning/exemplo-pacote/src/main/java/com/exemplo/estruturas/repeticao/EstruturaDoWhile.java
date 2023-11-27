package com.exemplo.estruturas.repeticao;

import java.util.Random;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando o telefone...");
        do{
            System.out.println("Telefone tocando...");
        }while(tocando());
        System.out.println("Alo?");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? "+ atendeu);
        return ! atendeu;
    }
}
