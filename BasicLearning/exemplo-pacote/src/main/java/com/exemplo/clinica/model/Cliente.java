package com.exemplo.clinica.model;

public class Cliente {
    void realizarCadastro(Atendente atendente){
        atendente.cadastraCliente();
    }
    void marcarConsulta(Atendente atendente){
        atendente.agendarCliente();
    }
    void realizarPagamento(Atendente atendente) {
        atendente.recebePagamento();
    }
}
