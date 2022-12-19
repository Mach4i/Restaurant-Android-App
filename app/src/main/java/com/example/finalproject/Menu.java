package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;


public class Menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Create cart
        Cart cart = new Cart();
        cart.createMenu();

        //Unparcel cart



        //Set listeners for add/sub buttons
        ImageButton friesSubButton = (ImageButton) findViewById(R.id.friesSub);
        ImageButton friesAddButton = (ImageButton) findViewById(R.id.friesAdd);
        ImageButton mozzSubButton = (ImageButton) findViewById(R.id.mozzSub);
        ImageButton mozzAddButton = (ImageButton) findViewById(R.id.mozzAdd);
        ImageButton jalapenoSubButton = (ImageButton) findViewById(R.id.jalapenoSub);
        ImageButton jalapenoAddButton = (ImageButton) findViewById(R.id.jalapenoAdd);
        ImageButton soupSubButton = (ImageButton) findViewById(R.id.soupSub);
        ImageButton soupAddButton = (ImageButton) findViewById(R.id.soupAdd);
        ImageButton saladSubButton = (ImageButton) findViewById(R.id.saladSub);
        ImageButton saladAddButton = (ImageButton) findViewById(R.id.saladAdd);
        ImageButton burgerSubButton = (ImageButton) findViewById(R.id.burgerSub);
        ImageButton burgerAddButton = (ImageButton) findViewById(R.id.burgerAdd);
        ImageButton hoagieSubButton = (ImageButton) findViewById(R.id.hoagieSub);
        ImageButton hoagieAddButton = (ImageButton) findViewById(R.id.hoagieAdd);
        ImageButton lasagnaSubButton = (ImageButton) findViewById(R.id.lasagnaSub);
        ImageButton lasagnaAddButton = (ImageButton) findViewById(R.id.lasagnaAdd);
        ImageButton parmSubButton = (ImageButton) findViewById(R.id.parmSub);
        ImageButton parmAddButton = (ImageButton) findViewById(R.id.parmAdd);
        ImageButton spaghettiSubButton = (ImageButton) findViewById(R.id.spaghettiSub);
        ImageButton spaghettiAddButton = (ImageButton) findViewById(R.id.spaghettiAdd);
        ImageButton alfredoSubButton = (ImageButton) findViewById(R.id.alfredoSub);
        ImageButton alfredoAddButton = (ImageButton) findViewById(R.id.alfredoAdd);
        ImageButton pizzaSubButton = (ImageButton) findViewById(R.id.pizzaSub);
        ImageButton pizzaAddButton = (ImageButton) findViewById(R.id.pizzaAdd);
        ImageButton calzoneSubButton = (ImageButton) findViewById(R.id.calzoneSub);
        ImageButton calzoneAddButton = (ImageButton) findViewById(R.id.calzoneAdd);
        ImageButton steakSubButton = (ImageButton) findViewById(R.id.steakSub);
        ImageButton steakAddButton = (ImageButton) findViewById(R.id.steakAdd);
        ImageButton potatoSubButton = (ImageButton) findViewById(R.id.potatoSub);
        ImageButton potatoAddButton = (ImageButton) findViewById(R.id.potatoAdd);
        ImageButton cakeSubButton = (ImageButton) findViewById(R.id.cakeSub);
        ImageButton cakeAddButton = (ImageButton) findViewById(R.id.cakeAdd);
        ImageButton icecreamSubButton = (ImageButton) findViewById(R.id.icecreamSub);
        ImageButton icecreamAddButton = (ImageButton) findViewById(R.id.icecreamAdd);
        ImageButton pieSubButton = (ImageButton) findViewById(R.id.pieSub);
        ImageButton pieAddButton = (ImageButton) findViewById(R.id.pieAdd);
        ImageButton flanSubButton = (ImageButton) findViewById(R.id.flanSub);
        ImageButton flanAddButton = (ImageButton) findViewById(R.id.flanAdd);
        ImageButton cheesecakeSubButton = (ImageButton) findViewById(R.id.cheesecakeSub);
        ImageButton cheesecakeAddButton = (ImageButton) findViewById(R.id.cheesecakeAdd);



        friesSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(0);
                int newAmount = cart.getAmountById(0);
                TextView amount = (TextView) findViewById(R.id.friesAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        friesAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(0);
                int newAmount = cart.getAmountById(0);
                TextView amount = (TextView) findViewById(R.id.friesAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        mozzSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(1);
                int newAmount = cart.getAmountById(1);
                TextView amount = (TextView) findViewById(R.id.mozzAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        mozzAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(1);
                int newAmount = cart.getAmountById(1);
                TextView amount = (TextView) findViewById(R.id.mozzAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        jalapenoSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(2);
                int newAmount = cart.getAmountById(2);
                TextView amount = (TextView) findViewById(R.id.jalapenoAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        jalapenoAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(2);
                int newAmount = cart.getAmountById(2);
                TextView amount = (TextView) findViewById(R.id.jalapenoAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        soupSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(3);
                int newAmount = cart.getAmountById(3);
                TextView amount = (TextView) findViewById(R.id.soupAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        soupAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(3);
                int newAmount = cart.getAmountById(3);
                TextView amount = (TextView) findViewById(R.id.soupAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        saladSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(4);
                int newAmount = cart.getAmountById(4);
                TextView amount = (TextView) findViewById(R.id.saladAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        saladAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(4);
                int newAmount = cart.getAmountById(4);
                TextView amount = (TextView) findViewById(R.id.saladAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        burgerSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(5);
                int newAmount = cart.getAmountById(5);
                TextView amount = (TextView) findViewById(R.id.burgerAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        burgerAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(5);
                int newAmount = cart.getAmountById(5);
                TextView amount = (TextView) findViewById(R.id.burgerAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        hoagieSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(6);
                int newAmount = cart.getAmountById(6);
                TextView amount = (TextView) findViewById(R.id.hoagieAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        hoagieAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(6);
                int newAmount = cart.getAmountById(6);
                TextView amount = (TextView) findViewById(R.id.hoagieAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        lasagnaSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(7);
                int newAmount = cart.getAmountById(7);
                TextView amount = (TextView) findViewById(R.id.lasagnaAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        lasagnaAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(7);
                int newAmount = cart.getAmountById(7);
                TextView amount = (TextView) findViewById(R.id.lasagnaAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        parmSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(8);
                int newAmount = cart.getAmountById(8);
                TextView amount = (TextView) findViewById(R.id.parmAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        parmAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(8);
                int newAmount = cart.getAmountById(8);
                TextView amount = (TextView) findViewById(R.id.parmAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        spaghettiSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(9);
                int newAmount = cart.getAmountById(9);
                TextView amount = (TextView) findViewById(R.id.spaghettiAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        spaghettiAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(9);
                int newAmount = cart.getAmountById(9);
                TextView amount = (TextView) findViewById(R.id.spaghettiAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        alfredoSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(10);
                int newAmount = cart.getAmountById(10);
                TextView amount = (TextView) findViewById(R.id.alfredoAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        alfredoAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(10);
                int newAmount = cart.getAmountById(10);
                TextView amount = (TextView) findViewById(R.id.alfredoAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        pizzaSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(11);
                int newAmount = cart.getAmountById(11);
                TextView amount = (TextView) findViewById(R.id.pizzaAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        pizzaAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(11);
                int newAmount = cart.getAmountById(11);
                TextView amount = (TextView) findViewById(R.id.pizzaAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        calzoneSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(12);
                int newAmount = cart.getAmountById(12);
                TextView amount = (TextView) findViewById(R.id.calzoneAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        calzoneAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(12);
                int newAmount = cart.getAmountById(12);
                TextView amount = (TextView) findViewById(R.id.calzoneAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        steakSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(13);
                int newAmount = cart.getAmountById(13);
                TextView amount = (TextView) findViewById(R.id.steakAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        steakAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(13);
                int newAmount = cart.getAmountById(13);
                TextView amount = (TextView) findViewById(R.id.steakAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        potatoSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(14);
                int newAmount = cart.getAmountById(14);
                TextView amount = (TextView) findViewById(R.id.potatoAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        potatoAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(14);
                int newAmount = cart.getAmountById(14);
                TextView amount = (TextView) findViewById(R.id.potatoAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        cakeSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(15);
                int newAmount = cart.getAmountById(15);
                TextView amount = (TextView) findViewById(R.id.cakeAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        cakeAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(15);
                int newAmount = cart.getAmountById(15);
                TextView amount = (TextView) findViewById(R.id.cakeAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        icecreamSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(16);
                int newAmount = cart.getAmountById(16);
                TextView amount = (TextView) findViewById(R.id.icecreamAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        icecreamAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(16);
                int newAmount = cart.getAmountById(16);
                TextView amount = (TextView) findViewById(R.id.icecreamAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        pieSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(17);
                int newAmount = cart.getAmountById(17);
                TextView amount = (TextView) findViewById(R.id.pieAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        pieAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(17);
                int newAmount = cart.getAmountById(17);
                TextView amount = (TextView) findViewById(R.id.pieAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        flanSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(18);
                int newAmount = cart.getAmountById(18);
                TextView amount = (TextView) findViewById(R.id.flanAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        flanAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(18);
                int newAmount = cart.getAmountById(18);
                TextView amount = (TextView) findViewById(R.id.flanAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        cheesecakeSubButton.setOnClickListener(new View.OnClickListener(){//subtracts one item from cart and updates display
            public void onClick (View v){
                cart.subItem(19);
                int newAmount = cart.getAmountById(19);
                TextView amount = (TextView) findViewById(R.id.cheesecakeAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });
        cheesecakeAddButton.setOnClickListener(new View.OnClickListener(){//adds one item to cart and updates display
            public void onClick (View v){
                cart.addItem(19);
                int newAmount = cart.getAmountById(19);
                TextView amount = (TextView) findViewById(R.id.cheesecakeAmount);
                amount.setText(Integer.toString(newAmount));
            }
        });

    }
    public void goToOrder(View v) { //Goes to Order activity
        Intent intent = new Intent(Menu.this, Order.class);
        //intent.putExtra("cart", cart);
        startActivity(intent);
    }


}