package com.dio.horadodia;

import java.util.Scanner;

public class HoraDoDiav1 {

    public static void main(String[] args) {
        //Versão 1: input manual do horário, somente horas

        Scanner scan = new Scanner(System.in);

        int hora;

        System.out.println("Digite a hora desejada:");
        hora = scan.nextInt();

        if (hora < 0 || hora > 24) {
            System.out.println("Sabe, o dia tem 24 horas...");
        } else if (hora > 6 && hora <= 12) {
            System.out.println("BOM DIA!!");
        } else if (hora > 12 && hora <= 18) {
            System.out.println("BOA TARDE!!");
        } else {
            System.out.println("BOA NOITE!!");
        }
    }

}