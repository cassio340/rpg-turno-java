package br.com.cassio340.factory;

import br.com.cassio340.entities.skills.Ataque;

import java.util.List;

public class AtaqueFactory {
    private static final List<Ataque> ataques =
            LeitorJson.lerJson("src//main//resources//Ataques.json", Ataque.class);

}
