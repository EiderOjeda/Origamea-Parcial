package com.example.eider.origamea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Barco extends AppCompatActivity implements View.OnClickListener {

    Button btSiguiente, btAnterior;
    ImageView ivBarco;
    int[]barcoId={
            R.drawable.barco1,
            R.drawable.barco2,
            R.drawable.barco3,
            R.drawable.barco4,
            R.drawable.barco5,
            R.drawable.barco6,
            R.drawable.barco7,
            R.drawable.barco8,
            R.drawable.barco9,
            R.drawable.barco10,
            R.drawable.barco11,
            R.drawable.barco12,
    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barco);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivBarco=(ImageView)(findViewById(R.id.ivBarco));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=barcoId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(Barco.this,Transporte.class);
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
        ivBarco.setImageResource(barcoId[i]);

    }
}
