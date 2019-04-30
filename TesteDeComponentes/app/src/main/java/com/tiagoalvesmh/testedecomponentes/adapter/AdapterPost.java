package com.tiagoalvesmh.testedecomponentes.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tiagoalvesmh.testedecomponentes.R;
import com.tiagoalvesmh.testedecomponentes.model.Postagem;

import java.util.List;


public class AdapterPost extends RecyclerView.Adapter<AdapterPost.MyViewHolder> {

    private List<Postagem> postagens;

    public AdapterPost(List<Postagem> listaPost) {
        this.postagens = listaPost;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemLista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.postagem_detalhe, viewGroup, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Postagem postagem = postagens.get(i);

        myViewHolder.nome.setText(postagem.getNome());
        myViewHolder.postagem.setText(postagem.getPostagem());
        myViewHolder.imagem.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView nome;
        private TextView postagem;
        private ImageView imagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.tvNome);
            postagem = itemView.findViewById(R.id.tvDesc);
            imagem = itemView.findViewById(R.id.imgPost);
        }
    }

}

