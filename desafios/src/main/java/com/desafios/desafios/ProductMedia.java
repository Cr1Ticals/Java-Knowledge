package com.desafios.desafios;

import java.util.Scanner;

public class ProductMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A, B, MEDIA;

        A = scan.nextDouble();
        B = scan.nextDouble();

        MEDIA = (A * 3.6 +  B * 5.0) / 2;

        System.out.printf("MEDIA = %.5f", + MEDIA);
        // System.err.println(MEDIA);
    }
}   
