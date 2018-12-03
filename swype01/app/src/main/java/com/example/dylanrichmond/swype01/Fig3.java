package com.example.dylanrichmond.swype01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.SearchView;


public class Fig3 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutfig3);

        final SearchView searchButton = findViewById(R.id.searchButton);
        //idk what to implement for the settings but it would go here

        final Button testButton = findViewById(R.id.testbutton);
        final ImageButton settingsButton = findViewById(R.id.settingsButton);
        final ImageButton piechartButton = findViewById(R.id.piechartButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToSettings();

            }
        });

        piechartButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToSWYPING();
            }
        });

        testButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToItemList();
            }
        });


    }

    private void goToSettings() {
        Intent settings = new Intent( this, Settings.class);
        startActivity(settings);
    }

    private void goToSWYPING() {
        Intent swyping = new Intent(this, SWYPING.class);
        startActivity(swyping);
    }

    private void goToItemList() {
        Intent itemList = new Intent(this, ItemList.class);
        startActivity(itemList);
    }

    private void goToCheckout() {
        Intent checkOut = new Intent(this, Checkout.class);
        startActivity(checkOut);
    }
}
