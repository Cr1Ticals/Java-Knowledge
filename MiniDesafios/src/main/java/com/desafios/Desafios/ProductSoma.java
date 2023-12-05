package com.desafios.desafios;

import java.util.Scanner;

public class ProductSoma {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        int A, B, prod;

        System.out.println("Chose two number! ");
        System.out.println("Type a number: ");
        A = scan.nextInt();
        System.out.println("Type a number: ");
        B = scan.nextInt();

        prod = A + B;

        System.err.println("The sum of the numbers that you chose is prod = " + prod);


    }
}
