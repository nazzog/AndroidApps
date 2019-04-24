package com.tiagoalvesmh.testedecomponentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.tiagoalvesmh.testedecomponentes.adapter.Adapter;
import com.tiagoalvesmh.testedecomponentes.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = findViewById(R.id.recyclerView);

        //Cria filmes
        this.criarFilmes();

        //Adapter
        Adapter adapter = new Adapter(listaFilmes);

        //Conf RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        //Eventos de Clique
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getApplicationContext(), "Mantenha pressionado para revelar o Vilão!", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onLongItemClick(View view, int position) {
                Filme vilao = listaFilmes.get(position);
                Toast.makeText(getApplicationContext(), vilao.getVilao(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        }));
    }

    public void criarFilmes(){
        Filme filme = new Filme("Capitão América: O Primeiro Vingador", "2011", "1945", "CAVEIRA VERMELHA");
        this.listaFilmes.add(filme);

        filme = new Filme("Capitã Marvel", "2019", "Década de 90", "YON-ROGG");
        this.listaFilmes.add(filme);

        filme = new Filme("Homem de Ferro", "2008", "2010", "OBADIAH STANE/IRON MONGER");
        this.listaFilmes.add(filme);

        filme = new Filme("Homem de Ferro 2", "2015", "2011", "WHIPLASH");
        this.listaFilmes.add(filme);

        filme = new Filme("O Incrível Hulk", "2008", "2011", "ABOMINÁVEL");
        this.listaFilmes.add(filme);

        filme = new Filme("Thor", "2011", "2011", "LOKI");
        this.listaFilmes.add(filme);

        filme = new Filme("Os Vingadores", "2012", "2012", "LOKI");
        this.listaFilmes.add(filme);

        filme = new Filme("Homem de Ferro 3", "2013", "2012", "MANDARIM");
        this.listaFilmes.add(filme);

        filme = new Filme("Thor: O Mundo Sombrio", "2013", "2013", "MALEKITH");
        this.listaFilmes.add(filme);

        filme = new Filme("Capitão América: O Soldado Invernal", "2014", "2014", "BUCKY");
        this.listaFilmes.add(filme);

        filme = new Filme("Guardiões da Galáxia", "2014", "2014", "RONAN");
        this.listaFilmes.add(filme);

        filme = new Filme("Guardiões da Galáxia Vol. 2", "2017", "2014", "EGO");
        this.listaFilmes.add(filme);

        filme = new Filme("Vingadores: Era de Ultron", "2015", "2015", "ULTRON");
        this.listaFilmes.add(filme);

        filme = new Filme("Homem-Formiga", "2015", "2015", "DARREN CROSS/JAQUETA AMARELA");
        this.listaFilmes.add(filme);

        filme = new Filme("Capitão América: Guerra Civil", "2016", "2016", "HELMUT ZEMO");
        this.listaFilmes.add(filme);

        filme = new Filme("Homem-Aranha: De Volta ao Lar", "2017", "2016", "ABUTRE");
        this.listaFilmes.add(filme);

        filme = new Filme("Doutor Estranho", "2016", "2016-17", "KAECILIUS e DORMAMMU");
        this.listaFilmes.add(filme);

        filme = new Filme("Pantera Negra", "2018", "2017", "ERIK KILLMONGER");
        this.listaFilmes.add(filme);

        filme = new Filme("Thor: Ragnarok", "2017", "2017", "HELA");
        this.listaFilmes.add(filme);

        filme = new Filme("Vingadores: Guerra Infinita", "2018", "2017", "THANOS");
        this.listaFilmes.add(filme);

        filme = new Filme("Homem-Formiga e a Vespa", "2018", "2017", "GHOST");
        this.listaFilmes.add(filme);

        filme = new Filme("Vingadores: Ultimato", "2019", "201?", "THANOS");
        this.listaFilmes.add(filme);
    }
}
