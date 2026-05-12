package br.com.cassio340.engine;

import br.com.cassio340.entities.Entidade;
import br.com.cassio340.entities.skills.Ataque;

public interface Atacar {
    public String atacar (Entidade oponente, Ataque ataque);
}
