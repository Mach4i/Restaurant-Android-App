package com.example.finalproject;

import android.widget.TextView;
import android.view.View;
import java.util.ArrayList;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Stores menuItems in an ArrayList as a shopping cart
 */
public class Cart {
   /* public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){
        public Cart createFromParcel(Parcel in){
            return new Cart(in);
        }
        public Cart[] newArray(int size){
            return new Cart[size];
        }
    };*/

    private ArrayList<menuItem> cart;

    //ACCESSORS AND MUTATORS
    public ArrayList<menuItem> getCart() {return cart;}
    public void setCart(ArrayList<menuItem> cart) {this.cart = cart;}

    //CONSTRUCTORS
    public Cart(){this.cart=new ArrayList<menuItem>();}
    public Cart(ArrayList<menuItem> cart){this.cart=cart;}

    //METHODS
    /*public String[] getCartItems() { //returns ArrayList of menuItems that have an amount over 0
        ArrayList<String> cartItems = new ArrayList<>();
        for (int i=0; i<this.cart.size(); i++){ //loops through cart menuItems
            if (this.cart.get(i).getAmount() > 0){//if menuItem amount is >0, add it to cartItems
                double itemTotal = this.cart.get(i).getPrice()*(double)this.cart.get(i).getAmount();
                cartItems.add(this.cart.get(i).getName());
                cartItems.add(Integer.toString(this.cart.get(i).getAmount()));
                cartItems.add("$"+Double.toString(itemTotal));
            }
        }
        return cartItems;
    }*/

    public void createMenu (){ //create a menu
        menuItem fries = new menuItem(0,"Fries",2.99,0);
        menuItem mozz = new menuItem(1,"Mozzarella Sticks",3.99,0);
        menuItem jalapeno = new menuItem(2,"Jalapeno Poppers",3.99,0);
        menuItem soup = new menuItem(3,"Soup",1.99,0);
        menuItem salad = new menuItem(4,"Salad",1.99,0);
        menuItem burger = new menuItem(5,"Burger",7.99,0);
        menuItem hoagie = new menuItem(6,"Hoagie",2.99,0);
        menuItem lasagna = new menuItem(7,"Lasagna",2.99,0);
        menuItem parm = new menuItem(8,"Chicken Parmesan",2.99,0);
        menuItem spaghetti = new menuItem(9,"Spaghetti",2.99,0);
        menuItem alfredo = new menuItem(10,"Chicken Alfredo",2.99,0);
        menuItem pizza = new menuItem(11,"Pizza",2.99,0);
        menuItem calzone = new menuItem(12,"Calzone",2.99,0);
        menuItem steak = new menuItem(13,"Steak",2.99,0);
        menuItem potato = new menuItem(14,"Potato Salad",2.99,0);
        menuItem cake = new menuItem(15,"Chocolate Cake",2.99,0);
        menuItem icecream = new menuItem(16,"Ice Cream",2.99,0);
        menuItem pie = new menuItem(17,"Pie",2.99,0);
        menuItem flan = new menuItem(18,"Flan",2.99,0);
        menuItem cheesecake = new menuItem(19,"Cheesecake",2.99,0);
        cart.add(fries);
        cart.add(mozz);
        cart.add(jalapeno);
        cart.add(soup);
        cart.add(salad);
        cart.add(burger);
        cart.add(hoagie);
        cart.add(lasagna);
        cart.add(parm);
        cart.add(spaghetti);
        cart.add(alfredo);
        cart.add(pizza);
        cart.add(calzone);
        cart.add(steak);
        cart.add(potato);
        cart.add(cake);
        cart.add(icecream);
        cart.add(pie);
        cart.add(flan);
        cart.add(cheesecake);

    }

    public void subItem (int id){ //decrease amount of item in cart by 1 if amount is not 0
        int curAmount = this.cart.get(id).getAmount();
        if (curAmount != 0){
            curAmount--;
            this.cart.get(id).setAmount(curAmount);
        }
    }

    public void addItem (int id){ //increase amount of item in cart by 1
        int curAmount = this.cart.get(id).getAmount();
        curAmount++;
        this.cart.get(id).setAmount(curAmount);
    }

    public int getAmountById (int id){
        return this.cart.get(id).getAmount();
    }

    //FOR TESTING
    public String testSub (int id){
        String output="ID: "+Integer.toString(id)+"\n"+"Name: "+this.cart.get(id).getName();
        return output;
    }

    public String printMenu (){
        String output="";
        for (int i=0;i<this.cart.size();i++){
            String text = this.cart.get(i).getName()+" | "+Integer.toString(this.cart.get(i).getId())+" | "+Double.toString(this.cart.get(i).getPrice())+" | "+Integer.toString(this.cart.get(i).getAmount())+"\n";
            output.concat(text);
        }

        return output;
    }

    /*PARCELLING
    public Cart(Parcel in){
        this.cart = in.readTypedList(cart, Cart.CREATOR);
    }
    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        dest.writeTypedList(cart);
    }*/

}
