package Ejercicio1_7;

public class main {
    public static void main(String[] args) {
        Pelicula peli_1 = new Pelicula("Peli1","Juano",
                Pelicula.genero.COMEDIA,200,1990,7.5);
        Pelicula peli_2 = new Pelicula("Peli2","Juanita",
                Pelicula.genero.DRAMA,160,2007,8.0);
        peli_1.Imprimir();
        peli_2.Imprimir();
        System.out.println("La pelicula "+peli_1.nombre+" es epica: "+peli_1.EsEPico());
        System.out.println("La pelicula "+peli_2.nombre+" es epica: "+peli_2.EsEPico());
        System.out.println("La película "+ peli_1.getNombre() + " y la película "
                + peli_2.getNombre() + " son similares: " +peli_1.Similar(peli_2));
        System.out.println("");
        peli_1.imprimirCartel(peli_1);
        peli_2.imprimirCartel(peli_2);
    }
}
