package com.robertgal;

public class Math {
    double x;
    double y;

    //doubles

    double sum(double x, double y) {
        double total = x + y;
        System.out.println(x + " + " + y +" = " + total);

        return total;
    }

    double dif(double x, double y) {
        double total = x - y;
        System.out.println(x + " - " + y +" = " + total);

        return total;
    }

    double multiply(double x, double y) {
        double total = x * y;
        System.out.println(x + " * " + y +" = " + total);

        return total;
    }

    double divide(double x, double y) {
        double division = ((double) x) / y;
        double total = division;
        System.out.println(x + " / " + y +" = " + total);

        return total;
    }

    //integers

    double sum(int x, int y) {
        int total = x + y;
        System.out.println(x + " + " + y +" = " + total);

        return total;
    }

    double dif(int x, int y) {
        int total = x - y;
        System.out.println(x + " - " + y +" = " + total);

        return total;
    }

    double multiply(int x, int y) {
        int total = x * y;
        System.out.println(x + " * " + y +" = " + total);

        return (int)total;
    }

    double divide(int x, int y) {
        double division = ((double) x) / y;
        double total = division;
        System.out.println(x + " / " + y +" = " + total);

        return total;
    }
    
}
