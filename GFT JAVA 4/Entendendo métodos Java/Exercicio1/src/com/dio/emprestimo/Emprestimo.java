package com.dio.emprestimo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
    /*
     Input do valor
     Faixas de acordo juros com o valor
     taxa fixa (percentual)
     Quantidade de parcelas

     FALTA CRIAR MÉTODOS!!!
     */
        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Qual o valor a ser emprestado?");
        float valorSolicitado = scan.nextFloat();

        System.out.println("Qual é a quantidade de parcelas?");
        int qtdParcelas = scan.nextInt();

        double jurosMensais = 1.14;
        double jurosTotais = Math.pow(jurosMensais, qtdParcelas);

        double taxaServico = 0.05;
        double emprestimoTotal = valorSolicitado * jurosTotais;
        double taxaTransacao = emprestimoTotal * taxaServico;
        double valorTotal = emprestimoTotal + taxaTransacao;
        System.out.println("Valor solicitado: R$" + String.format("%.2f", valorSolicitado));
        System.out.println("Quantidade de parcelas: " + qtdParcelas);
        System.out.println("Juros Mensais: 14%");
        System.out.println("Juros Totais: " + String.format("%.2f", (jurosTotais*100)) + "%");
        System.out.println("Valor Total do Empréstimo: R$" + String.format("%.2f", emprestimoTotal));
        System.out.println("Taxa de serviço = R$" + String.format("%.2f", taxaTransacao));
        System.out.println("Valor Total do Contrato: R$" + String.format("%.2f", valorTotal));
    }
}
