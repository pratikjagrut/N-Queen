package com.pokemon.ash.n_queen;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.ImageView;


public class Main2Activity extends AppCompatActivity {
    public ImageView image1;
    public Button b2;
    public Button b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Typeface face1=Typeface.createFromAsset(getAssets(), "fonts/MinecraftEvenings.otf");
        image1 =(ImageView)findViewById(R.id.backimage);
        b2=(Button)findViewById(R.id.play);
        b3=(Button)findViewById(R.id.tutorial);
        b2.setTypeface(face1);
        b3.setTypeface(face1);

    }

    public void tutorial(View view){
        Intent i=new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(i);
    }

}

