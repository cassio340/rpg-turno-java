package br.com.cassio340;


import br.com.cassio340.entities.inimigos.NivelDificuldade;
import br.com.cassio340.factory.InimigoFactory;

public class Main {
    static void main() {
        System.out.println(InimigoFactory.gerarInimigo(NivelDificuldade.FACIL));
    }
}

