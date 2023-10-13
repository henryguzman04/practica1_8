package Ejercicio1_5;
import java.util.*;
public class Cuenta {
    String nombre_Titular, apellido_Titular;
    enum cuenta{AHORRO,CORRIENTE}
    cuenta tipoCuenta;
    int numero_de_Cuenta;
    float saldo_de_Cuenta = 0;

    //Constructor//

    public Cuenta(String nombre_Titular, String apellido_Titular,cuenta tipoCuenta, int numero_de_Cuenta) {
        this.nombre_Titular = nombre_Titular;
        this.apellido_Titular = apellido_Titular;
        this.tipoCuenta = tipoCuenta;
        this.numero_de_Cuenta = numero_de_Cuenta;
    }

    //Metodos//

    public void imprimir(){
        System.out.println("Nombre de titular: "+nombre_Titular);
        System.out.println("Apellido de titular: "+apellido_Titular);
        System.out.println("Numero de cuenta: "+numero_de_Cuenta);
        System.out.println("Tipo de cuenta: "+tipoCuenta);
        System.out.println("Saldo: Bs. "+saldo_de_Cuenta);
    }
    public void saldo(){
        System.out.println("Saldo: Bs. "+saldo_de_Cuenta);
    }
    public void deposito(){
        float valor_Deposito;
        System.out.println("Ingrese la cantidad que desea depositar");
        Scanner sc = new Scanner(System.in);
        valor_Deposito = sc.nextFloat();
        if (valor_Deposito>0) {
            saldo_de_Cuenta += valor_Deposito;
            System.out.println("Monto depositado correctamente");
        }else{
            System.out.println("El monto a depositar tiene que ser mayor a 0 Bs.");
        }
    }
    public void retiro(){
        float valor_retiro;
        System.out.println("Ingrese la cantidad que desea retirar");
        Scanner sc = new Scanner(System.in);
        valor_retiro = sc.nextFloat();
        if (valor_retiro > 0 &&  valor_retiro <= saldo_de_Cuenta) {
            saldo_de_Cuenta -= valor_retiro;
            System.out.println("Retiro realizado correctamente");
        }else{
            System.out.println("No es posible retirar esa cantidad de dinero de la cuenta");
        }

    }
    public void calcInt(){
        double Interes = (0.3*saldo_de_Cuenta)/100;
        System.out.println("Interes de la cuenta: 0.3% anual");
        System.out.println("Ganancias anuales con dinero actual: Bs. "+Interes);
        System.out.println("Ganancias mensuales con dinero actual: Bs. "+(Interes/12));
    }
}
