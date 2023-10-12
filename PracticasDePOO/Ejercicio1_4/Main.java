package Ejercicio1_4;

public class Main {
    public static void main(String[] args) {
        Circulo circle = new Circulo(5);
        Rectangulo rectangle = new Rectangulo(5,2);
        Triangulo triangle = new Triangulo(2,7);
        Cuadrado square = new Cuadrado(4);


        System.out.println("Area y perimetro del circulo");
        circle.AreayPerimetroCirculo();
        System.out.println("Area y perimetro del rectangulo");
        rectangle.AreayPerimetroRectangulo();
        System.out.println("Area y perimetro del triangulo");
        triangle.AreaPerimetroHipTriangulo();
        triangle.tipoTriangulo();
        System.out.println("Area y perimetro del cuadrado");
        square.AreaYPerimetroCuadrado();
    }
}
