package com.dewofyouryouth.mixology;

import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

// Sends user to the the "add_drink.xml" layout
    public void goToAddDrink(View view){
        setContentView(R.layout.add_drink);

    }

// Sends user to the "see_drinks.xml" layout
    public void goToSeeDrinks(View view){
        setContentView(R.layout.see_drinks);

    }

// Sends user back to "activity_main.xml" layout
    public void  backToMain(View view){
        setContentView(R.layout.activity_main);
    }

}
