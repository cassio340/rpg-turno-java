package br.com.cassio340.factory;

import br.com.cassio340.entities.skills.Ataque;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class AtaqueFactory {
    private static final Random rnd = new Random();
    private static final List<Ataque> ataquesList =
            LeitorJson.lerJson("src//main//resources//Ataques.json", Ataque.class);

    public static Map <Integer , Ataque> ataques = ataquesList.stream().collect(
            Collectors.toMap(Ataque::getId, ataque -> ataque));


    public static Ataque gerarAtaque(){
        int indice = rnd.nextInt(ataquesList.size());
        return ataquesList.get(indice);
    }





}
