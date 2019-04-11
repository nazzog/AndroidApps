package com.tiagoalvesmh.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etAlcool;
    private EditText etGasolina;
    private TextView tvResposta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAlcool = (EditText) findViewById(R.id.etAlcool);
        etGasolina = (EditText) findViewById(R.id.etGasolina);
        tvResposta = (TextView) findViewById(R.id.tvResposta);
    }

    public void calcularPreco(View view){
        //Recuperar os valores digitados
        String precoAlcool = etAlcool.getText().toString();
        String precoGasolina = etGasolina.getText().toString();

        //Validar os campos digitados
        Boolean camposValidados = this.validarCampos(precoAlcool, precoGasolina);
        if(camposValidados){
            this.calcularMelhorPreco(precoAlcool, precoGasolina);
        }
        else {
            tvResposta.setText("Preencha os campos com os valores do Álcool e Gasolina primeiro.");
        }
    }

    public void calcularMelhorPreco(String pAlcool, String pGasolina){
        //Converter calores string em numeros
        Double precoAlcool = Double.parseDouble(pAlcool);
        Double precoGasolina = Double.parseDouble(pGasolina);

        //Cálculo do melhor combustível a ser usado.
        //Se resultado maior ou igual a 0.7 melhor usar gaasolina
        Double resultado = precoAlcool / precoGasolina;
        if(resultado >= 0.7){
            tvResposta.setText("Melhor utilizar Gasolina!");
        }
        else
            tvResposta.setText("Melhor utilizar Álcool!");
    }

    public Boolean validarCampos(String pAlcool, String pGasolina){
        Boolean camposValidados = true;

        //Validar campos
        if (pAlcool==null || pAlcool.equals("")){
            camposValidados = false;
        }
        else if (pGasolina==null || pGasolina.equals("")){
            camposValidados = false;
        }

        return camposValidados;
    }
}
