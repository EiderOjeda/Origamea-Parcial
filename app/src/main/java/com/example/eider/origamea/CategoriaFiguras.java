package com.example.eider.origamea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CategoriaFiguras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_figuras);
    }

    public void onclick(View view){

        Intent miIntent=new Intent(CategoriaFiguras.this,MainActivity.class);
        startActivity(miIntent);
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(CategoriaFiguras.this,Animales.class);
        startActivity(miIntent);
    }
    public void onclick2(View view){

        Intent miIntent=new Intent(CategoriaFiguras.this,Transporte.class);
        startActivity(miIntent);
    }
    public void onclick3(View view){

        Intent miIntent=new Intent(CategoriaFiguras.this,Otros.class);
        startActivity(miIntent);
    }
}
