package Ejercicio02_Recuperacion;

public class Situ extends Movilidad{
    public boolean descuento;

    public Situ(boolean descuentoAplicado) {
        super("Situ", "CEDIA", 0.0);
        this.descuento = descuentoAplicado;
    }

    @Override
    public double calcularCosto() {
        
        return descuento ? tBase * 0.5 : tBase;
        
    }

    @Override
    public String toString() {
        return "Situ{" + "descuento=" + descuento + '}';
    }
    
    
}
