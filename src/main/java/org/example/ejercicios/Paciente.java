package org.example.ejercicios;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;


public class Paciente {

    private static final int IMC_BAJO_PESO = -1;
    private static final int IMC_PESO_IDEAL = 0;
    private static final int IMC_SOBREPESO = 1;
    private static final char SEXO_POR_DEFECTO = 'X';

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public Paciente() {
        this.nombre = "";
        this.edad = 0;
        this.dni = generarDNI();
        this.sexo = SEXO_POR_DEFECTO;
        this.peso = 0;
        this.altura = 0;
    }

    public Paciente(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Paciente(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String generarDNI() {
        Random aleatorio = new Random();
        char[] letras = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int numDNI = 10000000 + aleatorio.nextInt(90000000);
        int resto = numDNI % 23;
        char letraDNI = letras[resto];
        dni = numDNI + "" + letraDNI;
        return dni;
    }


    public int calcularIMC() {
        double imc = peso / Math.pow(altura, 2);
        if (Math.pow(peso, altura) < 20) {
            return IMC_BAJO_PESO;
        } else if ((Math.pow(peso, altura) > 19) && (Math.pow(peso, altura) < 26)) {
            return IMC_PESO_IDEAL;
        } else {
            return IMC_SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return SEXO_POR_DEFECTO;
        }
    }

    public void mostrarInfoPaciente() {
        System.out.println("Nombre= " + nombre + ", Edad= " + edad + ", DNI= " + dni + ", Sexo= " + sexo + ", Peso= " + peso + ", Altura= " + altura);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
















