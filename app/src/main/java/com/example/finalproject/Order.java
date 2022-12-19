package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;


public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        //String[] cartItems=cart.getCartItems;

        //ArrayAdapter<String> cartAdapter = new ArrayAdapter<>(this,R.layout.cart_item_layout, cartItems);
        //GridView cartGrid = new GridView(this);
        //setContentView(cartGrid);
       // cartGrid.setNumColumns(2);

    }
    public void goToMenu(View v) { //Goes to Menu activity
        Intent intent = new Intent(Order.this, Menu.class);
        startActivity(intent);
    }
}