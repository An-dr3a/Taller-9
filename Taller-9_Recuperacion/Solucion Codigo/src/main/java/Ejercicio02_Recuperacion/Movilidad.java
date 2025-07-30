package Ejercicio02_Recuperacion;

public abstract class Movilidad {

    public String nomServicio;
    public String empresa;
    public double tBase;

    public Movilidad(String nomServicio, String empresa, double tBase) {
        this.nomServicio = nomServicio;
        this.empresa = empresa;
        this.tBase = tBase;
    }

    public String generarFactura(Usuario u) {
        return "FACTURA\n"
                + "Cliente: " + u + "\n"
                + "Empresa: " + empresa + "\n"
                + "Servicio: " + nomServicio + "\n"
                + "Costo total: $" + String.format("%.2f", calcularCosto()) + "\n";
    }

    public void calificarServicio(int est) {
        System.out.println("Calificacion registrada: " + est + " estrellas.");
    }

    public abstract double calcularCosto();
}
