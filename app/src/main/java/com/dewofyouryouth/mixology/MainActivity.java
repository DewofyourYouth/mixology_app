package com.dewofyouryouth.mixology;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

// Sends user to the the "add_drink.xml" layout
    public void goToAddDrink(View view){
        Intent i = new Intent(this, AddDrink.class);
        startActivity(i);
    }

// Sends user to the "see_drinks.xml" layout
    public void goToSeeDrinks(View view){
        Intent i = new Intent(this, SeeDrinks.class);
        startActivity(i);
    }




}
