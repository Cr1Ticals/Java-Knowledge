package com.desafios.desafios;

import java.util.Scanner;

public class ProductMulti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A, B, PROD;

        A = scanner.nextInt();
        B = scanner.nextInt();

        PROD = (A * B);
        System.err.println("The multiplication of A + B is PROD = "+ PROD);
    }
}
