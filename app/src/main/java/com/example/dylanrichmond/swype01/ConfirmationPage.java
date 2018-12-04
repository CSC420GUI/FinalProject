package com.example.dylanrichmond.swype01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ConfirmationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Remains Constant
        super.onCreate(savedInstanceState);
        //Change layout to match class
        setContentView(R.layout.confirmationpage);

        final Button finishButton = findViewById(R.id.finish);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFig3();
            }
        });

        final Button reviewButton = findViewById(R.id.review);
        reviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToItemList();
            }
        });
    }

    private void goToFig3() {
        Intent figThree = new Intent(this, Fig3.class);
        startActivity(figThree);
    }

    private void goToItemList() {
        Intent itemList = new Intent(this, ItemList.class);
        startActivity(itemList);
    }
}
