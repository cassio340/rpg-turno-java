package br.com.cassio340.factory;

import br.com.cassio340.entities.inimigos.Inimigo;
import br.com.cassio340.entities.inimigos.NivelDificuldade;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InimigoFactory {
    private static final Random rnd = new Random();
    private static final List<Inimigo> inimigos =
            LeitorJson.lerJson("src//main//resources//inimigos.json",Inimigo.class);


    public static Inimigo gerarInimigo(NivelDificuldade nivel){
        List <Inimigo> inimigosNivelados = new ArrayList<>();

        for (Inimigo inimigo : inimigos){
            if(inimigo.getNivel() == nivel){

                inimigosNivelados.add(inimigo);
            }
        }
        if (inimigosNivelados.isEmpty()){
            throw new IllegalArgumentException("Nenhum inimigo encontrado para o nivel");
        }
        Inimigo inimigo = inimigosNivelados.get (rnd.nextInt(inimigosNivelados.size()));
        return inimigo;

    }
}
