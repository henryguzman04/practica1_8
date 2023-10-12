package Ejercicio1_1;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juanpi","Torrico", "861565",
                2003, "Venezuela", 'H');
        Persona persona1 = new Persona("Juano","Sanchez", "1984651",
                2003, "Argentina", 'H');

        System.out.println("Datos personales:");
        persona.imprimirDatos();
        persona1.imprimirDatos();

    }
}
