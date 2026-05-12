package br.com.cassio340.entities.inimigos;

import br.com.cassio340.entities.skills.Bonus;
import br.com.cassio340.entities.Entidade;
import br.com.cassio340.entities.skills.Ataque;

public  class Inimigo extends Entidade {
    private NivelDificuldade nivel;
    public Inimigo(String nome, double hp, double hpMax, double forca, double ataqueMagico, Bonus bonus, Ataque ataque,NivelDificuldade nivel) {
        super(nome,hp,hpMax,forca,ataqueMagico,bonus,ataque);
        this.nivel = nivel;

    }

    public NivelDificuldade getNivel() {
        return nivel;
    }

    public String atacar (Entidade jogador, Ataque ataque){
        return "jogador tomu dano";
    }

}
