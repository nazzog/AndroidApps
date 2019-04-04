package com.tiagomh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alteraTexto(View view){
        int numero = new Random().nextInt(11);
        String numero_novo = String.valueOf(numero);
        TextView alteraMensagem = (TextView) findViewById(R.id.tv_mensagem);
        TextView alteraNumero = (TextView) findViewById(R.id.tv_numero);
        alteraMensagem.setText("O número sorteado é: ");
        alteraNumero.setText(numero_novo);
    }
}
