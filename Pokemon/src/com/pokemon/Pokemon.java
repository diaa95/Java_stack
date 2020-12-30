package com.pokemon;

public class Pokemon {
    public String name;
    public int health;
    public String type;
    private static int count;

    public Pokemon(String name, int health, String type){
        this.name = name;
        this.health = health;
        this.type = type;
        count++;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setHealth(int HP){
        this.health = HP;
    }
    public int getHealth(){
        return this.health;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }

    public void attackPokemon(Pokemon pokemon){
        pokemon.health -= 10;
        System.out.println("Awch!!");
    }
}
