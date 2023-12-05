package com.desafios.contaBancaria;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       DadosCliente dc = new DadosCliente();
       System.out.println("Bem vindo ao Banco da DIO \nPara criar uma conta informe os dados abaixo!");
       
       System.err.println("Porfavor, informe um numero de conta: ");
       dc.setNumero(scanner.nextInt());
       System.err.println("Porfavor, informe sua agencia: ");
       dc.setAgencia(scanner.next());
       System.err.println("Porfavor, informe seu nome completo: ");
       dc.setNomeCliente(scanner.next());
       System.err.println("Porfavor, informe seu saldo: ");
       dc.setSaldo(scanner.nextDouble());

       System.err.println("Ola "+ dc.getNomeCliente() +", obrigado por criar uma conta em nosso banco, sua agencia e "+dc.getAgencia()+", conta "+dc.getNumero()+", e seu saldo R$"+dc.getSaldo()+" ja esta disponivel para saque.");
    }
}
