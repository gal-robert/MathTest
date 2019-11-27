package com.robertgal;

public class Math {
    int x;
    int y;

    int sum(int x, int y) {
        int total = x + y;
        System.out.println(x + " + " + y +" = " + total);

        return total;
    }

    int dif(int x, int y) {
        int total = x - y;
        System.out.println(x + " - " + y +" = " + total);

        return total;
    }

    int multiply(int x, int y) {
        int total = x * y;
        System.out.println(x + " * " + y +" = " + total);

        return total;
    }

    double divide(int x, int y) {
        double division = ((double) x) / y;
        double total = division;
        System.out.println(x + " / " + y +" = " + total);

        return total;
    }
}
