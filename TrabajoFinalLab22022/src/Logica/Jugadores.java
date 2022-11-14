package Logica;

import java.io.Serializable;

public class Jugadores extends Persona implements Serializable {
    private int dorsal;

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Jugadores(){};

    public Jugadores(String nombre, String apellido, String altura, int dorsal){
        super(nombre, apellido, altura);
        this.dorsal=dorsal;
    }


    @Override
    public String toString() {
        return "Jugadores{" +
                "nombre='" + super.getNombre() + '\'' +
                ", apellido='" + super.getApellido() + '\'' +
                ", altura='" + super.getAltura() + '\'' +
                ", dorsal=" + dorsal +
                '}';
    }
}

