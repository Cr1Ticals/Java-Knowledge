package com.exemplo.estruturas.excessao;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatadorCep("27258852");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
    static String formatadorCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();
        return cep;

    }
}
