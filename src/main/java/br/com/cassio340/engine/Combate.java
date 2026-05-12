package br.com.cassio340.engine;

import br.com.cassio340.entities.inimigos.Inimigo;
import br.com.cassio340.entities.personagens.Player;

public class Combate {

    public static void batalha (Player player, Inimigo inimigo){
        while(player.estaVivo(player) && inimigo.estaVivo(inimigo) ){
            informacoesDeBatalha(player,inimigo);

        }
    }
    public static void informacoesDeBatalha(Player player,Inimigo inimigo){
        System.out.println("=========================");
        System.out.println(player.getNome() + ":" + player.getHp() + "\\" + player.getHpMax() );
        System.out.println(inimigo.getNome() + ":" + inimigo.getHp() + "\\" + inimigo.getHpMax() );
        System.out.println("=========================");
        System.out.println();
    }


}
