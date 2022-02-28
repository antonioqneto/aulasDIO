package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //ctrl + shif + O já ajuda a importar a ferramenta associada
		
		int a, b;
		
		
		System.out.println("Digite o primeiro valor");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor");
		b = scan.nextInt();
		
		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		int divisao = divisao(a, b);
		int multiplicacao = multiplicacao(a, b); //ctrl + 1 já ajuda a designar uma nova variável local
		
		System.out.println("Soma = " + soma);
		System.out.println("Subtração = " + subtracao);
		System.out.println("Divisão = " + divisao);
		System.out.println("Multiplicação = " + multiplicacao);
	}


	public static int soma (int a, int b) {
		return a + b;
	} //para duplicar o trecho de código, pressione ctrl + alt + seta pra baixo
	
	public static int subtracao (int a, int b) {
		return a - b;
	}
	
	public static int divisao (int a, int b) {
		return a / b;
	}
	
	public static int multiplicacao (int a, int b) {
		return a * b;
	}
	
	
}
