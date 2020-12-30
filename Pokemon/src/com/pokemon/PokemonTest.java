package com.pokemon;

public class PokemonTest {
    public static void main(String[] args){
        Pokedex pokedex = new Pokedex();
        Pokemon Pikachu = pokedex.createPokemon("Pikachu", 100, "electric");
        Pokemon Eevee = pokedex.createPokemon("Eevee", 120, "Normal");
//        Pokemon Pikachu = new Pokemon("Pikachu", 100, "electric");
//        Pokemon Eevee = new Pokemon("Eevee", 120, "Normal");
        pokedex.addPokemon(Pikachu);
        pokedex.addPokemon(Eevee);
        Pikachu.attackPokemon(Eevee);
        pokedex.listPokemon();
    }

}
