package br.com.cassio340.entities;

import br.com.cassio340.engine.Atacar;
import br.com.cassio340.entities.skills.Ataque;
import br.com.cassio340.entities.skills.Bonus;

import java.util.Set;
import java.util.TreeSet;

public abstract class Entidade implements Atacar {

    private String nome;
    private double hp;
    private double hpMax;
    private double forca;
    private double ataqueMagico;
    private Bonus bonus;
    private Set<Ataque> ataquePadrao = new TreeSet<>();

    public Entidade(String nome, double hp , double hpMax, double forca, double ataqueMagico, Bonus bonus, Ataque ataque) {

        this.nome = nome;
        this.hp = hp;
        this.hpMax = hpMax;
        this.forca = forca;
        this.ataqueMagico = ataqueMagico;
        this.bonus = bonus;
        this.ataquePadrao.add(ataque);
    }



    public String getNome() {
        return nome;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(Double hpMax) {

        this.hpMax = hpMax;
        this.hp = hpMax;
    }

    public double getHpMax() {
        return hpMax;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getAtaqueMagico() {
        return ataqueMagico;
    }

    public void setAtaqueMagico(double ataqueMagico) {
        this.ataqueMagico = ataqueMagico;
    }

    public boolean adicionarAtaque (Ataque ataque){
        if (ataquePadrao.size() >= 4){
            System.out.println("lista de ataques cheia");
            return false;

        }
        ataquePadrao.add(ataque);
        return true;
    }



    public Boolean estaVivo(Entidade entidade) {
        if (entidade.getHp() <= 0){
            System.out.println("GameOver");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade{" +
                "nome='" + nome + '\'' +
                ", hp=" + hp +
                ", hpMax=" + hpMax +
                ", forca=" + forca +
                ", mana=" + ataqueMagico +
                ", bonus=" + bonus +
                ", ataquesPadrao=" + ataquePadrao +
                '}';
    }
}
