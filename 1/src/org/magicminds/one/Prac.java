package org.magicminds.one;

import org.magicminds.one.practice.Practice;

/**
 * Created by Ivy on 7/1/2015.
 */
public class Prac {
    public static void main(String[] args) {

        System.out.println("Hello, world!");

        Practice p = new Practice();

        p.toSet();
        p.freshLemon();
        System.out.println(p.getBrainCellsFast(3.1415926));
        System.out.println(p.leetSpeak());
        p.badProsecutor();
        p.yerAWizard(5);

    }



}

