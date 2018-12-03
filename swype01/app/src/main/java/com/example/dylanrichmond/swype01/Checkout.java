package com.example.dylanrichmond.swype01;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Checkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Remains Constant
        super.onCreate(savedInstanceState);
        //Change layout to match class
        setContentView(R.layout.checkout);

        final ImageButton backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToItemList();
            }
        });

        final Button confirmButton = findViewById(R.id.Finish);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToConfirmationPage();
            }
        });
    }

    private void goToItemList() {
        Intent itemList = new Intent(this, ItemList.class);
        startActivity(itemList);
    }

    private void goToConfirmationPage() {
        Intent confirmPage = new Intent(this, ConfirmationPage.class);
        startActivity(confirmPage);
    }

}
