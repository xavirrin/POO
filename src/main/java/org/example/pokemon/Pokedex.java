package org.example.pokemon;

public class Pokedex {

    public static void main(String[] args) {

        Electrico pikachu = new Electrico(100, 300);

        pikachu.atacar();

        Agua squirtle = new Agua(200, 100);
        squirtle.atacar();
        squirtle.imprimirDatos();
        squirtle.salpicadura();

        Pokemon pikachu2 = new Electrico(30, 91);
        pikachu2.atacar();
        Pokemon squirtle2 = new Electrico(30, 91);
        squirtle2.atacar();

        Pokemon[] pokemons = {new Electrico(30, 21)
        , new Agua(34, 56)};

        for (Pokemon pokemon : pokemons){
            pokemon.atacar();
            pokemon.imprimirDatos();

            if (pokemon instanceof Agua){
                ((AtaquesAgua) pokemon).pistolaAgua();
            }
        }




    }
}
