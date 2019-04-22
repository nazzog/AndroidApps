package com.tiagoalvesmh.testedecomponentes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ButtonsActivity extends AppCompatActivity {

    //Declarando Componentes
    private EditText edit_text_nome;
    private RadioGroup sexo;
    private String radio;
    private RadioButton radio_masc;
    private RadioButton radio_fem;
    private CheckBox box_por;
    private CheckBox box_ing;
    private CheckBox box_esp;
    private CheckBox box_fra;
    private CheckBox box_ale;
    private CheckBox box_ita;
    private Switch dark_mode;
    private EditText numero;
    private TextView percentNum;
    private SeekBar seek_bar;
    private TextView percentResposta;
    private TextView resposta;
    private double percent;

    //Outras variaveis
    List<String> cb_list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        edit_text_nome = findViewById(R.id.editTextNome);
        sexo = findViewById(R.id.radioGroupSexo);
        radio_masc = findViewById(R.id.radioMasculino);
        radio_fem = findViewById(R.id.radioFeminino);
        box_por = findViewById(R.id.checkBoxPor);
        box_ing = findViewById(R.id.checkBoxIng);
        box_esp = findViewById(R.id.checkBoxEsp);
        box_fra = findViewById(R.id.checkBoxFra);
        box_ale = findViewById(R.id.checkBoxAle);
        box_ita = findViewById(R.id.checkBoxIta);
        dark_mode = findViewById(R.id.switchDark);
        numero = findViewById(R.id.editTextNum);
        percentNum = findViewById(R.id.textViewPorcent);
        seek_bar = findViewById(R.id.seekBarPorcent);
        percentResposta = findViewById(R.id.textViewPorcentResposta);
        resposta = findViewById(R.id.textResposta);

        //Verifica RadioButtons
        verificaRadio();

        seek_bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                percent = seekBar.getProgress();
                percentNum.setText(percent+"%");
                calcularPorcentagem();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void Gerar(View view){
        //Recupera o nome digitado.
        String nome = edit_text_nome.getText().toString();

        //Método para verificação do CheckBox.
        verificaCheck();

        verificaSwitch();

        resposta.setText(nome + ", do sexo "+radio+", fala os idiomas: " + cb_list);
    }

    public void verificaCheck(){
        cb_list.clear();

        if(box_por.isChecked()){
            cb_list.add(box_por.getText().toString());
        }
        if(box_ing.isChecked()){
            cb_list.add(box_ing.getText().toString());
        }
        if(box_esp.isChecked()){
            cb_list.add(box_esp.getText().toString());
        }
        if(box_fra.isChecked()){
            cb_list.add(box_fra.getText().toString());
        }
        if(box_ale.isChecked()){
            cb_list.add(box_ale.getText().toString());
        }
        if(box_ita.isChecked()){
            cb_list.add(box_ita.getText().toString());
        }
    }

    public void verificaRadio(){
        sexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //variavel 'checkedId' retorna o id do componente no RadioGroup
                if(checkedId == R.id.radioMasculino){
                    radio = radio_masc.getText().toString();
                }

                if(checkedId == R.id.radioFeminino){
                    radio = radio_fem.getText().toString();
                }
            }
        });
    }

    public void verificaSwitch(){
        if(dark_mode.isChecked()){
            Toast.makeText(this, "Você está no modo DARK!", Toast.LENGTH_LONG).show();
        } else{

        }
    }

    public void calcularPorcentagem(){
        double valor = Double.parseDouble(numero.getText().toString());
        double total = valor * (percent/100);
        percentResposta.setText("Resultado: "+total);
    }

    public void proxima(View view){
        Intent proxima = new Intent(this, ListviewActivity.class);
        startActivity(proxima);
    }

    public void voltar(View view){
        Intent voltar = new Intent(this, TextActivity.class);
        startActivity(voltar);
    }
}