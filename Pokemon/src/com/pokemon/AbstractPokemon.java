package com.pokemon;

public abstract class AbstractPokemon implements PokemonInterface{
    @Override
    public Pokemon createPokemon(String name, int health, String type) {
        Pokemon pokemon = new  Pokemon(name, health,type);
        return pokemon;
    }
    public String pokemonInfo(Pokemon pokemon){
        return "Name: "+ pokemon.name +", health: "+String.valueOf(pokemon.health)+", type: "+pokemon.type;
    }
}
