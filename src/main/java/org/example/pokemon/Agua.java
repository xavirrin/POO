package org.example.pokemon;

import java.sql.SQLOutput;

public class Agua extends Pokemon implements AtaquesAgua, CosasAgua{


    public Agua(int nivel, int ps) {
        super(nivel, ps);
    }

    @Override
    public void atacar() {
        System.out.println("PISTOLA AGUA!!!!!!!");
    }

    @Override
    public void hidrobomba() {
        System.out.println("BOOOOOOOMMMMM");
    }

    @Override
    public void surf() {
        System.out.println("COJO UNA OLAAA");
    }

    @Override
    public void pistolaAgua() {
        System.out.println("FLUSH FLUSHHHH");
    }

    @Override
    public void salpicadura() {
        System.out.println("...");
    }

    @Override
    public void aquagym() {

    }
}
