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


<<<<<<< HEAD





=======
>>>>>>> e180cf97d173309af9b01d669a7007da5c754e7b
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

    }

    private void goToSettings() {
        Intent settings = new Intent( this, Settings.class);
        startActivity(settings);
    }

    private void goToSWYPING() {
        Intent swyping = new Intent(this, SWYPING.class);
        startActivity(swyping);
    }
}
