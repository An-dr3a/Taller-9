package Ejercicio02_Recuperacion;

public class BusesUTPL extends Movilidad {

    public boolean esUTPL;

    public BusesUTPL(boolean esUTPL) {
        super("BusesUTPL", "UTPL", 0.0);
        this.esUTPL = esUTPL;
    }

    @Override
    public double calcularCosto() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "BusesUTPL{" + "esUTPL=" + esUTPL + '}';
    }

}
