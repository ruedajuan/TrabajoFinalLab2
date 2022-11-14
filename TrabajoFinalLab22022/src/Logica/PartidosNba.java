package Logica;

import java.io.Serializable;

public class PartidosNba implements Serializable {
    private String fecha;
    public PartidosNba(String fecha){
        this.fecha=fecha;
    }

    private Equipos[][] PartidosDelDia = new Equipos[3][3];



}
