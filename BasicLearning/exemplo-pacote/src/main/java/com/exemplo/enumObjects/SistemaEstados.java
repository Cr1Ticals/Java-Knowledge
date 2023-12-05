package com.exemplo.enumObjects;

public class SistemaEstados {
    public static void main(String[] args) {
        for(EstadosBrasileiro e: EstadosBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNomeMaiusculo());
        }
    }
}
