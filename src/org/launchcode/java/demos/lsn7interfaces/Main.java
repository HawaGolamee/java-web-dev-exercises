package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Topping> toppings = menu.getTopping();
        ArrayList<Cone> cones = menu.getCones();

        System.out.println("Before sort");
        for (Flavor flavor : flavors){
            System.out.println(flavor.getName() + "# allergens: " + flavor.getAllergens().size());
        }
        System.out.println("After sort");
        Comparator comparator = new FlavorComparator();

        flavors.sort(comparator);

        for (Flavor flavor : flavors){
            System.out.println(flavor.getName() + "# allergens: " + flavor.getAllergens().size());
        }



        System.out.println("\n\nBefore sort");
        for (Cone cone : cones){
            System.out.println("$" + cone.getCost());
        }

        cones.sort(new ConeComparator());

        System.out.println("\n\nAfter sort");
        for (Cone cone : cones){
            System.out.println("$" + cone.getCost());
        }





        System.out.println("\n\nBefore sort");
        for (Topping topping : toppings){
            System.out.println(topping.getName() + "Testiness: " + topping.getTestiness());
        }

        toppings.sort(new ToppingComparator());

        System.out.println("\n\nAfter sort");
        for (Topping topping : toppings){
            System.out.println(topping.getName() + "Testiness: " + topping.getTestiness());
        }





        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
