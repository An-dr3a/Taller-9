package Ejercicio01_Recuperacion;

public abstract class Presentacion {

    public String titulo;
    public double duracion;
    public double costoBase;
    public double aforo;
    public RecursosTecnicos presupuesto;

    public Presentacion(String titulo, double duracion, double costoBase, double aforo, RecursosTecnicos presupuesto) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.costoBase = costoBase;
        this.aforo = aforo;
        this.presupuesto = presupuesto;
        calcularCBase();
    }

    public Presentacion(String titulo, double duracion, double aforo, RecursosTecnicos presupuesto) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.aforo = aforo;
        this.presupuesto = presupuesto;
    }

    public void calcularCBase() {
        double recursos = presupuesto.calcularTotal();
        if (recursos > 0) {
            costoBase = aforo / recursos;
        } else {
            costoBase = 0;
        }
    }

    public abstract double calcularCostoFinal();

}
