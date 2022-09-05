package model;

public class Dicas {
    private static int idCounter = 0;

    private int id;
    private String nome;
    private String dica;
    private int data;
   
    public Dicas(){
        this.id = ++Dicas.idCounter;
        this.nome = "Anônimo";
    }
    
    public Dicas(int id, String nome, String dica, int data) {
        this.id = id;
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

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    } 
}

    
    
    

