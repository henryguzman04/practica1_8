package Ejercicio1_2;

public class Planeta {
    private String nombre;
    private int numSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaAlSol;
    private TipoPlaneta tipo;
    private boolean visible;


    public enum TipoPlaneta {GASEOSO, TERRESTRE, ENANO}

    public Planeta(String nombre, int numSatelites, double masa, double volumen,
                   int diametro, int distanciaAlSol, TipoPlaneta tipo, boolean visible) {
        this.nombre = nombre;
        this.numSatelites = numSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.tipo = tipo;
        this.visible = visible;
    }
    public boolean PlanetaExterior() {
        double distancia = distanciaAlSol * 149597870;
        return distancia > 340000000;
    }
    public void imprimirDatos() {
        System.out.println("Nombre del planeta: " + nombre);
        System.out.println("Cantidad de satélites: " + numSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia media al Sol: " + distanciaAlSol + " millones de km");
        System.out.println("Tipo de planeta: " + tipo);
        System.out.println("Es observable a simple vista: " + visible);
    }

    public double Densidad() {
        return masa / volumen;
    }

}
