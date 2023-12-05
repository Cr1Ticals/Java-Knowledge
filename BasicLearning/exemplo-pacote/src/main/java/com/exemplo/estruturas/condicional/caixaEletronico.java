package com.exemplo.estruturas.condicional;

public class caixaEletronico {
    public static void main(String[] args) {
        double saldo = 17.00;
        double valorSolicitado = 5.00;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.err.println(saldo);
        }
    }
}
