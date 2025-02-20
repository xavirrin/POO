package org.example.ejercicios;

public class AppTelevisor {

    public static void main(String[] args) {

        Televisor tele = new Televisor();
        Televisor tele2 = new Televisor(34, 12);
        System.out.println("Tele1 en el canal: " + tele.getCanal() + " y con volumen: " + tele.getVolumen());
        System.out.println("Tele2 en el canal: " +tele2.getCanal() + " y con volumen: " + tele2.getVolumen());

        tele.subirCanal();
        tele.bajarCanal();
        tele2.subirCanal();
        tele2.bajarCanal();
        tele.bajarVolumen();
        tele.subirVolumen();
        tele2.bajarVolumen();
        tele2.subirVolumen();

        tele.setCanal(100);
        tele2.setCanal(37);

        System.out.println("Tele1 en el canal: " + tele.getCanal() + " y con volumen: " + tele.getVolumen());
        System.out.println("Tele2 en el canal: " +tele2.getCanal() + " y con volumen: " + tele2.getVolumen());


    }
}
