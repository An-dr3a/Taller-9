package Ejercicio01_Recuperacion;

public class RecursosTecnicos {

    public double sonido;
    public double iluminacion;
    public double escenografia;

    public RecursosTecnicos(double sonido, double iluminacion, double escenografia) {
        this.sonido = sonido;
        this.iluminacion = iluminacion;
        this.escenografia = escenografia;
    }

    public double calcularTotal() {

        return sonido + iluminacion + escenografia;

    }
}
