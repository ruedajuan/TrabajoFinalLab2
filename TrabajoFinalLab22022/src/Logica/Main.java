package Logica;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import IGU.LaminaSecundaria;
import IGU.MarcoEmergente;
import IGU.LaminaPrincipal;
import IGU.MarcoPrincipal;

public class Main {

    public static void main(String[] args) {
        MarcoPrincipal m1 = new MarcoPrincipal();
	// Equipos
        Equipos Lakers = new Equipos("Lakers","Los Angeles",1);
        Equipos CLipers = new Equipos("Clipers","Los Angeles",2);
        Equipos Celtics= new Equipos("Celtics","Boston",3);
        Equipos Knicks = new Equipos("Knicks","Nueva York",4);
        Equipos Warriors= new Equipos("Warriors","San Francisco",5);
        Equipos Nets = new Equipos("Nets","Brooklin",6);
        Equipos Bulls = new Equipos("Bulls","Chicago",7);
        Equipos Sixers=new Equipos("76 Sixers","Philadelphia",8);

        //Los Angeles Lakers
        Jugadores j11 = new Jugadores("Lebron","James","2,06 m",6);
        Jugadores j12 = new Jugadores("Russel","Westbrook","1,91 m",0);
        Jugadores j13 = new Jugadores("Anthony","Davis","2,08 m",3);
        Jugadores j14 = new Jugadores("Patrick", "Beverley","1,88 m",21);
        Jugadores j15 = new Jugadores("Lonnie","Walker IV","1,93 m",4);
        //Se agregan los jugadores a la plantilla del equipo
        Lakers.agregarJugadores(j11);
        Lakers.agregarJugadores(j12);
        Lakers.agregarJugadores(j13);
        Lakers.agregarJugadores(j14);
        Lakers.agregarJugadores(j15);
        //Los Angeles Clippers

        Jugadores j21 = new Jugadores("Paul","George","2,03 m",13);
        Jugadores j22 = new Jugadores("Marcus","Morris","2,06 m",8);
        Jugadores j23 = new Jugadores("Ivica","Zubac","2,13 m",40);
        Jugadores j24 = new Jugadores("Reggie", "Jackson","1,88 m",1);
        Jugadores j25 = new Jugadores("Kawhi","Leonard","2,01 m",2);

        CLipers.agregarJugadores(j21);
        CLipers.agregarJugadores(j22);
        CLipers.agregarJugadores(j23);
        CLipers.agregarJugadores(j24);
        CLipers.agregarJugadores(j25);
        //Boston Celtics
        Jugadores j31 = new Jugadores("Marcus","Smart","1,91 m",36);
        Jugadores j32 = new Jugadores("Jayson","Tatum","2,03 m",0);
        Jugadores j33 = new Jugadores("Jaylen","Brown","1,98 m",7);
        Jugadores j34 = new Jugadores("Al", "Horford","2,06 m",42);
        Jugadores j35 = new Jugadores("Grant","Williams","1,98 m",12);

        Celtics.agregarJugadores(j31);
        Celtics.agregarJugadores(j32);
        Celtics.agregarJugadores(j33);
        Celtics.agregarJugadores(j34);
        Celtics.agregarJugadores(j35);
        //New York Knicks
        Jugadores j41 = new Jugadores("Jalen","Brunson","1,91 m",11);
        Jugadores j42 = new Jugadores("Julius","Randle","2,03 m",30);
        Jugadores j43 = new Jugadores("RJ","Barret","1,98 m",9);
        Jugadores j44 = new Jugadores("Evan", "Fournier","2,01 m",13);
        Jugadores j45 = new Jugadores("Mitchel","Robinson","2,13 m",23);
        Knicks.agregarJugadores(j41);
        Knicks.agregarJugadores(j42);
        Knicks.agregarJugadores(j43);
        Knicks.agregarJugadores(j44);
        Knicks.agregarJugadores(j45);

        //Estats de partidos

        PartidosNba d1 = new PartidosNba("18/11/22");
        d1.agregarPartidos(Lakers,CLipers);
        d1.agregarPartidos(Celtics,Knicks);
        d1.agregarPartidos(Warriors,Nets);
        int[][]Lakersd1={{Lakers.getPlantilla().get(0).getDorsal(),20,12,12},
                         {Lakers.getPlantilla().get(1).getDorsal(),15,11,10},
                         {Lakers.getPlantilla().get(2).getDorsal(),25,1,12},
                         {Lakers.getPlantilla().get(3).getDorsal(),5,5,4},
                         {Lakers.getPlantilla().get(4).getDorsal(),19,6,0},
                         {Lakers.getCodigo(),0,0,0},
        };
        int[][]Clipersd1={{CLipers.getPlantilla().get(0).getDorsal(),38,12,12},
                {CLipers.getPlantilla().get(1).getDorsal(),5,11,1},
                {CLipers.getPlantilla().get(2).getDorsal(),15,2,12},
                {CLipers.getPlantilla().get(3).getDorsal(),25,0,4},
                {CLipers.getPlantilla().get(4).getDorsal(),17,5,21},
                {CLipers.getCodigo(),0,0,0},
        };
        int[][]Celticsd1={{Celtics.getPlantilla().get(0).getDorsal(),10,2,2},
                {Celtics.getPlantilla().get(1).getDorsal(),35,1,7},
                {Celtics.getPlantilla().get(2).getDorsal(),44,1,2},
                {Celtics.getPlantilla().get(3).getDorsal(),5,5,14},
                {Celtics.getPlantilla().get(4).getDorsal(),9,6,10},
                {Celtics.getCodigo(),0,0,0},
        };
        int[][]Knicksd1={{Knicks.getPlantilla().get(0).getDorsal(),28,12,2},
                {Knicks.getPlantilla().get(1).getDorsal(),15,11,10},
                {Knicks.getPlantilla().get(2).getDorsal(),25,2,12},
                {Knicks.getPlantilla().get(3).getDorsal(),9,5,3},
                {Knicks.getPlantilla().get(4).getDorsal(),16,5,21},
                {Knicks.getCodigo(),0,0,0},
        };

        d1.agregarEstadEquipo(Lakersd1,Lakers);
        d1.agregarEstadEquipo(Clipersd1,CLipers);
        d1.agregarEstadEquipo(Celticsd1,Celtics);
        d1.agregarEstadEquipo(Knicksd1,Knicks);
        d1.resultadosPartidos();
        d1.mostrarResultados();
        d1.mostrarDesempeñoJugadores(Lakers);
        d1.mostrarDesempeñoJugadores(CLipers);




        //Se archivan los resultados
        try {
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("miObjeto.txt"));
            escribiendoFichero.writeObject(d1);
            escribiendoFichero.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

