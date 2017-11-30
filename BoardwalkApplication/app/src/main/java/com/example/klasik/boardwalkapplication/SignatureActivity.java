package com.example.klasik.boardwalkapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.klasik.boardwalkapplication.Menu_Items;

public class SignatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signature);

    }
    String name="Signature Crunhy Tuna";
    String description="Flaked Tuna, raisins and carrots in the perfect filling for your tuna";
    int cost=400;

    Menu_Items signature= new Menu_Items(name, description, cost);



}
