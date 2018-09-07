package com.example.eider.origamea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Carro extends AppCompatActivity implements View.OnClickListener {

    Button btSiguiente, btAnterior;
    ImageView ivCarro;
    int[]carroId={
            R.drawable.carro1,
            R.drawable.carro2,
            R.drawable.carro3,
            R.drawable.carro4,
            R.drawable.carro5,
            R.drawable.carro6,
            R.drawable.carro7,
            R.drawable.carro8,
    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivCarro=(ImageView)(findViewById(R.id.ivCarro));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=carroId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(Carro.this,Transporte.class);
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
        ivCarro.setImageResource(carroId[i]);

    }
}
