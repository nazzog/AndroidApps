package com.example.nazzog.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview = (ListView) findViewById(R.id.listaidiomas);
        List<IdiomaActivity> idiomas = gerarIdioma();

        final ListaIdiomasAdapter idiomasAdapter = new ListaIdiomasAdapter(this, idiomas);
        listview.setAdapter(idiomasAdapter);
    }

    private List<IdiomaActivity> gerarIdioma(){
        List<IdiomaActivity> idiomas = new ArrayList<IdiomaActivity>();
        idiomas.add(criarIdioma("Inglês", R.drawable.usa_flag));
        idiomas.add(criarIdioma("Alemão", R.drawable.deu_flag));
        idiomas.add(criarIdioma("Italiano", R.drawable.italy_flag));
        idiomas.add(criarIdioma("Francês", R.drawable.france_flag));
        idiomas.add(criarIdioma("Espanhol", R.drawable.spain_flag));
        idiomas.add(criarIdioma("Japonês", R.drawable.japan_flag));


        return idiomas;
    }

    private IdiomaActivity criarIdioma(String nome, int imagem){
        IdiomaActivity idiomaActivity = new IdiomaActivity(nome, imagem);
        return idiomaActivity;
    }
}