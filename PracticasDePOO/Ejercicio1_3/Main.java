package Ejercicio1_3;

public class Main {
    public static void main(String[] args) {
        Auto car = new Auto("Ford","Axel",2015,4,5,190, Auto.tipoCombustible.gasolina, Auto.tipoAuto.SUV,Auto.tipoColor.azul,false);
        car.imprimirDatos();
        System.out.println("----------------------");
        car.acelerar(180);
        System.out.println("Velocidad actual: "+car.velocidadActual+" Km/s");
        System.out.println("Acelerando 20 km/s");
        car.acelerar(20);
        System.out.println("Velocidad actual: "+car.velocidadActual+" Km/s");
        System.out.println("Desacelerando 50 Km/s");
        car.desacelerar(50);
        System.out.println("Velocidad actual: "+car.velocidadActual+" Km/s");
        System.out.println("Frenando");
        car.freno();
        System.out.println("Velocidad actual: "+car.velocidadActual+ " Km/s");
        System.out.println("----------------------");
        car.saberMultas();
        car.pagoMultas();
    }

}
