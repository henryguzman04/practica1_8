package Ejercicio1_4;

public class Triangulo {
    float lado_1,lado_2,AP;

    public Triangulo(float lado_1, float lado_2) {
        this.lado_1 = lado_1;
        this.lado_2 = lado_2;
    }
    public void AreaPerimetroHipTriangulo(){
        AP= (float) Math.sqrt(Math.pow(lado_1,2)+Math.pow(lado_2,2));
        System.out.println("Area: "+(lado_1*lado_2)/2+" cm2");
        System.out.println("Perimetro: "+(lado_1+lado_2+AP)+" cm");
        System.out.println("Hipotenusa: "+AP+" cm");

    }
    void tipoTriangulo(){
        if(lado_1==lado_2 && lado_2==AP){
            System.out.println("El triangulo es equilatero");
        }else if(lado_1 == lado_2 || lado_1 == AP || lado_2 == AP){
            System.out.println("El triangulo es isoceles");
        }else if(lado_1 != lado_2 && lado_1 != AP && lado_2 != AP){
            System.out.println("El triangulo es escaleno");
            System.out.println("");
        }
    }
}
