package com.exemplo.estruturas.condicional;

public class switchCase {
    public static void main(String[] args) {
        
        String sigla = "P";
        switch(sigla){
            case "P": System.err.println("Pequeno");
            break;
            case "M": System.err.println("Medio");
            break;
            case "G": System.err.println("Grande");
            break;
            default: System.err.println("Sigla invalida");
        } 
    }
}
