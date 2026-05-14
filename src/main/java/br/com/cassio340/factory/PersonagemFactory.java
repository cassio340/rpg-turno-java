package br.com.cassio340.factory;

import br.com.cassio340.entities.personagens.Player;

import java.util.List;
import java.util.Scanner;

public class PersonagemFactory {
    private static final Scanner scan = new Scanner(System.in);
    private static final List<Player> personagens =
            LeitorJson.lerJson("src//main//resources//personagens.json", Player.class);

    public static Player selecaoPersonagem(){
        int opcoes = 0;

        System.out.println("Selecione um personagem");

        for(Player personagem : personagens){

            System.out.println(opcoes + "-" + personagem);
            opcoes++;
        }
        int escolha;
        while (true) {

            if(!scan.hasNextInt()){
                System.out.println("Digite um numero valido");
                scan.next();
                continue;
            }
            escolha = scan.nextInt();
            if (escolha >= 0 && escolha < personagens.size()) {
                break;
            }
            System.out.println("escolha invalida");
        }
        return personagens.get(escolha);
    }
}
