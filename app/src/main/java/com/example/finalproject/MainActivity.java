package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToMenu(View v) { //Goes to Menu activity
        Intent intent = new Intent(MainActivity.this, Menu.class);
        startActivity(intent);
    }
    public void goToOrder(View v) { //Goes to Order activity
        Intent intent = new Intent(MainActivity.this, Order.class);
        startActivity(intent);
    }
}
