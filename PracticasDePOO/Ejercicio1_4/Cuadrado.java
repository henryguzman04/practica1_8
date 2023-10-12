package Ejercicio1_4;

public class Cuadrado {
    float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }
    public void AreaYPerimetroCuadrado(){
        System.out.println("Area: "+Math.pow(lado,2)+" cm2");
        System.out.println("Perimetro: "+lado*4+" cm");
        System.out.println("");
    }


}
