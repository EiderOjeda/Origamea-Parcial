package com.example.eider.origamea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Pez extends AppCompatActivity implements View.OnClickListener {

    Button btSiguiente, btAnterior;
    ImageView ivPez;
    int[]pezId={
            R.drawable.pez1,
            R.drawable.pez2,
            R.drawable.pez3,
            R.drawable.pez4,
            R.drawable.pez5,
            R.drawable.pez6,
            R.drawable.pez7,
            R.drawable.pez8,
    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pez);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivPez=(ImageView)(findViewById(R.id.ivPez));


        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=pezId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(Pez.this,Animales.class);
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
        ivPez.setImageResource(pezId[i]);

    }
}
