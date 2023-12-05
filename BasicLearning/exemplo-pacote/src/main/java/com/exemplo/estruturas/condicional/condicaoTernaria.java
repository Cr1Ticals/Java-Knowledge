package com.exemplo.estruturas.condicional;

public class condicaoTernaria {
    public static void main(String[] args) {
        int nota1 = 5;
        int nota2 = 5;

        String resultado = nota1 >= 7 ? "Aprovado" : "Reprovado";
        System.err.println(resultado);

        String recuperacao = nota2 >= 7 ? "Aprovado": nota2 >=5 && nota2 <= 7 ? "Recuperacao" : "Reporovado";
        System.err.println(recuperacao);
    }
}
