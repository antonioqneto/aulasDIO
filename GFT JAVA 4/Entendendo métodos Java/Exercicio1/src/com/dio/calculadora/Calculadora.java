package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro número: ");
        a = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        b = scan.nextInt();

        System.out.println("Resultado das operações:");
        System.out.println("Soma : " + OperacoesBasicas.soma(a, b));
        System.out.println("Subtração: " + OperacoesBasicas. subtracao(a, b));
        System.out.println("Divisão: " + OperacoesBasicas.divisao(a, b));
        System.out.println("Multiplicação: " + OperacoesBasicas.multiplicacao(a, b));

    }

}
