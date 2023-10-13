package Ejercicio1_1;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("henry","guzman", "9472097",
                2004, "bolivia", 'M');
        Persona persona1 = new Persona("ana","villaroel", "1984651",
                2003, "bolivia", 'F');

        System.out.println("Datos personales:");

        persona.imprimirDatos();
        persona1.imprimirDatos();

    }
}
