package org.example.ejercicios;

import java.util.Scanner;

public class AppPaciente {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Introduce la edad:");
        int edad = teclado.nextInt();
        System.out.println("Introduce el sexo: 'H' - 'M'");
        char sexo = teclado.next().charAt(0);
        System.out.println("Introduce el peso:");
        double peso = teclado.nextDouble();
        System.out.println("Introduce la altura:");
        double altura = teclado.nextDouble();

        Paciente pac1 = new Paciente(nombre, edad, sexo, peso, altura);

        Paciente pac2 = new Paciente(nombre, edad, sexo);

        Paciente pac3 = new Paciente();
        teclado.nextLine();

        System.out.println("Introduce el nombre para pac3:");
        pac3.setNombre(teclado.nextLine());

        System.out.println("Introduce la edad para pac3:");
        pac3.setEdad(teclado.nextInt());

        System.out.println("Introduce el sexo para pac3: 'H' - 'M'");
        pac3.setSexo(teclado.next().charAt(0));

        System.out.println("Introduce el peso para pac3:");
        pac3.setPeso(teclado.nextDouble());

        System.out.println("Introduce la altura para pac3:");
        pac3.setAltura(teclado.nextDouble());

        System.out.println("---------------");

        System.out.println("IMC Pac1: " + pac1.calcularIMC());
        System.out.println("IMC Pac2: " + pac2.calcularIMC());
        System.out.println("IMC Pac3: " + pac3.calcularIMC());

        System.out.println("---------------");

        System.out.println("¿Pac1 es mayor de edad? " + pac1.esMayorDeEdad());
        System.out.println("¿Pac2 es mayor de edad? " + pac2.esMayorDeEdad());
        System.out.println("¿Pac3 es mayor de edad? " + pac3.esMayorDeEdad());

        System.out.println("---------------");

        pac1.mostrarInfoPaciente();
        pac2.mostrarInfoPaciente();
        pac3.mostrarInfoPaciente();

        teclado.close();


    }
}
