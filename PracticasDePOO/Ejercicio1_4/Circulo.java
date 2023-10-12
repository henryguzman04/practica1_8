package Ejercicio1_4;

public class Circulo {
    float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public void AreayPerimetroCirculo(){
        System.out.println("Perimetro: "+(2*Math.PI*radio)+" cm");
        System.out.println("Area: "+(Math.PI*Math.pow(radio,2))+" cm2");
        System.out.println("");
    }

}
