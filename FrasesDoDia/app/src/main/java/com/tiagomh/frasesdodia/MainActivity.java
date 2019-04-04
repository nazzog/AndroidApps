package com.tiagomh.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void geraFrase(View view){
        String[] frases = {
                "Você não só tem o direito de ser feliz como também tem a obrigação de lutar para alcançar a felicidade.",
                "Encare o que fez de errado com motivação, pois é isso que o ajudará a fazer certo da próxima vez.",
                "Antes de você falar, ouça. Antes de agir, pense. Antes de criticar, conheça. E antes de desistir, tente.",
                "Não culpe a vida por todas as coisas que aconteceram a você; muitas dores são causadas pelos nossos próprios erros.",
                "O mais importante da vida não é a situação em que estamos, mas a direção para a qual nos movemos.",
                "Cada um escolhe o caminho que quer, mas aproveita a vista que pode."
        };

        int indice = new Random().nextInt(frases.length);

        TextView nova_frase = (TextView) findViewById(R.id.tv_nova_frase);
        nova_frase.setText(frases[indice]);
    }
}
