package com.example.eider.origamea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Avion extends AppCompatActivity implements View.OnClickListener {

    Button btSiguiente, btAnterior;
    ImageView ivAvion;
    int[]avionId={
            R.drawable.avion1,
            R.drawable.avion2,
            R.drawable.avion3,
            R.drawable.avion4,
            R.drawable.avion5,
            R.drawable.avion6,
            R.drawable.avion7,

    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avion);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivAvion=(ImageView)(findViewById(R.id.ivAvion));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=avionId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(Avion.this,Transporte.class);
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
        ivAvion.setImageResource(avionId[i]);

    }
}
