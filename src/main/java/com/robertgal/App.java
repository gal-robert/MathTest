package com.robertgal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Math instance = new Math();

        instance.sum(1, 2);
        instance.sum(1.5, 2.4);

        instance.dif(5, 2);
        instance.dif(5.4, 2.5);
        instance.dif(1, 2);

        instance.multiply(2, 3);
        instance.multiply(2.9, 3.1);

        instance.divide(5, 2);
        instance.divide(3, 5);
        instance.divide(3.5, 5.1);

    }
}
