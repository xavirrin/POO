package org.example.herencia.ej1;

import java.util.ArrayList;

public class RedSocial {

    public static void main (String[] args) {

        Usuario us1 = new Usuario("Ana", 30, "@ana", 231);
        us1.mostrarInfo();

        System.out.println();

        ArrayList<String> colaboracionesLuis = new ArrayList<>();
        colaboracionesLuis.add("MediaMarkt");
        colaboracionesLuis.add("Yoigo");
        colaboracionesLuis.add("Temu");
        Influencer influ1 = new Influencer("Luis", 25, "@luis_influencer", 50000, colaboracionesLuis);
        influ1.mostrarInfo();

        System.out.println();

        Streamer str1 = new Streamer("Carlos", 27, "@carlos_stream", 150, 2000);
        str1.mostrarInfo();

        System.out.println();

        Basico bas1 = new Basico("Pedro", 22, "@pedro123", 455);
        bas1.mostrarInfo();



    }
}
