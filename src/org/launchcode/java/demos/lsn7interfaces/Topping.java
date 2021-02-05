package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Topping extends Ingredient{

    private int testiness;
    public Topping(String aName, double aCost, ArrayList<String> someAllergens, int testiness) {
        super(aName, aCost, someAllergens);
        this.testiness = testiness;
    }

    public int getTestiness() {
        return testiness;
    }

    public void setTestiness(int testiness) {
        this.testiness = testiness;
    }
}
