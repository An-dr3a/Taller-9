package Ejercicio02_Recuperacion;

public class Ejercicio02 {

    public static void main(String[] args) {
        SistemaMovilidad sistema = new SistemaMovilidad();

        Usuario u1 = new Usuario("Ana Loja", "1101122334", "Estudiante");
        Usuario u2 = new Usuario("Carlos Perez", "1100988776", "Publico");
        Usuario u3 = new Usuario("Dra. Rosas", "1100554321", "Docente");

        sistema.registrarUsuario(u1);
        sistema.registrarUsuario(u2);
        sistema.registrarUsuario(u3);

        Movilidad s1 = new KTaxi(5.0, 12);
        Movilidad s2 = new Situ(true);
        Movilidad s3 = new BusesUTPL(true);

        sistema.agregarServicio(s1);
        sistema.agregarServicio(s2);
        sistema.agregarServicio(s3);

        sistema.mostrarFacturas();
    }
}
