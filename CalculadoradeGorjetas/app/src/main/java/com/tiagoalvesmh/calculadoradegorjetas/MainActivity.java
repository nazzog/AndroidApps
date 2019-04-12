package com.tiagoalvesmh.calculadoradegorjetas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_valor;
    private TextView tv_porcentagem;
    private TextView tv_gorjeta;
    private TextView tv_total;
    private SeekBar sk_gorjeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_valor = findViewById(R.id.etValor);
        tv_porcentagem = findViewById(R.id.tvPorcentagem);
        tv_gorjeta = findViewById(R.id.tvGorjeta);
        tv_total = findViewById(R.id.tvTotal);
        sk_gorjeta = findViewById(R.id.skGorjeta);

        sk_gorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int porcentagem = seekBar.getProgress();
                tv_porcentagem.setText(porcentagem + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
