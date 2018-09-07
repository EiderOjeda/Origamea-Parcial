package com.example.eider.origamea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Tortuga extends AppCompatActivity implements View.OnClickListener {

    Button btSiguiente, btAnterior;
    ImageView ivTortuga;
    int[]tortugaId={
            R.drawable.tortuga1,
            R.drawable.tortuga2,
            R.drawable.tortuga3,
            R.drawable.tortuga4,
            R.drawable.tortuga5};
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tortuga);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivTortuga=(ImageView)(findViewById(R.id.ivTortuga));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=tortugaId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(Tortuga.this,Animales.class);
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
        ivTortuga.setImageResource(tortugaId[i]);
    }
}
