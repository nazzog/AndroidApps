package com.tiagoalvesmh.testedecomponentes.model;

public class Filme {

    private String tituloFilme;
    private String ano;
    private String crono;

    public Filme(){

    }

    public Filme(String tituloFilme, String ano, String crono) {
        this.tituloFilme = tituloFilme;
        this.ano = ano;
        this.crono = crono;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCrono() {
        return crono;
    }

    public void setCrono(String crono) {
        this.crono = crono;
    }
}
