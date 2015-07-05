package org.magicminds.one.algorithms;

/**
 * Created by Ivy on 6/30/2015.
 */
public class UF {

    private int[] id;

    public UF(int a) {
        id = new int[a];
        for (int i = 0; i < a; i++){
            id[i] = i;
        }
    }





}
