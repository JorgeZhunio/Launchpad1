package com.example.familia.launchpad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class Principal extends AppCompatActivity implements View.OnClickListener{
    Button ingr;
    EditText us , con;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        us = (EditText) findViewById(R.id.usua);
        con = (EditText) findViewById(R.id.contra);
        ingr = (Button) findViewById(R.id.ing);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ing:
                Intent inte = new Intent(Principal.class, Secuindaria.this);
                startActivity(inte);
            break;
        }
    }
}
