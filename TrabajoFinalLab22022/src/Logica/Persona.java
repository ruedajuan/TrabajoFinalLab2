package Logica;

import java.io.Serializable;

public abstract class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private String altura;

    public Persona(){};

    public Persona(String nombre,String apellido, String altura){
        this.nombre=nombre;
        this.apellido=apellido;
        this.altura=altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", altura='" + altura + '\'' +
                '}';
    }
}
