package com.exemplo.estruturas.excessao;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcessao {
    public static void main(String[] args) {
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a12");
            System.out.println(valor);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
