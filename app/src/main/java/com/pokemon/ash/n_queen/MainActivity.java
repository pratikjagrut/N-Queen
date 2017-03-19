package com.pokemon.ash.n_queen;


import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    TextView tv1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.textView);
        b1=(Button)findViewById(R.id.fade);
        Typeface face=Typeface.createFromAsset(getAssets(),"fonts/MinecraftEvenings.otf");
        tv1.setTypeface(face);
        b1.setTypeface(face);
    }


    public void launchdelay()
    {
        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {

                        Intent i=new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(i);
                    }
                }, 1000);
    }
    public void fade(View view){
        ImageView image = (ImageView)findViewById(R.id.frontimage);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade);
        image.startAnimation(animation1);
        tv1.startAnimation(animation1);
        launchdelay();
    }
}

