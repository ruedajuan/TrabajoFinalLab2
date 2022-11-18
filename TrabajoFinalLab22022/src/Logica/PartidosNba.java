package Logica;

import java.io.Serializable;



public class PartidosNba implements Serializable {
    private String fecha;
    private int puntos;
    private int rebotes;
    private int asistencias;
    private Equipos[][] partidosDelDia = new Equipos[4][2];
    private int [][] resultados= new int[4][2];
    private int [][] estadEquipo1 = new int[6][4];
    private int [][] estadEquipo2 = new int[6][4];
    private int [][] estadEquipo3 = new int[6][4];
    private int [][] estadEquipo4 = new int[6][4];
    private int [][] estadEquipo5 = new int[6][4];
    private int [][] estadEquipo6 = new int[6][4];
    private int [][] estadEquipo7 = new int[6][4];
    private int [][] estadEquipo8 = new int[6][4];

    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public int getRebotes() {
        return rebotes;
    }
    public void setRebotes(int rebotes) {
        this.rebotes = rebotes;
    }
    public int getAsistencias() {
        return asistencias;
    }
    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public int[][] getEstadEquipo1() {
        return estadEquipo1;
    }
    public void setEstadEquipo1(int[][] estadEquipo1) {
        this.estadEquipo1 = estadEquipo1;
    }
    public int[][] getEstadEquipo2() {
        return estadEquipo2;
    }
    public void setEstadEquipo2(int[][] estadEquipo2) {
        this.estadEquipo2 = estadEquipo2;
    }
    public int[][] getEstadEquipo3() {
        return estadEquipo3;
    }
    public void setEstadEquipo3(int[][] estadEquipo3) {
        this.estadEquipo3 = estadEquipo3;
    }
    public int[][] getEstadEquipo4() {
        return estadEquipo4;
    }
    public void setEstadEquipo4(int[][] estadEquipo4) {
        this.estadEquipo4 = estadEquipo4;
    }
    public int[][] getResultados() {
        return resultados;
    }
    public void setResultados(int[][] resultados) {
        this.resultados = resultados;
    }


    public PartidosNba(String fecha){
        this.fecha=fecha;
        System.out.println("Partidos del dia "+fecha);
    }

    public void agregarPartidos(Equipos equipo1, Equipos equipo2){

        boolean aux=false;
        for(int i=0; i<4;i++){
            for(int j=0;j<2;j++){
                if (partidosDelDia[i][j]==null){
                    partidosDelDia[i][j]=equipo1;
                    partidosDelDia[i][j+1]=equipo2;
                    System.out.println(partidosDelDia[i][j].getNombre() + " vs " + partidosDelDia[i][j+1].getNombre());
                    aux=true;
                    break;
                }
            }
            if(aux==true)break;
        }

    }

    public void agregarEstadEquipo(int[][] estats,Equipos equipo){
        int x,puntos,asistencias,rebotes;
        puntos=0;
        asistencias=0;
        rebotes=0;
        for(int i=0;i<5;i++){

            puntos= estats[i][1]+puntos;
            asistencias=estats[i][2]+asistencias;
            rebotes=estats[i][3]+rebotes;
            estats[5][1]=puntos;
            estats[5][2]=asistencias;
            estats[5][3]=rebotes;
        }
        switch (equipo.getCodigo()) {
            case 1:
                estadEquipo1 = estats;
                break;
            case 2:
                estadEquipo2 = estats;
                break;
            case 3:
                estadEquipo3 = estats;
                break;
            case 4:
                estadEquipo4 = estats;
                break;
            case 5:
                estadEquipo5=estats;
                break;
            case 6:
                estadEquipo6=estats;
                break;
            case 7:
                estadEquipo7=estats;
                break;
            case 8:
                estadEquipo8=estats;
                break;
            default:
                break;}
       /*
        }*/

    }
    public void resultadosPartidos(){
        for(int i=0;i<4;i++){
            for (int j=0;j<2;j++){
                if (partidosDelDia[i][j]!=null){
                     switch (partidosDelDia[i][j].getCodigo()) {
                        case 1:
                            resultados[i][j]= estadEquipo1[5][1];
                            break;
                        case 2:
                            resultados[i][j]=estadEquipo2[5][1] ;
                            break;
                        case 3:
                            resultados[i][j]=estadEquipo3[5][1] ;
                            break;
                        case 4:
                            resultados[i][j]=estadEquipo4[5][1] ;
                            break;
                        case 5:
                            resultados[i][j]=estadEquipo5[5][1];
                            break;
                        case 6:
                            resultados[i][j]=estadEquipo6[5][1];
                            break;
                        case 7:
                            resultados[i][j]=estadEquipo7[5][1];
                            break;
                        case 8:
                            resultados[i][j]=estadEquipo8[5][1];
                            break;
                        default:
                            break;
                        }
                }
            }
        }
    };
    public void mostrarResultados(){

        System.out.println("Resultados del dia " + getFecha());

        for(int i=0;i<4;i++){
            for (int j=0;j<2;j++){
                if (resultados[i][j] != 0)
                System.out.println(partidosDelDia[i][j].getNombre()+ " "+ resultados[i][j]);
            }
            System.out.println(" ");
        }

    }
    public void mostrarDesempeñoJugadores(Equipos equipo){
        switch (equipo.getCodigo()) {
            case 1:
                System.out.println(equipo.getNombre()+": dorsal/puntos/asistencias/rebotes");
                for(int i=0;i<6;i++){
                    for (int j=0;j<4;j++){
                        if(i==5 && j==0) System.out.print("Tot"+"\t");
                        else System.out.print(estadEquipo1[i][j]+"\t");
                    }
                    System.out.println();}

                break;
            case 2:
                System.out.println(equipo.getNombre()+": dorsal/puntos/asistencias/rebotes");
                for(int i=0;i<6;i++){
                    for (int j=0;j<4;j++){
                        if(i==5 && j==0) System.out.print("Tot"+"\t");
                        else System.out.print(estadEquipo2[i][j]+"\t");
                    }
                    System.out.println();}
                break;
            case 3:
                System.out.println(equipo.getNombre()+": dorsal/puntos/asistencias/rebotes");
                for(int i=0;i<6;i++){
                    for (int j=0;j<4;j++){
                        if(i==5 && j==0) System.out.print("Tot"+"\t");
                        else System.out.print(estadEquipo3[i][j]+"\t");
                    }
                    System.out.println();}
                break;
            case 4:
                System.out.println(equipo.getNombre()+": dorsal/puntos/asistencias/rebotes");
                for(int i=0;i<6;i++){
                    for (int j=0;j<4;j++){
                        if(i==5 && j==0) System.out.print("Tot"+"\t");
                        else System.out.print(estadEquipo4[i][j]+"\t");
                    }
                    System.out.println();}
                break;
            case 5:
                System.out.println(equipo.getNombre()+": dorsal/puntos/asistencias/rebotes");
                for(int i=0;i<6;i++){
                    for (int j=0;j<4;j++){
                        if(i==5 && j==0) System.out.print("Tot"+"\t");
                        else System.out.print(estadEquipo5[i][j]+"\t");
                    }
                    System.out.println();}
                break;
            case 6:
                System.out.println(equipo.getNombre()+": dorsal/puntos/asistencias/rebotes");
                for(int i=0;i<6;i++){
                    for (int j=0;j<4;j++){
                        if(i==5 && j==0) System.out.print("Tot"+"\t");
                        else System.out.print(estadEquipo6[i][j]+"\t");
                    }
                    System.out.println();}
                break;
            case 7:
                System.out.println(equipo.getNombre()+": dorsal/puntos/asistencias/rebotes");
                for(int i=0;i<6;i++){
                    for (int j=0;j<4;j++){
                        if(i==5 && j==0) System.out.print("Tot"+"\t");
                        else System.out.print(estadEquipo7[i][j]+"\t");
                    }
                    System.out.println();}
                break;
            case 8:
                System.out.println(equipo.getNombre()+": dorsal/puntos/asistencias/rebotes");
                for(int i=0;i<6;i++){
                    for (int j=0;j<4;j++){
                        if(i==5 && j==0) System.out.print("Tot"+"\t");
                        else System.out.print(estadEquipo8[i][j]+"\t");
                    }
                    System.out.println();}

                break;
            default:
                break;}

    }

}
