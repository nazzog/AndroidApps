package com.tiagoalvesmh.testedecomponentes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
    }

    public void proxima(View view){
        Intent proxima = new Intent(this, ButtonsActivity.class);
        startActivity(proxima);
    }

    public void voltar(View view){
        Intent voltar = new Intent(this, MainActivity.class);
        startActivity(voltar);
    }
}