package com.example.dylanrichmond.swype01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

public class ItemList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Remains Constant
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itemlist);

        final ImageButton backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToSwypingScreen();
            }
        });

        final ImageButton checkOutButton = findViewById(R.id.checkoutButton);
        checkOutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToCheckoutScreen();
            }
        });

        final ImageButton cancelButton1 = findViewById(R.id.cancelButton1);
        cancelButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                removeItem(R.id.textViewYeezy);
            }
        });

        final ImageButton cancelButton2 = findViewById(R.id.cancelButton2);
        cancelButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                removeItem(R.id.textViewPhone);
            }
        });

        final ImageButton addButton1 = findViewById(R.id.addButton1);
        addButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        final ImageButton addButton2 = findViewById(R.id.addButton2);
        addButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }

    private void goToSwypingScreen() {
        Intent intent = new Intent(this, Fig3.class);
        startActivity(intent);
    }

    private void goToCheckoutScreen() {
        Intent checkout = new Intent(this, Checkout.class);
        startActivity(checkout);
    }

    private void removeItem(int textViewID){
        TextView textViewSetter = (TextView)findViewById(textViewID);
        textViewSetter.setText("");
    }

    private void setItem(int textViewID, String text){
        TextView textViewSetter = (TextView)findViewById(textViewID);
        textViewSetter.setText("TEST");
    }
}
