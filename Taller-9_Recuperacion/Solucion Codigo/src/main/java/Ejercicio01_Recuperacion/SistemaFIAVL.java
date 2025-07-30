package Ejercicio01_Recuperacion;

import java.util.ArrayList;

public class SistemaFIAVL {

    public static void main(String args) {

        ArrayList<Presentacion> presentaciones = new ArrayList<>();
        RecursosTecnicos recursosT1 = new RecursosTecnicos(500.0, 300.0, 700.0);
        Musical musical = new Musical(500, "Concierto de Jazz", 90, 600, recursosT1);
        presentaciones.add(musical);

        RecursosTecnicos recursosT2 = new RecursosTecnicos(200.0, 150.0, 250.0);
        Presentacion teatral = new Teatral("Obra Dramática", 120, 350, recursosT2);
        presentaciones.add(teatral);

        System.out.println("REPORTE PRESENTACIONES ARTES VIVAS");
        for (Presentacion p : presentaciones) {
            System.out.println("Título: " + p.titulo);
            System.out.println("Duración: " + p.duracion + " minutos");
            System.out.println("Aforo: " + p.aforo);
            System.out.println("Costo Base: $" + String.format("%.2f", p.costoBase));
            System.out.println("Costo Final: $" + String.format("%.2f", p.calcularCostoFinal()));
            System.out.println("Recursos técnicos: " + p.presupuesto);
        }
    }
}
