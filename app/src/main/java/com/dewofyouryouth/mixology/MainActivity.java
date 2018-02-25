package com.dewofyouryouth.mixology;

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

    public void goToAddDrink(View view){
        setContentView(R.layout.add_drink);

    }

    public void goToSeeDrinks(View view){
        setContentView(R.layout.see_drinks);

    }

    public void  backToMain(View view){
        setContentView(R.layout.activity_main);
    }

    public void addDrink(View view){

    }

}
