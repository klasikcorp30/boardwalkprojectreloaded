package com.example.klasik.boardwalkapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public String username= "admin";
    public String password= "administrator";

    public void signIn(View view){
        TextView user= (TextView) findViewById(R.id.username);
        TextView pass=(TextView) findViewById(R.id.password);
        if(user.getText().toString().equalsIgnoreCase(username) && pass.getText().toString().equalsIgnoreCase(password)){
            Intent i= new Intent(this, MainActivity.class);
            startActivity(i);
        }else{
            return;
        }
    }
}
