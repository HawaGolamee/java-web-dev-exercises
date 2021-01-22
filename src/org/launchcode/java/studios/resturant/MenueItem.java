package org.launchcode.java.studios.resturant;

import java.util.Date;
import java.util.Objects;

public class MenueItem {
    private double price;
    private String name;
    private String description;
    private String category;
    private boolean isNew;
    private Date dateCreated;



    public MenueItem(double price, String description, String category, String pictureLocation, int calories){
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = category;
        this.isNew = true;
        this.dateCreated = new Date();
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;

    }

    public java.lang.String getCategory() {
        return category;
    }

    public void setCategory(java.lang.String category) {
        this.category = category;
    }

    public java.lang.String getPictureLocation() {
        return pictureLocation;
    }

    public void setPictureLocation(java.lang.String pictureLocation) {
        this.pictureLocation = pictureLocation;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    public boolean isNew(){
        return isNew;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public String toString (){
        return name + "\n" + description + "\n" + price
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenueItem menueItem = (MenueItem) o;
        return name.equals(menueItem.name) && category.equals(menueItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }
}
}
