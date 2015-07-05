package org.magicminds.one.ecosystem;

import org.magicminds.one.ecosystem.Animal;

/**
 * Created by Ivy on 6/28/2015.
 */
public class Person extends Animal{
    protected String address;

    public Person () {
    }

    public Person(String v, String y) {
        name = v;
        address = y;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}



