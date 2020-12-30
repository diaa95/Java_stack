package com.pokemon;

import com.pokemon.AbstractPokemon;
import com.pokemon.Pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
    public ArrayList<Pokemon> myPokemons= new ArrayList<>();

    public void addPokemon(Pokemon pokemon){
        myPokemons.add(pokemon);
    }

    @Override
    public void listPokemon() {
        System.out.println(myPokemons);
    }
}
