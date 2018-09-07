package com.example.eider.origamea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Corbata extends AppCompatActivity implements View.OnClickListener {

    Button btSiguiente, btAnterior;
    ImageView ivCorbata;
    int[]corbataId={
            R.drawable.corbata1,
            R.drawable.corbata2,
            R.drawable.corbata3,
            R.drawable.corbata4,
            R.drawable.corbata5,
            R.drawable.corbata6,
            R.drawable.corbata7,
            R.drawable.corbata8,
            R.drawable.corbata9,
            R.drawable.corbata10,
            R.drawable.corbata11,
    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corbata);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivCorbata=(ImageView)(findViewById(R.id.ivCorbata));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=corbataId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(Corbata.this,Otros.class);
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
        ivCorbata.setImageResource(corbataId[i]);

    }
}
