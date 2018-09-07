package com.example.eider.origamea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Animales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);
    }

    public void onclick(View view){

        Intent miIntent=new Intent(Animales.this,CategoriaFiguras.class);
        startActivity(miIntent);
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(Animales.this,Perro.class);
        startActivity(miIntent);
    }
    public void onclick2(View view){

        Intent miIntent=new Intent(Animales.this,Tortuga.class);
        startActivity(miIntent);
    }
    public void onclick3(View view){

        Intent miIntent=new Intent(Animales.this,Pez.class);
        startActivity(miIntent);
    }
}
