package com.dio.horadodia;

import java.util.Calendar;


public class GetTime {
    static Calendar agora = Calendar.getInstance();


    public static String mensagem;


    public static void setMensagem() {
        int hora = agora.get(Calendar.HOUR_OF_DAY);
        if (hora < 13) {
            mensagem = "BOM DIA!!";
        } else if (hora < 19) {
            mensagem = "BOA TARDE!!";
        } else {
            mensagem = "BOA NOITE!!";
        }
    }

    public static String getMensagem() {
        return mensagem;
    }
}