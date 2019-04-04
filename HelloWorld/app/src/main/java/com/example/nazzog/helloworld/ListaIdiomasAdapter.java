package com.example.nazzog.helloworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nazzog on 07/06/17.
 */

public class ListaIdiomasAdapter extends ArrayAdapter<IdiomaActivity>{
    private Context context;
    private List<IdiomaActivity> idiomas = null;

    public ListaIdiomasAdapter(Context context, List<IdiomaActivity> idiomas){
        super(context, 0, idiomas);
        this.idiomas = idiomas;
        this.context = context;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent){
        IdiomaActivity idiomaActivity = idiomas.get(position);
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.activity_list_idiomas, null);
        }
        ImageView imageViewIdioma = (ImageView) view.findViewById(R.id.image_view_flag);
        imageViewIdioma.setImageResource(idiomaActivity.getImagem());

        TextView textViewNomeIdioma = (TextView) view.findViewById(R.id.text_view_name);
        textViewNomeIdioma.setText(idiomaActivity.getNome());

        return view;
    }
}
