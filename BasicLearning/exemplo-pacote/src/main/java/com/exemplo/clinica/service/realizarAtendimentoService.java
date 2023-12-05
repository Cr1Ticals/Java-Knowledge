package com.exemplo.clinica.service;

import com.exemplo.clinica.model.Consulta;

public class realizarAtendimentoService {
    private void realizarConsulta(Consulta consulta) {
        String cliente = "Bruna";
        String atendente = "Pedro";
        consulta.realizarConsulta(cliente, atendente);
    }
}
