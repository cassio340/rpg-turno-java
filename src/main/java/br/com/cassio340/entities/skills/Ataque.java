package br.com.cassio340.entities.skills;

public class Ataque {
    private String nome;
    private double dano;
    private Bonus bonus;
    public Ataque(String nome, double dano, Bonus bonus) {
        this.nome = nome;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public double getDano() {
        return dano;
    }

}
