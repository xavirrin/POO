package org.example.herencia.vehiculos;

public class AppVehiculos {

    public static void  main (String[] args) {
        Avion airbus = new Avion("Airbus", "1234X", 2);
        Tren ave = new Tren("AVE", "9867S", 8);
        airbus.imprimirInfo();
        ave.imprimirInfo();
        airbus.ruido();
        ave.ruido();


    }


}
