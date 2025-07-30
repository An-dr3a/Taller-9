package Ejercicio01_Recuperacion;

public class Musical extends Presentacion {

    public int limAforo;

    public Musical(int limAforo, String titulo, double duracion, double aforo, RecursosTecnicos presupuesto) {
        super(titulo, duracion, aforo, presupuesto);
        this.limAforo = 500;
    }

    @Override
    public double calcularCostoFinal() {

        double costoFinal;

        if (aforo >= limAforo) {
            costoFinal = costoBase + (duracion * 0.08) + (aforo * 0.05);
        } else {
            costoFinal = costoBase + (duracion * 0.08) + (aforo * 0.01);
        }
        return costoFinal;
    }

    @Override
    public String toString() {
        return "Musical{" + "limAforo=" + limAforo + '}';
    }
    
}
