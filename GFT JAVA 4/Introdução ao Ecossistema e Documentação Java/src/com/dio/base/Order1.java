package com.dio.base;

public class Order1 {
    private final String code;
    private final double totalValue;

    public Order1(String code, double totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    public double calculateFee(){
        if (totalValue > 100) {
            return totalValue * 0.9;
        } else {
            return totalValue;
        }
    }
}
