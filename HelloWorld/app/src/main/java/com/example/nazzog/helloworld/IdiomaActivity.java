package com.example.nazzog.helloworld;

/**
 * Created by nazzog on 07/06/17.
 */

public class IdiomaActivity {
    private String nome;
    private int imagem;

    public IdiomaActivity(){
    }

    public IdiomaActivity(String nome, int imagem){
        super();
        this.nome = nome;
        this.imagem = imagem;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getImagem(){
        return imagem;
    }

    public void setImagem(int imagem){
        this.imagem = imagem;
    }

    @Override
    public String toString(){
        return nome;
    }
}
