package com.tiagoalvesmh.testedecomponentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.tiagoalvesmh.testedecomponentes.adapter.AdapterPost;
import com.tiagoalvesmh.testedecomponentes.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class CardviewActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        /*
        * DEFINE UM LAYOUT EM GRID
        * RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        * */

        //DEFINE LAYOUT LINEAR
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        ((LinearLayoutManager) layoutManager).setOrientation(LinearLayout.HORIZONTAL);

        recyclerPostagem.setLayoutManager(layoutManager);

        //DEFINE ADAPTADOR
        this.prepararPostagem();

        AdapterPost adapter = new AdapterPost(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagem(){
        Postagem p = new Postagem("Tiago", "#viagem", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Bibiana", "#trip", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Hotel TAM", "paris", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Shun", "Foto linda", R.drawable.imagem4);
        this.postagens.add(p);
    }
}
