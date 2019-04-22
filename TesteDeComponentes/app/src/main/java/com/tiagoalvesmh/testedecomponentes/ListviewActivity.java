package com.tiagoalvesmh.testedecomponentes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListviewActivity extends AppCompatActivity {

    private ListView list_locais;
    private String[] itens = {
            "Alegrete", "Bagé", "Carazinho", "Dilermando de Aguiar",
            "Estrela", "Santa Maria", "São Sepé"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        list_locais = findViewById(R.id.listLocais);

        //Adapter
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1, itens);
        list_locais.setAdapter(adaptador);

        list_locais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String select = list_locais.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), select, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void proxima(View view){
        Intent proxima = new Intent(this, RecyclerActivity.class);
        startActivity(proxima);
    }

    public void voltar(View view){
        Intent voltar = new Intent(this, ButtonsActivity.class);
        startActivity(voltar);
    }
}
