package org.example.pokemon;

import java.sql.SQLOutput;

public class Fuego extends Pokemon{

    public Fuego(int nivel, int ps) {
        super(nivel, ps);
    }

    @Override
    public void atacar() {
        System.out.println("LLAMARADAAAAAAAAAA!!!");

    }
}
