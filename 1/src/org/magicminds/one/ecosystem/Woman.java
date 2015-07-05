package org.magicminds.one.ecosystem;

import java.util.ArrayList;

/**
 * Created by Ivy on 7/1/2015.
 */
public class Woman extends Person{
    protected boolean isPretty;
    protected ArrayList<Person> children = new ArrayList<>();

    public Woman (String n, String a, boolean d) {
        name = n;
        address = a;
        isPretty = d;
    }

    public int gaveBirthToChild(String s) {
        Person child = new Person(s, this.address);
        children.add(child);
        return children.size();
    }

    public ArrayList<Person> getChildren() {
        return children;
    }


}
