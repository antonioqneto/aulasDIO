package com.dio.base;

/**
 * @author AQN
 * @version 1.0.0
 * @since feb/2022
 */


public class exemplo2 {
    private final String code;
    private final double totalValue;



    /**
     * Construtor de classe
     * @param code        Código do pedido
     * @param totalValue  valor total
     */
    public exemplo2(String code, double totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    /**
     * Calcula taxa de acordo com o valor total
     * @return valor total com taxas
     * @throws RuntimeException se o valor do pedido for negativo
     */
    public double calculateFee(){
        if (totalValue > 100) {
            return totalValue * 0.9;
        } else if (totalValue < 0) {
            throw new RuntimeException("O pedido não pode ter valor negativo/");
        } else {
            return totalValue;
        }
    }
}
