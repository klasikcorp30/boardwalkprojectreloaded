package com.example.klasik.boardwalkapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show_item_info(View view){
        Intent show_view=new Intent(this, Menu_Items.class);
        startActivity(show_view);
    }


}
