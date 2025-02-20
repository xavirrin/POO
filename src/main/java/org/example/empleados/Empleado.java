package org.example.empleados;

public class Empleado {

    public void realizarTarea(){
        System.out.println("Empleado realizando una tarea genérica.");
    }

    public void asignarTarea(Empleado empleado){
        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();
    }
}
