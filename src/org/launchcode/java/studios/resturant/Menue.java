package org.launchcode.java.studios.resturant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class Menu {
    private Date dateLastUpdated;
    private ArrayList<String> categories =  new ArrayList<>(Arrays.asList("Appetizer", "Main Course", "Dessert"));
    private MenueItem special;
    private ArrayList<MenueItem> items;
    
    public Menu(ArrayList<MenueItem> items){
        this.items = items;
        this.dateLastUpdated = new Date();
    }
    public void printMenu(){
        for(MenueItem menueItem : items){
            System.out.println(menueItem.toString());
        }
    }


    public void addCategory(String category){
        this.categories.add(category);
    }
    public void removeCategory (String category){
        this.categories.remove(category);
    }

    public MenueItem getSpecial() {
        return special;
    }

    public void setSpecial(MenueItem special) {
        this.special = special;
    }

    public Date getDateLastUpdated() {
        return dateLastUpdated;
    }
    public ArrayList<String> getCategories(){
    return categories;
    }
    public ArrayList<MenueItem> getItems(){
        return items;
    }
}
    

