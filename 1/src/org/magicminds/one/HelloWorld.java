package org.magicminds.one;

/**
 * Created by Ivy on 6/28/2015.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");


        int i = 13;
        double pi = 3.141559265358979;
        System.out.println(i + " * " + pi + " = " + i * pi);

        double ipi = mult(i, pi);
        System.out.println(ipi);

        Person ps = new Person("v");
        System.out.println(ps.getName() + " " + ps.getBird());

        Person p2 = new Person("y");
        System.out.println(p2.getName());


    }

    public static double mult(double num1, double num2) {
        return(num1 * num2);
    }
}

