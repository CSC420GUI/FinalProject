package com.example.dylanrichmond.swype01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;

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
    }

    private void goToSwypingScreen() {
        Intent intent = new Intent(this, SWYPING.class);
        startActivity(intent);
    }
}
