package org.example.empleados;

import org.example.herenciajava.Persona;

public class AppEmpleados {
    public static void main(String[] args) {

        Empleado[] empleados = {
                new Desarrollador(),
                new Disenyador(),
                new Gerente()
        };

        System.out.println("=== Usando el array polimórfico ===");
        for (Empleado empleado : empleados) {
            empleado.realizarTarea();
        }

        Empleado gerente2 = new Gerente();
        Empleado desarrollador2 = new Desarrollador();

        System.out.println();

        System.out.println("=== Usando el array polimórfico ===");
        gerente2.asignarTarea(desarrollador2);
        desarrollador2.asignarTarea(gerente2);
    }


}