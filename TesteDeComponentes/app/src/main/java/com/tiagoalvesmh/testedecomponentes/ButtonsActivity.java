package com.tiagoalvesmh.testedecomponentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class ButtonsActivity extends AppCompatActivity {

    //Declarando Componentes
    private EditText edit_text_nome;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        edit_text_nome = findViewById(R.id.editTextNome);
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
    }

    public void Gerar(View view){
        String nome = edit_text_nome.getText().toString();
        resposta.setText(nome + ", do sexo "+", fala os idiomas: ");
    }
}