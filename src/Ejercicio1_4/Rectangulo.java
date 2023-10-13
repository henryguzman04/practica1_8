package Ejercicio1_4;

public class Rectangulo {
    float base, altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    public void AreayPerimetroRectangulo(){
        System.out.println("Perimetro:" + 2*(base+altura)+" cm");
        System.out.println("Area: "+ base*altura+" cm2");
        System.out.println("");
    }
}
