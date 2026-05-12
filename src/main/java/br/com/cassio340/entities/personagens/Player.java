package br.com.cassio340.entities.personagens;

import br.com.cassio340.entities.skills.Bonus;
import br.com.cassio340.entities.Entidade;
import br.com.cassio340.entities.skills.Ataque;

public  class Player extends Entidade {

    public Player(String nome, double hp, double hpMax, double forca, double ataqueMagico, Bonus bonus,Ataque ataque) {
        super(nome,hp,hpMax, forca, ataqueMagico,bonus,ataque);

    }
    public String atacar (Entidade inimigo, Ataque ataque){
        return "inimigo tomou dano";
    }

}
