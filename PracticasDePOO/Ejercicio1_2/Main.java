package Ejercicio1_2;

public class Main {
    public static void main(String[] args) {
        Planeta planeta1 = new Planeta("Júpiter", 79, 4.82e1, 2.18e15, 51913, 1512311451, Planeta.TipoPlaneta.GASEOSO, true);
        Planeta planeta2 = new Planeta("Saturno", 3, 34.2e43, 4.621e2, 22651, 2573, Planeta.TipoPlaneta.TERRESTRE, true);

        System.out.println("Planeta 1:");
        planeta1.imprimirDatos();
        System.out.println("Densidad: " + planeta1.Densidad() + " kg/km³");
        System.out.println("Planeta exterior?: " + planeta1.PlanetaExterior());
        System.out.println("---------------------------");
        System.out.println("Datos del Planeta 2:");
        planeta2.imprimirDatos();
        System.out.println("Densidad del Planeta 2: " + planeta2.Densidad() + " kg/km³");
        System.out.println("Paneta exterior?: " + planeta2.PlanetaExterior());
    }
}
