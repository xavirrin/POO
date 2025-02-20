package org.example.dispositivos_inteligentes;

public class ParlanteInteligente extends Dispositivo {

    public ParlanteInteligente(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {

        if (getEstado()) {
            System.out.println("El parlante ya está encendido.");
        }else{
            System.out.println("Activando parlante con comando de voz...");
            setEstado(true);
        }
    }
}
