package com.desafios.desafios;

import java.util.Scanner;

public class MarteloDoThor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int C = scan.nextInt();
        
        for(int i = 0; i < C; i++) {
            String nome = scan.next();
            int N = scan.nextInt();

            if(nome.equals("Thor")){
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
