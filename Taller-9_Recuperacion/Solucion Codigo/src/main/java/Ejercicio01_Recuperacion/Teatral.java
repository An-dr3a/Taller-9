package Ejercicio01_Recuperacion;

public class Teatral extends Presentacion {

    public Teatral(String titulo, double duracion, double aforo, RecursosTecnicos presupuesto) {
        super(titulo, duracion, aforo, presupuesto);
    }

    @Override
    public double calcularCostoFinal() {

        return (costoBase * 1.1) + (duracion * 0.05);

    }

}
