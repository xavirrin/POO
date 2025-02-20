package org.example.ejercicios;

public class Televisor {

    private int canal;
    private int volumen;

    public Televisor() {
        this.canal = 1;
        this.volumen = 5;
    }

    public Televisor(int canal, int volumen) {
        this.canal = canal;
        this.volumen = volumen;
    }

    public void subirCanal() {
        if (canal < 99) {
            ++canal;
            System.out.println("Subiendo canal... Canal " + canal);
        } else {
            System.out.println("Canal no encontrado.");
        }
    }

    public void bajarCanal() {
        if (canal > 1) {
            --canal;
            System.out.println("Bajando canal... Canal " + canal);
        } else {
            System.out.println("Canal no encontrado.");
        }
    }

    public void subirVolumen() {
        if (volumen < 99) {
            ++volumen;
            System.out.println("Subiendo volumen... Volumen al " + volumen);
        } else {
            System.out.println("El volumen debe estar entre 1 y 99.");
        }
    }

    public void bajarVolumen() {
        if (volumen > 1) {
            ++volumen;
            System.out.println("Bajando volumen... Volumen al " + volumen);
        } else {
            System.out.println("El volumen debe estar entre 1 y 99.");
        }
    }


    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal < 99 && canal > 1) {
            this.canal = canal;
        } else {
            System.out.println("Canal fuera de rango.");
        }
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if(volumen < 99 && volumen > 1) {
            this.volumen = volumen;
        }else{
            System.out.println("Volumen fuera de rango.");
        }
    }
}
