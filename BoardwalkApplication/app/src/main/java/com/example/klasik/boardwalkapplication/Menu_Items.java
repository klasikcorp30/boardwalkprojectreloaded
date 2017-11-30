package com.example.klasik.boardwalkapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu_Items extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__items);
    }
    //Code starts new activity for each menu item------------------------

    public void Signature(View view){
        Intent intent=new Intent(this, SignatureActivity.class);
        startActivity(intent);
    }
    public void Turkey(View view){
        Intent turkey=new Intent(this, TurkeyActivity.class);
        startActivity(turkey);
    }
    public void Chicken(View view){
        Intent chicken=new Intent(this, ChickenActivity.class);
        startActivity(chicken);
    }

    //------------------------------------------------------------------

    private String name,description;
    private int cost;
    public Menu_Items(){}

    public Menu_Items(String name, String description, int cost){
        this.name=name;
        this.cost=cost;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String toString(){
        return  "Item name: "+getName()+"/n"+
                "description: "+getDescription()+"/n"+
                "Cost: "+getCost()+"/n";
    }
}
