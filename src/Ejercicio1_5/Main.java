package Ejercicio1_5;
import  java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Cuenta cuenta = new Cuenta("Juancho","Guey", Cuenta.cuenta.CORRIENTE,123456);
            int opcion;
            do {
                System.out.println("Elija un numero de opcion para ejecutar...");
                System.out.println("Mostrar cuenta (1)");
                System.out.println("Anadir saldo (2)");
                System.out.println("Retirar saldo (3)");
                System.out.println("Mostrar saldo (4)");
                System.out.println("Mostrar ganancias de interes (5)");
                System.out.println("Salir (6)");
                opcion = sc.nextInt();
                System.out.println("------------------");
                if (opcion == 1){
                    cuenta.imprimir();
                    System.out.println("--------------------");
                }
                if (opcion == 2){
                    cuenta.deposito();
                    System.out.println("--------------------");
                }if (opcion == 3){
                    cuenta.retiro();
                    System.out.println("--------------------");
                }if (opcion == 4){
                    cuenta.saldo();
                    System.out.println("--------------------");
                }if (opcion == 5){
                    cuenta.calcInt();
                    System.out.println("--------------------");
                }

            }while (opcion != 6);
        System.out.println("Proceso finalizado, tenga buen dia!!!");

    }
}
