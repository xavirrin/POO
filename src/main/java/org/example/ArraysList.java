package org.example;

import java.util.ArrayList;

public class ArraysList {

    public static void main(String[] args) {
        ArrayList<Integer> listaCompra = new ArrayList<>();

        listaCompra.add(1);

        if (listaCompra.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("La lista no está vacía.");
        }

        
    }
}
