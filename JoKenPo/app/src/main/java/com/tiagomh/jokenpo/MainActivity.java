package com.tiagomh.jokenpo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int pontos_jogador = 0;
    private int pontos_computador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionaPedra(View view){
        this.opcaoSelecionada("Pedra");
    }

    public void selecionaPapel(View view){
        this.opcaoSelecionada("Papel");
    }

    public void selecionaTesoura(View view){
        this.opcaoSelecionada("Tesoura");
    }

    public void opcaoSelecionada(String opcao){
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        int numero = new Random().nextInt(3);
        String escolha_app = opcoes[numero];

        TextView score_jogador = (TextView) findViewById(R.id.tv_score_player);
        TextView score_computador = (TextView) findViewById(R.id.tv_score_cpu);
        ImageView img_escolha = (ImageView) findViewById(R.id.img_escolha_app);
        TextView resultado = (TextView) findViewById(R.id.tv_opcao);

        //Altera imagem para a escolha do App.
        if(numero == 0){
            img_escolha.setImageResource(R.drawable.pedra);
        }
        if(numero == 1){
            img_escolha.setImageResource(R.drawable.papel);
        }
        if(numero == 2){
            img_escolha.setImageResource(R.drawable.tesoura);
        }

        //Duelo
        //Jogador Perde
        if(
                (escolha_app=="Pedra" && opcao =="Tesoura") ||
                (escolha_app=="Papel" && opcao =="Pedra") ||
                (escolha_app=="Tesoura" && opcao =="Papel")
            ){
            pontos_computador += 1;
            String cpu = String.valueOf(pontos_computador);
            score_computador.setText(cpu);
            resultado.setText("Você Perdeu!");
        }
        //Jogador Vence
        else if (
                (opcao =="Pedra" && escolha_app=="Tesoura") ||
                (opcao =="Papel" && escolha_app=="Pedra") ||
                (opcao =="Tesoura" && escolha_app=="Papel")
            ){
            pontos_jogador += 1;
            String player = String.valueOf(pontos_jogador);
            score_jogador.setText(player);
            resultado.setText("Você Ganhou!");
        }
        //Empate
        else
            resultado.setText("Empate!");
    }
}
