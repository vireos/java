package org.magicminds.one;

import org.magicminds.one.algorithms.UF;
import org.magicminds.one.ecosystem.Person;
import org.magicminds.one.ecosystem.Woman;
import org.magicminds.one.util.MathUtil;

import java.util.ArrayList;

/**
 * Created by Ivy on 6/28/2015.
 */
public class HelloWorld {
    public static void main(String[] args) {
        testAlgorithm();
        growingFamily();

        System.out.println("Hello, World");


        int i = 13;
        double pi = 3.141559265358979;
        System.out.println(i + " * " + pi + " = " + i * pi);

        double ipi = MathUtil.mult(i, pi);
        System.out.println(ipi);

        Person p1 = new Person("Barack Obama", "1600 Pennsylvania Avenue");
        System.out.println(p1.getName() + ", who lives at " + p1.getAddress());


        Person p2 = new Person("Harry Potter", "4 Privet Drive");
        System.out.println(p2.getName() + ", who lives at " + p2.getAddress());

    }

    public static void testAlgorithm() {
        UF v =  new UF(0);
        int[] o = {1,2,3};

        String nul = null;
        System.out.println(o[0] + nul + o[1] + nul + o[2]);
    }

    public static void growingFamily() {
        Woman eve = new Woman("Eve", "Eden", true);
        eve.gaveBirthToChild("Bob");
        eve.gaveBirthToChild("Banana");
        eve.gaveBirthToChild("Bear");

        ArrayList<Person> children = eve.getChildren();

        int i = 0;
        while (i < children.size()) {
            System.out.println(children.get(i).getName() + ", who lives at " + children.get(i).getAddress());
            i++;
        }
    }

}

