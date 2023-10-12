package Ejercicio1_3;public class Auto {
    String marca,motor;
    boolean automatico;
    int modelo,puertas,asientos,velocidadMax;
    int numMultas= 0;
    int multas = 1000;
    double velocidadActual = 0;
    enum tipoCombustible{gasolina, bioetanol, diesel, biodiesel, gas_natural}
    tipoCombustible tipoComb;
    enum tipoAuto{carro_de_ciudad, subcompacto, compacto, familiar, ejecutivo, SUV}
    tipoAuto tipoCar;
    enum tipoColor{blanco, negro, rojo, naranja, amarillo, verde, azul, violeta}
    tipoColor color;

    public Auto(String marca, String motor, int modelo, int puertas, int asientos, int velocidadMax, tipoCombustible tipoComb, tipoAuto tipoCar, tipoColor color,boolean automatico) {
        this.marca = marca;
        this.motor = motor;
        this.modelo = modelo;
        this.puertas = puertas;
        this.asientos = asientos;
        this.velocidadMax = velocidadMax;
        this.tipoComb = tipoComb;
        this.tipoCar = tipoCar;
        this.color = color;
        this.automatico = automatico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public tipoCombustible getTipoComb() {
        return tipoComb;
    }

    public void setTipoComb(tipoCombustible tipoComb) {
        this.tipoComb = tipoComb;
    }

    public tipoAuto getTipoCar() {
        return tipoCar;
    }

    public void setTipoCar(tipoAuto tipoCar) {
        this.tipoCar = tipoCar;
    }

    public tipoColor getColor() {
        return color;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    void acelerar(int aceleraNum){
        if(velocidadActual+aceleraNum > velocidadMax){
            System.out.println("Se recibio una multa por intentar superar la velocidad maxima");
            numMultas=+1;
        }else{
            velocidadActual=velocidadActual+aceleraNum;
        }
    }
    void desacelerar(int desaceleraNum){
        if(velocidadActual-desaceleraNum>0){
            velocidadActual -= desaceleraNum;
        }else{
            System.out.println("No puedes desacelerar a velocidades menor a 0");
        }
    }
    void freno(){
        velocidadActual = 0;
    }

    double tiempoLlegada (int distancia){
        return distancia/velocidadActual;
    }

    void imprimirDatos(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Motor: "+motor);
        System.out.println("Cantidad de puertas: "+puertas);
        System.out.println("Cantidad de asientos: "+asientos);
        System.out.println("Tipo de combustible: "+tipoComb);
        System.out.println("Tipo de auto: "+tipoCar);
        System.out.println("Color: "+color);
        System.out.println("Velocidad maxima: "+velocidadMax);
        System.out.println("Automatico: "+automatico);
    }
    void saberMultas(){
        if (numMultas>0){
            System.out.println("Su auto tiene "+numMultas+" multa(s) por pagar");
        }else{
            System.out.println("Su auto no tiene multas por pagar");
        }
    }
    void pagoMultas(){
        if (numMultas>0){
            System.out.println("Cada multa por exceso de velocidad es 1000 Bs.");
            System.out.println("Usted tiene multas por un valor de: "+multas*numMultas);
        }
    }
}
