package com.tiagomh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int i;
    private String n_um, n_dois, n_tres, n_quatro, n_cinco, n_seis;
    private int[] aposta = new int[6];
    private TextView um, dois, tres, quatro, cinco, seis, alteraMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alteraMensagem = findViewById(R.id.tv_mensagem);
        um = findViewById(R.id.tv_Um);
        dois = findViewById(R.id.tv_Dois);
        tres = findViewById(R.id.tv_Tres);
        quatro = findViewById(R.id.tv_Quatro);
        cinco = findViewById(R.id.tv_Cinco);
        seis = findViewById(R.id.tv_Seis);
    }

    public void alteraTexto(View view){
        alteraMensagem.setText("Os números sorteados são: ");

        for(i=0; i<6; i++){
            aposta[i] = new Random().nextInt(60)+1;
        }
        Arrays.sort(aposta);
        n_um = String.valueOf(aposta[0]);
        um.setText(n_um);
        n_dois = String.valueOf(aposta[1]);
        dois.setText(n_dois);
        n_tres = String.valueOf(aposta[2]);
        tres.setText(n_tres);
        n_quatro = String.valueOf(aposta[3]);
        quatro.setText(n_quatro);
        n_cinco = String.valueOf(aposta[4]);
        cinco.setText(n_cinco);
        n_seis = String.valueOf(aposta[5]);
        seis.setText(n_seis);
    }
}
