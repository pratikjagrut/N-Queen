package com.pokemon.ash.n_queen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    public EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        e=(EditText) findViewById(R.id.editText);
    }

    public void solution(View view) {
        String s = e.getText().toString();
        Intent i = new Intent(Main3Activity.this, SolutionActivity.class);
        i.putExtra("dimension", s);
        startActivity(i);
    }
}
