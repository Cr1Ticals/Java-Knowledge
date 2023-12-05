package com.desafios.desafios;

import java.util.*;

public class PedraPapelAtaque {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Quantas vezes quer jogar?");
        int N = read.nextInt();

        String jogador1, jogador2;

        for(int i=0; i < N; i++){
            System.out.println("Jogador 1 Qual sera o seu ataque? ");
            jogador1 = read.next();
            System.out.println("Jogador 2 Qual sera o seu ataque? ");
            jogador2 = read.next();

            if(jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("pedra")){
                System.out.println("Jogador 1 venceu");
            }else if(jogador1.equalsIgnoreCase("Pedra") && jogador2.equalsIgnoreCase("papel")){
                System.out.println("Jogador 1 venceu");
            }else if(jogador1.equalsIgnoreCase("Papel")&& jogador2.equalsIgnoreCase("ataque")){
                System.out.println("Jogador 2 venceu");
            }else if(jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")){
                System.out.println("Ambos venceram");
            }else if(jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("pedra")){
                System.out.println("Sem ganhador");
            }else if(jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")){
                System.out.println("Aniquilacao mutua");
            }else if(jogador2.equalsIgnoreCase("ataque") && jogador1.equalsIgnoreCase("pedra")){
                System.out.println("Jogador 2 venceu");
            }else if(jogador2.equalsIgnoreCase("pedra") && jogador1.equalsIgnoreCase("papel")){
                System.out.println("Jogador 2 venceu");
            }else if(jogador2.equalsIgnoreCase("papel") && jogador1.equalsIgnoreCase("ataque")){
                System.out.println("Jogador 1 venceu");
            }
            else {
                System.out.println("Sem ganhador");
            }
        }
    }

}
// Ataque Aéreo vs. Pedra: Neste caso, o jogador com o Ataque Aéreo derrota o jogador com a Pedra, por razões óbvias.
// Pedra vs. Papel: Neste caso, o jogador com a Pedra derrota o com Papel, porque a Pedra machuca muito mais.
// Papel vs. Ataque Aéreo: Aqui o Ataque Aéreo ganha, porque Ataque Aéreo sempre ganha e o Papel é patético.
// Papel vs. Papel: Nesta variação, ambos os jogadores ganham, porque o Papel é inútil e ninguém que enfrenta o Papel pode perder.
// Pedra vs. Pedra: Para este caso não há ganhador, porque depende do que os jogadores decidem fazer com a Pedra e normalmente não fazem nada.
// Ataque Aéreo vs. Ataque Aéreo: Quando isto acontece, todos os jogadores perdem, devido a Aniquilação Mútua.