package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Equipos implements Informacion, Serializable {
    private String nombre;
    private String ciudad;
    private int codigo;
    private List<Jugadores> plantilla = new ArrayList<Jugadores>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Jugadores> getPlantilla(){
        return plantilla;
    }
    public void setPlantilla(List<Jugadores>plantilla){
        this.plantilla=plantilla;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }



    public Equipos (){
    }
    public Equipos(String nombre, String ciudad, int codigo){
        this.nombre=nombre;
        this.ciudad=ciudad;
        this.codigo=codigo;
    }
    public void agregarJugadores(Jugadores jugador){
        plantilla.add(jugador);
    }
    public void eliminarJugadores(String apellidoABorrar){
        for(int i=0;i<plantilla.size();i++){
            if(plantilla.get(i).getApellido().equals(apellidoABorrar)){
                plantilla.remove(i);
            }
        }
    }


    @Override
    public String verPlantilla() {
        for (Jugadores jugador:plantilla){
        System.out.println(jugador.toString());
        }
        return null;
    }


}
