package Ejercicio02_Recuperacion;


public class KTaxi extends Movilidad {
    public double kmRecor;
    public int min;

    public KTaxi(double kmRecor, int min) {
        super("KTaxi", "KRADAC", 1.25);
        this.kmRecor = kmRecor;
        this.min = min;
    }

    @Override
    public double calcularCosto() {
        return tBase * kmRecor + (min * 0.10);
    }

    @Override
    public String toString() {
        return "KTaxi{" + "kmRecor=" + kmRecor + ", min=" + min + '}';
    }
       
}
