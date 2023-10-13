package Ejercicio1_6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = new Cuenta("Juancho","Guey", Cuenta.cuenta.CORRIENTE,123456);
        Cuenta cuenta2 = new Cuenta("Pablo","Mamani", Cuenta.cuenta.AHORRO,1669181);
        int opcion;
        do {
            System.out.println("Elija un numero de opcion para ejecutar...");
            System.out.println("Mostrar cuenta (1)");
            System.out.println("Anadir saldo (2)");
            System.out.println("Retirar saldo (3)");
            System.out.println("Mostrar saldo (4)");
            System.out.println("Mostrar ganancias de interes (5)");
            System.out.println("Comparar cuentas (6)");
            System.out.println("Transferir dinero de la cuenta 1 a la cuenta 2 (7)");
            System.out.println("Estado de las cuentas (8)");
            System.out.println("Salir (9)");
            opcion = sc.nextInt();
            System.out.println("--------------------");
            if (opcion == 1){
                cuenta.imprimir();
                System.out.println("--------------------");
            }
            if (opcion == 2){
                float valor_Deposito;
                System.out.println("Ingrese la cantidad que desea depositar");
                valor_Deposito = sc.nextFloat();
                cuenta.deposito(valor_Deposito);
                System.out.println("--------------------");
            }if (opcion == 3){
                System.out.println("Ingrese la cantidad que desea retirar");
                float valor_retiro = sc.nextFloat();
                cuenta.retiro(valor_retiro);
                System.out.println("--------------------");
            }if (opcion == 4){
                cuenta.saldo();
                System.out.println("--------------------");
            }if (opcion == 5){
                cuenta.calcInt();
                System.out.println("--------------------");
            }if (opcion == 6){
                System.out.println("Comparando 2 cuentas");
                System.out.println("Saldo cuenta 1: "+cuenta.saldo_de_Cuenta+" Bs.");
                System.out.println("Saldo cuenta 2: "+cuenta2.saldo_de_Cuenta+" Bs.");
            }if (opcion == 7) {
                cuenta.compararCuenta(cuenta2);
                System.out.println("Que valor desea depositar a la cuenta 2?");
                float valor = sc.nextFloat();
                cuenta.transferencia(cuenta2, valor);
            }if (opcion == 8) {
                cuenta.estadoCuenta(cuenta);
                cuenta.estadoCuenta2(cuenta2);
                System.out.println("--------------------");
            }
        }while (opcion != 9);
        System.out.println("Proceso finalizado, tenga buen dia!!!");
    }

}

