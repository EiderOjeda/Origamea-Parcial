package com.example.eider.origamea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Transporte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte);
    }

    public void onclick(View view){

        Intent miIntent=new Intent(Transporte.this,CategoriaFiguras.class);
        startActivity(miIntent);
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(Transporte.this,Carro.class);
        startActivity(miIntent);
    }

    public void onclick2(View view){

        Intent miIntent=new Intent(Transporte.this,Barco.class);
        startActivity(miIntent);
    }

    public void onclick3(View view){

        Intent miIntent=new Intent(Transporte.this,Avion.class);
        startActivity(miIntent);
    }
}
