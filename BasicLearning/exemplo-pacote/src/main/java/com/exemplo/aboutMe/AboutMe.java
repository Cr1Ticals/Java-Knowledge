package com.exemplo.aboutMe;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try{
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            //Imprimindo os dados informados pelo ususario
            System.out.println("Nome: " + nome.toUpperCase()+ "");
            System.out.println("Sobrenome: " + sobrenome.toUpperCase()+ "");
            System.out.println("Idade: " + idade+ "");
            System.out.println("Altura: " + altura+ "");
        }catch(InputMismatchException e){
            System.err.println("Os campos Idade e altura precisam ser numericos");
        }

    }
}
