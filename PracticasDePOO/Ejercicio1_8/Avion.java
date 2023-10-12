package Ejercicio1_8;

import Ejercicio1_7.Pelicula;

public class Avion {
    String nombre;
    int numMotor;

    public Avion(String nombre, int numMotor) {
        this.nombre = nombre;
        this.numMotor = numMotor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }
    public void impFabricante(){
        System.out.println("Fabricante del avion: "+nombre);
    }
    public void cambFabricante(Avion a){
        a.setNombre("Lockheed");
    }

}
