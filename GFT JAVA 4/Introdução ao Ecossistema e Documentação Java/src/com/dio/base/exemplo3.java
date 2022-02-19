package com.dio.base;

public class exemplo3 {
    
    private final String code;
    private final int totalValue;

    private String[] items;

    public exemplo3(String code, int totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    public void printItems () {
        /* usando while
            int i = 0;
             while (i < items.length) {
            System.out.println(items[]);
            i++;
        } */

        /* usando do while
            int i = 0;

            do {
                System.out.println(items[i]);
                i++
            } while (i < items.length);
        }*/

        /*usando for
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i]);
            }
        */

        //enhanced for
        for (String i : items) {
            System.out.println(i);
        }
    }
}
