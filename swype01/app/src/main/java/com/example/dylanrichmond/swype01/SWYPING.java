package com.example.dylanrichmond.swype01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;

public class SWYPING extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ImageButton backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToFig3();
            }
        });

    }


    private void goToFig3() {
        Intent intent = new Intent(this, Fig3.class);
        startActivity(intent);
    }
}
