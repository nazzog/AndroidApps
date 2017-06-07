package com.example.nazzog.helloworld;

/**
 * Created by nazzog on 07/06/17.
 */

public class IdiomaActivity {
    private String nome;
    private int imagem;
    private String hello;

    public IdiomaActivity(){
    }

    public IdiomaActivity(String nome, int imagem, String hello){
        super();
        this.nome = nome;
        this.imagem = imagem;
        this.hello = hello;
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

    public String getHello(){
        return hello;
    }

    public void setHello(String hello){
        this.hello = hello;
    }

    @Override
    public String toString(){
        return nome;
    }
}
