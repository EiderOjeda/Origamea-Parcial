package com.example.eider.origamea;

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

    public void onClick(View view) {

        Intent miIntent=new Intent(MainActivity.this,CategoriaFiguras.class);
        startActivity(miIntent);

    }

    public void onClick1(View view) {

        Intent miIntent=new Intent(MainActivity.this,Instrucciones.class);
        startActivity(miIntent);

    }
}
