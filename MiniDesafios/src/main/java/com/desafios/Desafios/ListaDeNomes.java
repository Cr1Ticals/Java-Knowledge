package com.desafios.desafios;

import java.util.Scanner;

public class ListaDeNomes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] lista = new String[10];

        for (int i = 1; i < 10; i++) {
            System.out.println("nome "+ i);
            lista[i] = scan.nextLine();
        }
        if (lista != null) {
            System.out.println("Lista de nomes: ");
            System.out.println("Terceiro nome da lista "+ lista[3]);
            System.out.println("Setimo nome da lista "+ lista[7]);
            System.out.println("Nono nome da lista "+ lista[9]);
        }else{
            System.out.println("Lista vazia");
        }
    }
}
