package com.dio.base;

public class exemplo1 {
    //atributos
    private final String code;
    private final double totalValue;

    //metodos
        //construtor
    public exemplo1(String code, double totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    // Utilizando IF
    public double calculateFee() {
        if (totalValue > 100) {
            return this.totalValue * 0.99;
        } else {
            return totalValue;
        }
    }

    /* Utilizando Switch - Indica msg de erro pois não pode switch com double, somente int, strings ou enum
    public double calculateFee() {
        switch (this.totalValue) {
            case 100:
                return totalValue * 0.99;
            case 200:
                return totalValue * 1.99; // pq o fator é esse? O.o
            default:
                return totalValue;
        }
    } */

    @Override
    public String toString() {
        return "Order={" + "code='" + code + "'" + "}";
    }
}