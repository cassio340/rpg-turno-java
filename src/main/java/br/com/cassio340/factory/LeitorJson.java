package br.com.cassio340.factory;
import br.com.cassio340.entities.inimigos.Inimigo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class LeitorJson {
    public static <T> List <T>  lerJson(String caminho,Class<T> classe){
        List <T> lista = new ArrayList<>();
        try(BufferedReader rd = new BufferedReader(new FileReader(caminho))){
            Gson gson = new Gson();
            Type tipoLista = TypeToken.getParameterized(List.class, classe).getType();
            lista = gson.fromJson(rd,tipoLista);

        }
        catch (IOException e){
            System.out.println("erro"+ e.getMessage());
        }
        return lista;
    }

}
