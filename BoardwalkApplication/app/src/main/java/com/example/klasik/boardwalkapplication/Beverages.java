package com.example.klasik.boardwalkapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Beverages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);
    }

    public void milkshake(View view){
        Intent intent=new Intent(this, Milkshake.class);
        startActivity(intent);
    }
    public void coffee(View view){
        Intent coffee=new Intent(this, Coffee.class);
        startActivity(coffee);
    }
    public void smoothie(View view){
        Intent smoothie=new Intent(this, Smoothie.class);
        startActivity(smoothie);
    }
}
