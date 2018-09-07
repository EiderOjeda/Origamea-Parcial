package com.example.eider.origamea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Roca extends AppCompatActivity implements View.OnClickListener {

    Button btSiguiente, btAnterior;
    ImageView ivRoca;
    int[]rocaId={
            R.drawable.roca1,
            R.drawable.roca2,

    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roca);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivRoca=(ImageView)(findViewById(R.id.ivRoca));


        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=rocaId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(Roca.this,Otros.class);
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
        ivRoca.setImageResource(rocaId[i]);

    }
}
