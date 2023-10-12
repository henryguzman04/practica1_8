package Ejercicio1_1;

public class Persona {
    private String nombre;
    private String apellido;
    private String id;
    private int fechaNacimiento;
    private String paisNacimiento;
    private char genero;

    public Persona(String nombre, String apellido, String id, int fechaNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Número de Documento: " + id);
        System.out.println("Año de Nacimiento: " + fechaNacimiento);
        System.out.println("País de Nacimiento: " + paisNacimiento);
        System.out.println("Género: " + genero);
        System.out.println("--------------------");
    }
}
