package org.example.dispositivos_inteligentes;

import java.util.ArrayList;

public class AppDispositivos {

    public static void main(String[] args) {

        Televisor samsung = new Televisor("Samsung");
        samsung.encender();
        samsung.encender();
        samsung.sincronizar();

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(new Televisor("LG SMART"));
        listaDispositivos.add(new ParlanteInteligente("Alexa"));
        listaDispositivos.add(new AireAcondicionado("Haier Inverter"));
        listaDispositivos.add(new Televisor("Samsung comedor"));

        System.out.println("-------------------------");
        for (Dispositivo dispositivo : listaDispositivos) {
            dispositivo.encender();
            if (dispositivo instanceof ControlRemoto) {
                ((ControlRemoto) dispositivo).sincronizar();
            }
            dispositivo.mostrarEstado();
            dispositivo.apagar();

            System.out.println("--------------------");
        }

        Dispositivo proyector = new Dispositivo("Optoma") {
            @Override
            public void encender() {
                if (getEstado()) {
                    System.out.println("El poyector ya está encendido.");
                } else {
                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                    setEstado(true);
                }
            }
        };

        ControlRemoto control_proyector = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto de presentación...");
            }
        };

        Dispositivo horno_inteligente = new Dispositivo("Balay hot") {
            @Override
            public void encender() {
                if (getEstado()) {
                    System.out.println("El horno ya está encendido.");
                } else {
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    setEstado(true);
                }
            }
        };

        listaDispositivos.add(horno_inteligente);
        listaDispositivos.add(proyector);

        for (Dispositivo dispositivo : listaDispositivos) {

            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto) {
                ((ControlRemoto) dispositivo).sincronizar();
            } else if (dispositivo.getNombre().equals("Optoma")) {
                control_proyector.sincronizar();
            }
            dispositivo.mostrarEstado();
            dispositivo.apagar();

            System.out.println("--------------------");


        }
    }
}
