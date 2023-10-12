package Ejercicio1_8;

public class Main {
    public static void main(String[] args) {
        Avion a1 = new Avion("Airbus",4);
        Avion a2 = new Avion("Lockheed",4);
        System.out.println("Original:");
        a1.impFabricante();
        a2.impFabricante();
        a1=a2;
        System.out.println("Cambiado:");
        a1.impFabricante();
        a2.impFabricante();
        System.out.println("Propuesto:");
        a2.setNombre("Stealth");
        a1.impFabricante();
        a2.impFabricante();
    }
}
