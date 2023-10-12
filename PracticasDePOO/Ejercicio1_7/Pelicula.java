package Ejercicio1_7;

public class Pelicula {
    String nombre,director;
    enum genero{COMEDIA,DRAMA,ACCION,SUSPENSO}
    genero gen;
    int duracion,year;
    double puntos;

    public Pelicula(String nombre, String director, genero gen, int duracion, int year, double puntos) {
        this.nombre = nombre;
        this.director = director;
        this.gen = gen;
        this.duracion = duracion;
        this.year = year;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public genero getGen() {
        return gen;
    }

    public void setGen(genero gen) {
        this.gen = gen;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public void Imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Director: " + director);
        System.out.println("Género: " + gen);
        System.out.println("Duración: " + duracion);
        System.out.println("Año: " + year);
        System.out.println("Calificación: " + puntos);
        System.out.println("________________________");
    }
    boolean EsEPico(){
        if (duracion>=180){return true;}
        else {return false;}
    }
    private String calcularValoracion() {
        if (puntos >= 0 && puntos <= 2) {return "Muy mala";}
        else if (puntos > 2 && puntos <= 5) {
            return "Mala";
        } else if (puntos > 5 && puntos <= 7) {
            return "Regular";
        } else if (puntos > 7 && puntos <= 8) {
            return "Buena";
        } else if (puntos > 8 && puntos <= 10){
            return "Excelente";
        } else {
            return "La pelicula no tiene criticas por el momento";
        }
    }
    boolean Similar(Pelicula pelicula) {
        if (pelicula.gen == gen && pelicula.calcularValoracion() == calcularValoracion()) {
            return true;
        } else {
            return false;
        }
    }
    void imprimirCartel(Pelicula pelicula){
        System.out.println("-----"+pelicula.nombre+"-----");
        int star = (int)puntos/2;
        System.out.print("-----");
        for(int i=0;i<star;i++){
            System.out.print("*");
        }
        System.out.println("-----");
        System.out.println("----"+pelicula.year+"----");
        System.out.println("Director: "+pelicula.director);
        System.out.println("");
    }
}
