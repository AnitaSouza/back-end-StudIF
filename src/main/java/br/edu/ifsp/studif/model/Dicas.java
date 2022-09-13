package br.edu.ifsp.studif.model;

public class Dicas {
    private static int idCounter = 0;

    private int id;
    private String nome;
    private String dica;
    private String data;

    public Dicas() {
        this.id = ++Dicas.idCounter;
        this.nome = "Anônimo";
    }

    public Dicas(String nome, String dica, String data) {
        this.id = ++Dicas.idCounter;
        this.nome = nome;
        this.dica = dica;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

