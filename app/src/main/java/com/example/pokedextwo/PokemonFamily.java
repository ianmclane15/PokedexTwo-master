package com.example.pokedextwo;

public class PokemonFamily {

    public pokemon first;
    public pokemon second;
    public pokemon third;
    public String famName;

    private static pokemon charmander = new pokemon("Charmander", new String[] {"fire"}, 39, 52, 43, 60, 50, 65);
    private static pokemon charmeleon = new pokemon("Charmeleon", new String[] {"fire"}, 58, 64, 58, 80, 65, 80);
    private static pokemon charizard = new pokemon("Charizard", new String[] {"fire", "flying"}, 78, 84, 78, 109, 85, 100);
    private static pokemon bulbasaur = new pokemon("Bulbasaur", new String[] {"grass", "poison"}, 45, 49, 49, 65, 65, 45);
    private static pokemon ivysaur = new pokemon("Ivysaur", new String[] {"grass", "poison"}, 60, 62, 63, 80, 80, 60);
    private static pokemon venusaur = new pokemon("Venusaur", new String[] {"grass", "poison"}, 80, 82, 83, 100, 100, 80);
    private static pokemon squirtle = new pokemon("Squirtle", new String[] {"water"}, 44, 48, 65, 50, 64, 43);
    private static pokemon wartortle = new pokemon("Wartortle", new String[] {"water"}, 59, 63, 80, 65, 80, 58);
    private static pokemon blastoise = new pokemon("Blastoise", new String[] {"water"}, 79, 83, 100, 85, 105, 78);

    public static final PokemonFamily charFamily = new PokemonFamily(charmander, charmeleon, charizard, "Char Family");
    public static final PokemonFamily bulbFamily = new PokemonFamily(bulbasaur, ivysaur, venusaur, "Bulb Family");
    public static final PokemonFamily turtleFamily = new PokemonFamily(squirtle, wartortle, blastoise, "Turtle Family");

    public static final pokemon[] poks = {charmander, charmeleon, charizard, bulbasaur, ivysaur, venusaur, squirtle, wartortle, blastoise};


    public PokemonFamily(pokemon first, String famName) {
        this.first = first;
        this.famName = famName;
    }

    public PokemonFamily(pokemon first, pokemon second, String famName) {
        this.first = first;
        this.second = second;
        this.famName = famName;
    }

    public PokemonFamily(pokemon first, pokemon second, pokemon third, String famName) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.famName = famName;
    }

    public pokemon getFirst() {
        return first;
    }

    public void setFirst(pokemon first) {
        this.first = first;
    }

    public pokemon getSecond() {
        return second;
    }

    public void setSecond(pokemon second) {
        this.second = second;
    }

    public pokemon getThird() {
        return third;
    }

    public void setThird(pokemon third) {
        this.third = third;
    }

    public String getFamName() {
        return famName;
    }

    public void setFamName(String famName) {
        this.famName = famName;
    }
}
