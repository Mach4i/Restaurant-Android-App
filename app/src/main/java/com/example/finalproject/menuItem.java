package com.example.finalproject;

/**
 * Class for storing info on a menu item.
 * @author John
 */

public class menuItem {
    private int id; //image of menu item
    private String name; //name of menu item
    private double price; //price of menu item
    private int amount; //number in cart

    //ACCESSORS AND MUTATORS
    public void setId (int image){
        this.id = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {return amount;}

    public void setAmount(int amount) {this.amount = amount;}

    //CONSTRUCTORS
    public menuItem (){
        this.id=0;
        this.name="";
        this.price=0;
        this.amount=0;
    }

    /**
     *
     * @param id ID for menu item
     * @param name Name of menu item
     * @param price Price of menu item
     * @param amount Amount of menu item in cart
     */
    public menuItem (int id, String name, double price, int amount){
        this.id=id;
        this.name=name;
        this.price=price;
        this.amount=amount;
    }


}
