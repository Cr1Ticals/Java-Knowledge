package com.exemplo.enumObjects;

public enum EstadosBrasileiro {

    SAO_PAULO ("SP","Sao Paulo"),
    RIO_JANEIRO ("RJ","Rio de Janeiro"),
    BRASILIA ("DF","Brasilia"),
    BAHIA ("BA","Bahia");

    private String nome;
    private String sigla;

    private EstadosBrasileiro(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
