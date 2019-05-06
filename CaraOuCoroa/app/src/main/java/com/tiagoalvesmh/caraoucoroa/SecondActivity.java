package com.tiagoalvesmh.caraoucoroa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    private Button voltar;
    private ImageView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        voltar = findViewById(R.id.bttVoltar);
        resultado = findViewById(R.id.imgResultado);

        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("num");

        if(numero == 0){
            resultado.setImageResource(R.drawable.moeda_cara);
        }
        else{
            resultado.setImageResource(R.drawable.moeda_coroa);
        }

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
