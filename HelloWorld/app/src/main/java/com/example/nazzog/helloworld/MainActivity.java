package com.example.nazzog.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                IdiomaActivity idiomaActivity = idiomasAdapter.getItem(position);
                Toast.makeText(MainActivity.this, idiomaActivity.getHello(), Toast.LENGTH_SHORT).show();
                TextView text = (TextView) findViewById(R.id.olaMundo);
                text.setText(idiomaActivity.getHello());
            }
        });
    }

    private List<IdiomaActivity> gerarIdioma(){
        List<IdiomaActivity> idiomas = new ArrayList<IdiomaActivity>();
        idiomas.add(criarIdioma("Inglês", R.drawable.usa_flag, "Hello World!"));
        idiomas.add(criarIdioma("Alemão", R.drawable.deu_flag, "Hallo Welt!"));
        idiomas.add(criarIdioma("Italiano", R.drawable.italy_flag, "Ciao Mondo!"));
        idiomas.add(criarIdioma("Francês", R.drawable.france_flag, "Bonjour Tout Le Monde!"));
        idiomas.add(criarIdioma("Espanhol", R.drawable.spain_flag, "Hola Mundo!"));
        idiomas.add(criarIdioma("Japonês", R.drawable.japan_flag, "こんにちは世界"));


        return idiomas;
    }

    private IdiomaActivity criarIdioma(String nome, int imagem, String hello){
        IdiomaActivity idiomaActivity = new IdiomaActivity(nome, imagem, hello);
        return idiomaActivity;
    }
}