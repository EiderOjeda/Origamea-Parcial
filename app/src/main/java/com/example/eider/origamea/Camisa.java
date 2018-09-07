package com.example.eider.origamea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Camisa extends AppCompatActivity implements View.OnClickListener {

    Button btSiguiente, btAnterior;
    ImageView ivCamisa;
    int[]camisaId={
            R.drawable.camisa1,
            R.drawable.camisa2,
            R.drawable.camisa3,
            R.drawable.camisa4,
            R.drawable.camisa5,
            R.drawable.camisa6,

    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camisa);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivCamisa=(ImageView)(findViewById(R.id.ivCamisa));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=camisaId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(Camisa.this,Otros.class);
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
        ivCamisa.setImageResource(camisaId[i]);

    }
}
