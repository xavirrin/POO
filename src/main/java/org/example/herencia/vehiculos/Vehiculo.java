package org.example.herencia.vehiculos;

public class Vehiculo {

    private String marca;
    private String matricula;

    public Vehiculo(String marca, String matricula){
        this.marca=marca;
        this.matricula=matricula;
    }

    public void imprimirInfo(){
        System.out.println("Vehículo de marca " + marca + " y matrícula " + matricula);
    }

    public void ruido(){
        System.out.println("piiiii piiiii");
    }
}
