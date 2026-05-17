package br.com.cassio340.entities.skills;

public class Ataque {
    private int id;
    private String nome;
    private double dano;
    private Bonus bonus;
    public Ataque(String nome, double dano, Bonus bonus,int id) {
        this.nome = nome;
        this.dano = dano;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }


    public double getDano() {
        return dano;
    }

    @Override
    public String toString() {
        return "Ataque{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dano=" + dano +
                ", bonus=" + bonus +
                '}';
    }
}

