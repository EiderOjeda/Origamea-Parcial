package com.example.eider.origamea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Perro extends AppCompatActivity implements View.OnClickListener {

    Button btSiguiente, btAnterior;
    ImageView ivPerro;
    int[]perroId={
            R.drawable.perro1,
            R.drawable.perro2,
            R.drawable.perro3,
            R.drawable.perro4,
            R.drawable.perro5,
            R.drawable.perro6,};
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perro);
        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivPerro=(ImageView)(findViewById(R.id.ivPerro));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=perroId.length;


    }

    public void onclick1(View view){

        Intent miIntent=new Intent(Perro.this,Animales.class);
        startActivity(miIntent);
    }

    @Override
    public void onClick(View view) {

        int id=view.getId();
        if(id==R.id.btSiguiente){
            i++;
            if (i==total) i=0;

        }
        if(id==R.id.btAnterior){
            i--;
            if (i==-1)i=total-1;

        }
        ivPerro.setImageResource(perroId[i]);

    }
}
